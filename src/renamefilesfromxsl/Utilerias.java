package renamefilesfromxsl;

import java.io.*;
import javax.swing.JTextField;
import jxl.Sheet;
import jxl.Workbook;

public abstract class Utilerias {

    public static String quitaExtension(String cadext) {
        return cadext.substring(0, cadext.lastIndexOf("."));
    }

    //****Operaciones con cadenas***** busca en la cadena1 la cadena2 si laencuentra devuelvetrue
    public static boolean buscaCadena(String cad1, String cad2) {
        if (cad1.indexOf(cad2) != -1) {
            return true;//se encontro la cadena
        } else {
            return false;
        }
    }

//****operaciones con directorios**** verificar si un directorio esta vacio de ser asi regresa true
    public static boolean directorioVacio(String ruta) {
        File dir = new File(ruta);
        String[] ficheros = dir.list();
        if (ficheros == null) {
            return true;
        } else {
            return false;
        }
    }

    //****Operaciones con arhivos****
    public static boolean copiaArchivo(String origen, String destino) {
        boolean sepudo = false;
        try {
            InputStream inFile = new FileInputStream(origen);
            OutputStream outFile = new FileOutputStream(destino);
            byte[] buf = new byte[1024];
            int len;
            while ((len = inFile.read(buf)) > 0) {
                outFile.write(buf, 0, len);
            }
            inFile.close();
            outFile.close();
            sepudo = true;
        } catch (IOException e) {
            sepudo = false;
        }
        return sepudo;
    }
    //**** validacion de formularios****

    public static boolean textVacio(JTextField text) {
        if (text.getText().equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public static int existeCadenaArray2(String cadena, String[][] arreglo) {
        int filas = arreglo.length;
        int columnas = arreglo[ 0].length;
        int result = -1;
        boolean encontrado = false;
        for (int fila = 0; fila < filas; fila++) {
            if (encontrado) {
                break;
            }
            for (int columna = 0; columna < columnas; columna++) {
                if (cadena.equals(arreglo[fila][columna])) {
                    result = fila;
                    encontrado = true;
                }
            }
        }
        return result;
    }
}
