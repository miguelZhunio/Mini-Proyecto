/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerente;

import clases.Gerente;
import com.db4o.*;
import javax.swing.JOptionPane;
import mini.proyecto.MiniProyecto;

/**
 *
 * @author Usuario
 */
public class ModGer extends javax.swing.JFrame {
         String cedula = "";
         String nombre = "";
         String apellido= "";
         String Pais = "";
         String correo = "";
         String password= "";
         String gerencia = "";
    /**
     * Creates new form ModGer
     */
    public ModGer() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Modificar Gerente");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtcedu = new javax.swing.JTextField();
        Jlabel3 = new javax.swing.JLabel();
        camb = new javax.swing.JButton();
        Jlabel4 = new javax.swing.JLabel();
        Jlabel5 = new javax.swing.JLabel();
        Jlabel6 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtapell = new javax.swing.JTextField();
        txtcorr = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pais = new javax.swing.JComboBox<>();
        Gerencia = new javax.swing.JComboBox<>();

        jLabel18.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 153));
        jLabel18.setText("GERENCIA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Modificar Gerente");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtcedu.setBackground(new java.awt.Color(153, 255, 255));
        txtcedu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtceduActionPerformed(evt);
            }
        });
        txtcedu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtceduKeyTyped(evt);
            }
        });

        Jlabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        Jlabel3.setForeground(new java.awt.Color(0, 0, 153));
        Jlabel3.setText("Cedula: ");

        camb.setText("Modificar");
        camb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Jlabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcedu, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(camb)
                        .addGap(174, 174, 174))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtcedu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlabel3)
                    .addComponent(camb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Jlabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        Jlabel4.setForeground(new java.awt.Color(0, 0, 153));
        Jlabel4.setText("Nombre:");

        Jlabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        Jlabel5.setForeground(new java.awt.Color(0, 0, 153));
        Jlabel5.setText("Apellido");

        Jlabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        Jlabel6.setForeground(new java.awt.Color(0, 0, 153));
        Jlabel6.setText("Correo:");

        txtnom.setBackground(new java.awt.Color(153, 255, 255));
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });

        txtapell.setBackground(new java.awt.Color(153, 255, 255));
        txtapell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellActionPerformed(evt);
            }
        });
        txtapell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellKeyTyped(evt);
            }
        });

        txtcorr.setBackground(new java.awt.Color(153, 255, 255));
        txtcorr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorrActionPerformed(evt);
            }
        });
        txtcorr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorrKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Pais:");

        jLabel19.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 153));
        jLabel19.setText("GERENCIA");

        pais.setBackground(new java.awt.Color(0, 153, 153));
        pais.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 12)); // NOI18N
        pais.setForeground(new java.awt.Color(0, 153, 153));
        pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ECUADOR", "PERU", "COLOMBIA", "VENEZUELA", "MEXIO", "CHILE" }));

        Gerencia.setBackground(new java.awt.Color(0, 153, 153));
        Gerencia.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 12)); // NOI18N
        Gerencia.setForeground(new java.awt.Color(0, 153, 153));
        Gerencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "FINANCIERA", "MARKETING" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jlabel5)
                                    .addComponent(Jlabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcorr, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtapell, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Gerencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jlabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlabel4)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlabel5)
                    .addComponent(txtapell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(Gerencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlabel6)
                    .addComponent(txtcorr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtceduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtceduActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtceduActionPerformed

    private void txtceduKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtceduKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean ced = aux >= 48 && aux < 58;
        boolean ret =aux == 8;
        boolean ent = aux == 13;

        if (ced == false&& ret== false && ent== false ) {
            JOptionPane.showMessageDialog(null, "El dato:\n " + "-> "+evt.getKeyChar()+"<-\n"+"No esta Permitido");
            evt.consume();
        } else if (txtcedu.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtceduKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MiniProyecto mini=new MiniProyecto();
        mini.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomKeyTyped

    private void txtapellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellActionPerformed

    private void txtapellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellKeyTyped

    private void txtcorrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorrActionPerformed

    private void txtcorrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorrKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorrKeyTyped

    private void cambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambActionPerformed
        // TODO add your handling code here:
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        Modificar_Gerente(BaseD);
        Cerrar_BD(BaseD);
        txtcedu.setEditable(true);
    }//GEN-LAST:event_cambActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        buscar(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void buscar(ObjectContainer basep) {//cargardatos

        camb.setEnabled(false);
        String IDAux;
        IDAux = txtcedu.getText();

        CreGerente EAux = new CreGerente();

        if (txtcedu.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ingrese una cedula");
        } else {

            if (EAux.Comprobar_Gerente (basep, IDAux) == 0) {

                JOptionPane.showMessageDialog(null, "El estudiante no existe en la base de datos");
                LimpiarCamposdeTexto();

            } else {

                Gerente Ebuscar = new Gerente (null, null, IDAux, null, null, null, null, null,null,null);

                ObjectSet result = basep.get(Ebuscar);
                for (int i = 0; i < result.size(); i++) {

                    Gerente miE = new Gerente();

                    miE = (Gerente) result.get(i);

                    txtnom.setText(miE.getNombre_per());
                    txtapell.setText(miE.getApellido_per());
                    pais.setSelectedItem(miE.getPais_per());
                    txtcorr.setText(miE.getCorreo_per());
                    Gerencia.setSelectedIndex(WIDTH);
                }

                //Hacer editable los campos de texto
                HabilitarCampos_deTexto();
                txtcedu.setEditable(false);
            }

        }

    }

    public void asignarVariables(ObjectContainer basep) {
        cedula = txtcedu.getText();
        nombre = txtnom.getText();
        apellido = txtapell.getText();
        Pais = pais.getSelectedItem().toString();
        correo = txtcorr.getText();
        password= txtcorr.getText();
        gerencia= Gerencia.getSelectedItem().toString();
       
        
    }
    public void Modificar_Gerente(ObjectContainer basep) {
            
                Gerente Emodi = new Gerente (null, null,null, null,txtcedu.getText(), null, null, null, null,null);
                ObjectSet result = basep.get(Emodi);
                Gerente Emodificar = (Gerente) result.next();
                Emodificar.setNombre_per(txtnom.getText());
                Emodificar.setApellido_per(txtnom.getText());
                Emodificar.setPais_per(pais.getSelectedItem().toString());
                Emodificar.setCorreo_per(txtnom.getText());
                Emodificar.setPassword_per(txtnom.getText());
                Emodificar.setTipo_ger(Gerencia.getSelectedItem().toString());
                basep.set(Emodificar);
                JOptionPane.showMessageDialog(null, "El estudiante fue modificado exitosamente");
                LimpiarCamposdeTexto();
            
    }
                                               
    public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         
    public void LimpiarCamposdeTexto() {
        txtcedu.setText("");
        txtnom.setText("");
        txtapell.setText("");
        pais.setSelectedIndex(0);
        txtcorr.setText("");
        Gerencia.setSelectedIndex(0);
    }

    public void HabilitarCampos_deTexto() {
        txtcedu.setEditable(true);
        txtnom.setEditable(true);
        txtapell.setEditable(true);
        pais.setEditable(true);
        txtcorr.setEditable(true);
        Gerencia.setEditable(true);
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
//            java.util.logging.Logger.getLogger(ModGer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModGer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModGer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModGer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ModGer().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Gerencia;
    private javax.swing.JLabel Jlabel3;
    private javax.swing.JLabel Jlabel4;
    private javax.swing.JLabel Jlabel5;
    private javax.swing.JLabel Jlabel6;
    private javax.swing.JButton camb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> pais;
    private javax.swing.JTextField txtapell;
    private javax.swing.JTextField txtcedu;
    private javax.swing.JTextField txtcorr;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
