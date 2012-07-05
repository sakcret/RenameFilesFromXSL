/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package renamefilesfromxsl;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sakcret
 */
public class VentanaPrincipal extends javax.swing.JFrame implements PropertyChangeListener {

    private String ruta_destino, ruta_origen, ruta_xls;
    Task tarea;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        ruta_destino = "/Users/sakcret/prueba";
        ruta_origen = "/Users/sakcret/fotos";
        ruta_xls = "/Users/sakcret/renombra0.xls";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        p_nombre_xls = new javax.swing.JPanel();
        t_ruta_xsl = new javax.swing.JTextField();
        b_ruta_xls = new javax.swing.JButton();
        l_ruta_xls = new javax.swing.JLabel();
        p_rutas = new javax.swing.JPanel();
        t_ruta_origen = new javax.swing.JTextField();
        b_ruta_destino = new javax.swing.JButton();
        t_ruta_destino = new javax.swing.JTextField();
        b_ruta_origen = new javax.swing.JButton();
        l_ruta_destino = new javax.swing.JLabel();
        l_ruta_origen = new javax.swing.JLabel();
        pb_progreso = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_logs = new javax.swing.JTextArea();
        chb_detalles = new javax.swing.JCheckBox();
        b_renombrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_principal = new javax.swing.JMenu();
        mi_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mi_ayuda = new javax.swing.JMenuItem();
        mi_acercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rename File from XLS v1.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        p_nombre_xls.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona la hoja de calculo con la relación de nombres (.xls) ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        t_ruta_xsl.setEditable(false);

