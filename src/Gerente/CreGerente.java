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
public class CreGerente extends javax.swing.JFrame {
    String cedula = "";
         String nombre = "";
         String apellido= "";
         String Pais = "";
         String correo = "";
         String password= "";
         String gerencia = "";
    private Object Enuevo;
    private String cedula_per;

    /**
     * Creates new form CreGerente
     */
    public CreGerente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Gerente");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Jlabel3 = new javax.swing.JLabel();
        Jlabel4 = new javax.swing.JLabel();
        Jlabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtcedu = new javax.swing.JTextField();
        txtcorr = new javax.swing.JTextField();
        txtapell = new javax.swing.JTextField();
        pais = new javax.swing.JComboBox<>();
        Gerencia = new javax.swing.JComboBox<>();
        txtpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("GERENTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));

        jLabel14.setBackground(new java.awt.Color(51, 102, 255));
        jLabel14.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 255));

        Jlabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        Jlabel3.setForeground(new java.awt.Color(0, 0, 153));
        Jlabel3.setText("Cedula: ");

        Jlabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        Jlabel4.setForeground(new java.awt.Color(0, 0, 153));
        Jlabel4.setText("Nombre:");

        Jlabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        Jlabel5.setForeground(new java.awt.Color(0, 0, 153));
        Jlabel5.setText("Apellido:");

        jLabel15.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setText("Correo:");

        jLabel16.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setText("Contrase??a");

        jLabel17.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Pais:");

        jLabel18.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 153));
        jLabel18.setText("GERENCIA");

        txtnom.setBackground(new java.awt.Color(0, 153, 153));
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

        txtcedu.setBackground(new java.awt.Color(0, 153, 153));
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

        txtcorr.setBackground(new java.awt.Color(0, 153, 153));
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

        txtapell.setBackground(new java.awt.Color(0, 153, 153));
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

        pais.setBackground(new java.awt.Color(153, 255, 255));
        pais.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 12)); // NOI18N
        pais.setForeground(new java.awt.Color(0, 153, 153));
        pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ECUADOR", "PERU", "COLOMBIA", "VENEZUELA", "MEXIO", "CHILE" }));

        Gerencia.setBackground(new java.awt.Color(0, 153, 153));
        Gerencia.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 12)); // NOI18N
        Gerencia.setForeground(new java.awt.Color(0, 153, 153));
        Gerencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "FINANCIERA", "MARKETING" }));

        txtpass.setBackground(new java.awt.Color(0, 153, 153));
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setText("CREAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jlabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jlabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jlabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnom)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addComponent(txtcedu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtapell))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Gerencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(245, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtpass, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcorr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jlabel3)
                        .addComponent(jLabel15)
                        .addComponent(txtcedu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcorr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlabel4)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlabel5)
                    .addComponent(jLabel18)
                    .addComponent(txtapell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gerencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        char aux1 = evt.getKeyChar();
        boolean Mayus = aux >= 65 && aux < 90;
        boolean minus = aux1 >= 94 && aux1 < 122;
        boolean ret =aux == 8;
        boolean ent = aux == 13;
        if (Mayus == false&& minus ==false && ret== false && ent== false) {
            JOptionPane.showMessageDialog(null, "El dato:\n " + "-> "+evt.getKeyChar()+"<-\n"+"No esta Permitido");
            evt.consume();}
        else if (txtnom.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnomKeyTyped

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

    private void txtcorrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorrActionPerformed

    private void txtcorrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorrKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        char aux1 = evt.getKeyChar();
        boolean Mayus = aux >= 63 && aux < 90;
        boolean minus = aux1 >= 94 && aux1 < 122;
        boolean ret =aux == 8;
        boolean ent = aux == 13;
        if (Mayus == false&& minus ==false && ret== false && ent== false) {
            JOptionPane.showMessageDialog(null, "El dato:\n " + "-> "+evt.getKeyChar()+"<-\n"+"No esta Permitido");
            evt.consume();}
        else if (txtcorr.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcorrKeyTyped

    private void txtapellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellActionPerformed

    private void txtapellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        char aux1 = evt.getKeyChar();
        boolean Mayus = aux >= 65 && aux < 90;
        boolean minus = aux1 >= 94 && aux1 < 122;
        boolean ret =aux == 8;
        boolean ent = aux == 13;
        if (Mayus == false&& minus ==false && ret== false && ent== false) {
            JOptionPane.showMessageDialog(null, "El dato:\n " + "-> "+evt.getKeyChar()+"<-\n"+"No esta Permitido");
            evt.consume();}
        else if (txtapell.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtapellKeyTyped

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean con= aux >= 32&& aux< 126;
        boolean ret =aux == 127;
        boolean ent = aux == 10;
        if(txtpass.getText().length()> 25 && ent== false){
            evt.consume();
        }
        else if (con== false && ret == false ){
            JOptionPane.showMessageDialog(null, "El dato:\n " + "-> "+evt.getKeyChar()+"<-\n"+"No esta Permitido");
            evt.consume();
        }
    }//GEN-LAST:event_txtpassKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);

        Crear_E(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_jButton1ActionPerformed
public void asignarVariables(ObjectContainer basep) {
        cedula = txtcedu.getText();
        nombre = txtnom.getText();
        apellido = txtapell.getText();
        Pais= pais.getSelectedItem().toString();
        correo = txtcorr.getText();
        password = txtpass.getText();
        gerencia= Gerencia.getSelectedItem().toString();
    }
    public void Crear_E(ObjectContainer basep) {   
             Gerente Gerente= new Gerente ( "tipo_ger", "titulo_tra","fechaCobro_tra", "sueldo_tra","cedula_per", "nombre_per", "apellido_per", "pais_per", "correo_per","password_per");

            if (Comprobar_Gerente(basep, cedula_per ) == 0) {
                
                basep.set(Enuevo);
                JOptionPane.showMessageDialog(null, "El estudiante se guardo correctamente");
                LimpiarCampos();
            } else {

                JOptionPane.showMessageDialog(null, "El estudiante ya existe");
            }

            txtcedu.setText("");
    }
    public static int Comprobar_Gerente(ObjectContainer basep, String cedula_per) {

        Gerente Ebuscar = new Gerente ( null, null,null, null,"cedula_per", null, null, null, null,null);

        ObjectSet result = basep.get(Ebuscar);

        return result.size();
    }

    public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }

    public void LimpiarCampos() {
        txtcedu.setText("");
        txtnom.setText("");
        txtapell.setText("");
        pais.setSelectedIndex(0);
        txtcorr.setText("");
        txtpass.setText("");
        Gerencia.setSelectedIndex(0);
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MiniProyecto mini=new MiniProyecto();
        mini.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
//            java.util.logging.Logger.getLogger(CreGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CreGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CreGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CreGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CreGerente().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Gerencia;
    private javax.swing.JLabel Jlabel3;
    private javax.swing.JLabel Jlabel4;
    private javax.swing.JLabel Jlabel5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> pais;
    private javax.swing.JTextField txtapell;
    private javax.swing.JTextField txtcedu;
    private javax.swing.JTextField txtcorr;
    private javax.swing.JTextField txtnom;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
