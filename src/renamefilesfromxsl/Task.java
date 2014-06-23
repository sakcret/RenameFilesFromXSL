package renamefilesfromxsl;

import java.awt.Toolkit;
import java.io.File;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;
import jxl.Sheet;
import jxl.Workbook;

class Task extends SwingWorker<Void, Void> {

    private String ruta_destino, ruta_origen, ruta_xls = "";
    private String[][] nombres_xls = null;
    private JTextArea ta_logs;
    private boolean ver_logs = true;
    private boolean sonFirmas = true;
    /*
     * Main task. Executed in background thread.
     */

    @Override
    public Void doInBackground() {
        Random random = new Random();
        int progress = 0;
        //Inicializar el progreso de la tarea
        setProgress(0);
        renombra_fotos();
        return null;
    }

    /*
     * Al terminar la tarea entra al metodo done aque se sobreescribe
     */
    @Override
    public void done() {
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Tarea terminada con exito...");
    }

    static String[][] leerArchivoExcel(String archivoxsl) {
        String datos[][] = {};
        try {
            Workbook archivoExcel = Workbook.getWorkbook(new File(archivoxsl));
            for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++) // Recorre 
            // cada para cada hoja                                                                                                                                                     
            {
                Sheet hoja = archivoExcel.getSheet(sheetNo);
                int numColumnas = hoja.getColumns();
                int numFilas = hoja.getRows();
                datos = new String[numFilas][numColumnas];
                String data;
                for (int fila = 0; fila < numFilas; fila++) {
                    for (int columna = 0; columna < numColumnas; columna++) {
                        data = hoja.getCell(columna, fila).getContents();
                        datos[fila][columna] = data;

                    }
                }
            }
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
        return datos;
    }

    private void renombra_fotos() {
        if ((!ruta_origen.equals("")) && (!ruta_destino.equals("")) && (ruta_xls != null)) {
            nombres_xls = leerArchivoExcel(ruta_xls);
            File f = new File(ruta_origen);
            File[] ficheros = f.listFiles();
            int index = 0;
            for (int x = 0; x < ficheros.length; x++) {
                String rutafinal = "";
                String file_name = ficheros[x].getName();
                try {
                    //si es imagen .jpg
                    if (Utilerias.buscaCadena(ficheros[x].getName(), ".jpg")) {
                        String sin_extension = "";
                        String firma = "";
                        if (this.isSonFirmas()) {
                            sin_extension = Utilerias.quitaExtensionFirma(ficheros[x].getName());
                            firma = "F";
                        } else {
                            sin_extension = Utilerias.quitaExtension(ficheros[x].getName());
                        }
                        int pos = Utilerias.existeCadenaArray2(sin_extension, nombres_xls);
                        //System.out.println("pos---- " + pos + "index--");
                        if (pos != -1) {
                            String nombre_destino = nombres_xls[pos][1];
                            rutafinal = ruta_destino + "/" + nombre_destino;
                            if (Utilerias.copiaArchivo(ruta_origen + "/" + file_name, rutafinal + firma + ".jpg")) {
                                //System.out.println(nombres_xls[pos][1]);
                                index++;
                            }
                            if (pos + 1 != nombres_xls.length + 1) {
                                if (nombres_xls[pos][0].equals(nombres_xls[pos + 1][0])) {
                                    if (Utilerias.copiaArchivo(ruta_origen + "/" + file_name, ruta_destino + "/" + nombres_xls[pos + 1][1] + firma + ".jpg")) {
                                        //System.out.println(nombres_xls[pos + 1][1]);
                                        index++;
                                    }
                                }
                            }

                        } else {
                            //this.ta_logs.append( "------ERROR: No encontrado  " + ficheros[x].getName() + "\n");
                        }
                    } else {
                        //archivo no procesado ya que no es una imagen .jpg
                        this.ta_logs.append("------WARNING: El archivo " + file_name + " No fue procesado ya que no parece ser una imagen .jpg válida" + "\n");
                    }
                } catch (Exception e) {
                    //this.ta_logs.append("------ERROR:  " + e + "\n");
                }
                int progreso = (int) ((((float) x + 1) / (float) ficheros.length) * 100);
                setProgress(progreso);
            }
            this.ta_logs.append("Resultados: " + index + " archivos procesados de un total de " + nombres_xls.length + " archivos. \n");
        } else {
            setProgress(0);
            JOptionPane.showMessageDialog(null, "No se pudo realizar la tarea solicitada ya que faltan algunos datos.", "Error! Faltan Algunos datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void comprobar() {
        this.ta_logs.setText("Comprobando archivos no renombrados..."+"\n"+"Archivos no encontrados:"+"\n");
        String noEncontrados = "";
        if ((!ruta_origen.equals("")) && (!ruta_destino.equals("")) && (ruta_xls != null)) {
            nombres_xls = leerArchivoExcel(ruta_xls);
            File f = new File(ruta_destino);
            File[] ficheros = f.listFiles();
            String firma = "";
            int index = 0;
            if (this.isSonFirmas()) {
                firma = "F";
            }
            for (int x = 0; x < nombres_xls.length; x++) {
                String rutafinal = "";
                String file_name = nombres_xls[x][1];
                if (!Utilerias.buscarArchivo(ficheros, file_name +firma+ ".jpg")) {
                     this.ta_logs.append(file_name +firma+"\t"+nombres_xls[x][0]+"\n");
                }
            }
        }
    }
    ////////////////////////// Getter y Setter //////////////////////////////

    public String[][] getNombres_xls() {
        return nombres_xls;
    }

    public void setNombres_xls(String[][] nombres_xls) {
        this.nombres_xls = nombres_xls;
    }

    public String getRuta_destino() {
        return ruta_destino;
    }

    public void setRuta_destino(String ruta_destino) {
        this.ruta_destino = ruta_destino;
    }

    public String getRuta_origen() {
        return ruta_origen;
    }

    public void setRuta_origen(String ruta_origen) {
        this.ruta_origen = ruta_origen;
    }

    public String getRuta_xls() {
        return ruta_xls;
    }

    public void setRuta_xls(String ruta_xls) {
        this.ruta_xls = ruta_xls;
    }

    public JTextArea getTa_logs() {
        return ta_logs;
    }

    public void setTa_logs(JTextArea ta_logs) {
        this.ta_logs = ta_logs;
    }

    public boolean isVer_logs() {
        return ver_logs;
    }

    public void setVer_logs(boolean ver_logs) {
        this.ver_logs = ver_logs;
    }

    public boolean isSonFirmas() {
        return sonFirmas;
    }

    public void setSonFirmas(boolean sonFirmas) {
        this.sonFirmas = sonFirmas;
    }
}