        b_ruta_xls.setText("...");
        b_ruta_xls.setToolTipText("Selecciona Ruta Origen");
        b_ruta_xls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ruta_xlsActionPerformed(evt);
            }
        });

        l_ruta_xls.setText("Selecciona archivo:");

        org.jdesktop.layout.GroupLayout p_nombre_xlsLayout = new org.jdesktop.layout.GroupLayout(p_nombre_xls);
        p_nombre_xls.setLayout(p_nombre_xlsLayout);
        p_nombre_xlsLayout.setHorizontalGroup(
            p_nombre_xlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p_nombre_xlsLayout.createSequentialGroup()
                .add(26, 26, 26)
                .add(l_ruta_xls, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 28, Short.MAX_VALUE)
                .add(t_ruta_xsl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 582, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(b_ruta_xls, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(9, 9, 9))
        );
        p_nombre_xlsLayout.setVerticalGroup(
            p_nombre_xlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p_nombre_xlsLayout.createSequentialGroup()
                .addContainerGap()
                .add(p_nombre_xlsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(b_ruta_xls, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(l_ruta_xls)
                    .add(t_ruta_xsl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        p_rutas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona Rutas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        t_ruta_origen.setEditable(false);

        b_ruta_destino.setText("...");
        b_ruta_destino.setToolTipText("Selecciona Ruta Origen");
        b_ruta_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ruta_destinoActionPerformed(evt);
            }
        });

        t_ruta_destino.setEditable(false);

        b_ruta_origen.setText("...");
        b_ruta_origen.setToolTipText("Selecciona Ruta Origen");
        b_ruta_origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ruta_origenActionPerformed(evt);
            }
        });

        l_ruta_destino.setText("Selecciona Ruta Destino:");

        l_ruta_origen.setText("Selecciona Ruta Origen:");

        org.jdesktop.layout.GroupLayout p_rutasLayout = new org.jdesktop.layout.GroupLayout(p_rutas);
        p_rutas.setLayout(p_rutasLayout);
        p_rutasLayout.setHorizontalGroup(
            p_rutasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, p_rutasLayout.createSequentialGroup()
                .add(22, 22, 22)
                .add(p_rutasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(l_ruta_destino, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(l_ruta_origen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 27, Short.MAX_VALUE)
                .add(p_rutasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(t_ruta_origen, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .add(t_ruta_destino))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(p_rutasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, b_ruta_origen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, b_ruta_destino, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p_rutasLayout.setVerticalGroup(
            p_rutasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(p_rutasLayout.createSequentialGroup()
                .addContainerGap()
                .add(p_rutasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(t_ruta_origen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(b_ruta_origen)
                    .add(l_ruta_origen))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(p_rutasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(t_ruta_destino, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(b_ruta_destino)
                    .add(l_ruta_destino))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pb_progreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pb_progreso.setPreferredSize(new java.awt.Dimension(146, 30));
        pb_progreso.setRequestFocusEnabled(false);
        pb_progreso.setStringPainted(true);

        ta_logs.setColumns(20);
        ta_logs.setEditable(false);
        ta_logs.setRows(5);
        ta_logs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(ta_logs);

        chb_detalles.setText("Ocultar detalles...");
        chb_detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_detallesActionPerformed(evt);
            }
        });

        b_renombrar.setText("Renombrar");
        b_renombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_renombrarActionPerformed(evt);
            }
        });

        menu_principal.setText("Archivo");

        mi_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        mi_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir.png"))); // NOI18N
        mi_salir.setText("Salir");
        mi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_salirActionPerformed(evt);
            }
        });
        menu_principal.add(mi_salir);

        jMenuBar1.add(menu_principal);

        jMenu2.setText("Ayuda");

        mi_ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        mi_ayuda.setText("Ayuda");
        mi_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_ayudaActionPerformed(evt);
            }
        });
        jMenu2.add(mi_ayuda);

        mi_acercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/acercade.png"))); // NOI18N
        mi_acercade.setText("Acerca de...");
        mi_acercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_acercadeActionPerformed(evt);
            }
        });
        jMenu2.add(mi_acercade);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(b_renombrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(chb_detalles)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, pb_progreso, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)))
                    .add(p_rutas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(p_nombre_xls, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(p_nombre_xls, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(p_rutas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(pb_progreso, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .add(b_renombrar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(chb_detalles)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .add(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mi_salirActionPerformed

    private void b_ruta_xlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ruta_xlsActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecciona archivo");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("Archivos de Excel .xls", "xls");
        chooser.setFileFilter(filtroImagen);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            ruta_xls = chooser.getSelectedFile().toString();
            t_ruta_xsl.setText(ruta_xls);
        }
    }//GEN-LAST:event_b_ruta_xlsActionPerformed

    private void b_ruta_origenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ruta_origenActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecciona Carpeta a Origen");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            ruta_origen = chooser.getSelectedFile().toString();
            t_ruta_origen.setText(ruta_origen);
            if (Utilerias.directorioVacio(ruta_origen)) {
                JOptionPane.showMessageDialog(null, "La carpeta está vacia. \n Por lo tanto no se procesará ningun archivo...", "Warning !!! Directorio vacio", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_b_ruta_origenActionPerformed

    private void b_ruta_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ruta_destinoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecciona Carpeta a Destino");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            ruta_destino = chooser.getSelectedFile().toString();
            t_ruta_destino.setText(ruta_destino);
            /*
             * if (!Utilerias.directorioVacio(ruta_destino)) {
             * JOptionPane.showMessageDialog(null, "La carpeta no está vacia.
             * \nSi cre que representa una amenaza para el contenido de la
             * carpeta \nseleccione otra...", "Directorio no vacio",
             * JOptionPane.WARNING_MESSAGE); }
             */
        }
    }//GEN-LAST:event_b_ruta_destinoActionPerformed

    private void chb_detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_detallesActionPerformed
        boolean activo = this.chb_detalles.isSelected();
        if (activo == true) {
            this.chb_detalles.setText("Mostrar detalles...");
            this.ta_logs.setVisible(false);
            
        } else {
            this.chb_detalles.setText("Ocultar detalles...");
            this.ta_logs.setVisible(true);
        }
    }//GEN-LAST:event_chb_detallesActionPerformed

    private void b_renombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_renombrarActionPerformed
        String faltan_esto = "Proporciona los siguientes datos: \n\n";
        boolean faltan = false;
        if (Utilerias.textVacio(t_ruta_xsl)) {
            faltan_esto += "- Archivo de excel con la asociación de nombres.\n";
            faltan = true;
        }
        if (Utilerias.textVacio(t_ruta_origen)) {
            faltan_esto += "- Directorio Fuente.\n";
            faltan = true;
        }
        if (Utilerias.textVacio(t_ruta_destino)) {
            faltan_esto += "- Directorio Destino.\n";
            faltan = true;
        }
        if (faltan) {
            JOptionPane.showMessageDialog(null, faltan_esto, "Completa datos", JOptionPane.WARNING_MESSAGE);
            faltan_esto = "Proporciona los siguientes datos: \n\n";
            faltan = false;
        } else {
            if (t_ruta_origen.getText().equals(t_ruta_destino.getText())) {
                JOptionPane.showMessageDialog(null, "La ruta origen no puede ser la misma que la ruta destino.", "Rutas iguales", JOptionPane.WARNING_MESSAGE);
            } else {
                tarea = new Task();
                tarea.setRuta_xls(this.t_ruta_xsl.getText());
                tarea.setRuta_origen(this.t_ruta_origen.getText());
                tarea.setRuta_destino(this.t_ruta_destino.getText());
                tarea.setTa_logs(ta_logs);
                b_renombrar.setEnabled(false);
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                tarea.addPropertyChangeListener(this);//agregamos PropertyChangeListener a la tarea para saber su progreso
                tarea.execute();
            }
        }


    }//GEN-LAST:event_b_renombrarActionPerformed

    private void mi_acercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_acercadeActionPerformed
         JOptionPane.showMessageDialog(null, "Acerca de Rename File from XLS\n Version 1.0\n Desarrollado por: José Adrian Ruiz Carmona\n sakcret@gmail.com", "Acerca de Rename File from XLS", JOptionPane.INFORMATION_MESSAGE);     
    }//GEN-LAST:event_mi_acercadeActionPerformed

    private void mi_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_ayudaActionPerformed
       new VentanaAyuda().setVisible(true);
    }//GEN-LAST:event_mi_ayudaActionPerformed

     /**
     * Metodo necesario para implementar la interfaz PropertyChangeListener el
     * cual me permite cambiar el progreso de la ProgressBar con respecto al
     * progreso de la tarea
     */
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            pb_progreso.setValue(progress);
            if (pb_progreso.getValue() == 100) {
                this.b_renombrar.setEnabled(true);
                setCursor(null);
            }

            /*
             * if (taskOutput != null) { taskOutput.append(String.format(" %d%%
             * Completo.\n", task.getProgress()));
            }
             */
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_renombrar;
    private javax.swing.JButton b_ruta_destino;
    private javax.swing.JButton b_ruta_origen;
    private javax.swing.JButton b_ruta_xls;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chb_detalles;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_ruta_destino;
    private javax.swing.JLabel l_ruta_origen;
    private javax.swing.JLabel l_ruta_xls;
    private javax.swing.JMenu menu_principal;
    private javax.swing.JMenuItem mi_acercade;
    private javax.swing.JMenuItem mi_ayuda;
    private javax.swing.JMenuItem mi_salir;
    private javax.swing.JPanel p_nombre_xls;
    private javax.swing.JPanel p_rutas;
    private javax.swing.JProgressBar pb_progreso;
    private javax.swing.JTextField t_ruta_destino;
    private javax.swing.JTextField t_ruta_origen;
    private javax.swing.JTextField t_ruta_xsl;
    private javax.swing.JTextArea ta_logs;
    // End of variables declaration//GEN-END:variables
}