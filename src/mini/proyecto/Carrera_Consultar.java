/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mini.proyecto;

import clases.Carrera;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import mini.proyecto.MiniProyecto;

/**
 *
 * @author IV
 */
public class Carrera_Consultar extends javax.swing.JFrame {

    /**
     * Creates new form Carrera_Consultar
     */
    public Carrera_Consultar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Consulta de Carrera");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCarrera = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jCBfiltro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoC = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Consultar y eliminar Carrera");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 340, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 110, 50));

        jtCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Duracion", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtCarrera);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 540, 130));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Filtro:");
        jLabel4.setToolTipText("Filtro de busqueda");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jCBfiltro.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jCBfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opci??n", "Ver todos", "Codigo carrera", "Nombre", "Duracion", " " }));
        jCBfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBfiltroActionPerformed(evt);
            }
        });
        jPanel1.add(jCBfiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));
        jPanel1.add(txtCodigoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 110, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        this.dispose();
        MiniProyecto m = new MiniProyecto();
        m.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        Filtro(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jCBfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBfiltroActionPerformed

    }//GEN-LAST:event_jCBfiltroActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        Eliminar_Carrera(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_btnEliminarActionPerformed
    public void Filtro(ObjectContainer basep) {
        
        if (jCBfiltro.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion");
        } else {

            if (jCBfiltro.getSelectedIndex() == 1) {
                Carrera Abuscar = new Carrera(null, null, null,null);
                ObjectSet result = basep.get(Abuscar);
                MostrarDatos(result);

            } else {
                if (jCBfiltro.getSelectedIndex() == 2) {
                    String cod_car = JOptionPane.showInputDialog("Ingrese el codigo a consultar");
                    Carrera Abuscar = new Carrera(cod_car,null,null,null);
                    ObjectSet result = basep.get(Abuscar);
                    MostrarDatos(result);

                } else {
                    if (jCBfiltro.getSelectedIndex() == 3) {
                        String nombre_car = JOptionPane.showInputDialog("Ingrese el nombre de la carrera a consultar");
                        Carrera Abuscar = new Carrera(null, nombre_car,null,null);
                        ObjectSet result = basep.get(Abuscar);
                        MostrarDatos(result);

                    } else {
                        if (jCBfiltro.getSelectedIndex() == 4) {
                            String duracion = JOptionPane.showInputDialog("Ingrese la duracion de la carrera que desea a consultar");
                                Carrera Abuscar = new Carrera(null, null, duracion,null);
                                ObjectSet result = basep.get(Abuscar);
                                MostrarDatos(result);
                            

                        }
                    }
                }
            }
        }

        //Borrar la eleccion y ponerla al inicio
        jCBfiltro.setSelectedIndex(0);
    }
    public void MostrarDatos(ObjectSet result) {
        String matrizasignatura[][] = new String[result.size()][4];

        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "La carrera no existe");
        } else {
            for (int i = 0; i < result.size(); i++) {
                Carrera miA = new Carrera();

                miA = (Carrera) result.get(i);
                matrizasignatura[i][0] = miA.getCod_car();
                matrizasignatura[i][1] = miA.getNombre_car();
                matrizasignatura[i][2] = miA.getDuracion_car();
                matrizasignatura[i][3] = miA.getDescripcion();

                jtCarrera.setModel(new javax.swing.table.DefaultTableModel(matrizasignatura, new String[]{"Codigo", "Nombre", "Duracion","Descripcion"}));

            }
        }

    }
    public void Eliminar_Carrera(ObjectContainer basep) {
        V_Carrera Ainterfaz = new V_Carrera();
        if (txtCodigoC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un Codigo");
        } else {

            String IDA = txtCodigoC.getText();
            Carrera Abuscar = new Carrera(IDA, null,null,null);
            ObjectSet result = basep.get(Abuscar);

            if (Ainterfaz.Comprobar_Carrera(basep, IDA) == 0) {
                JOptionPane.showMessageDialog(null, "La carrera no existe en la base de datos");

            } else {
                Carrera AsignaturaElim = (Carrera) result.next();
                basep.delete(AsignaturaElim);
                JOptionPane.showMessageDialog(null, "La carrera fue eliminada correctamente");
            }

        }

        //Borrar el campo de texto
        txtCodigoC.setText("");
    }
    public void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Carrera_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Carrera_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Carrera_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Carrera_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Carrera_Consultar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> jCBfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCarrera;
    private javax.swing.JTextField txtCodigoC;
    // End of variables declaration//GEN-END:variables
}
