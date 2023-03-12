/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.proyecto;

import clases.Carrera;
import clases.Certifica;
import clases.Estudiante;
import clases.Profesor;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author PC01
 */
public class certifica_crear extends javax.swing.JFrame {

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    private String cod_cer= "";
    private String cod_car = "";
    private String ced_est = "";
    private Date fecha_cer = null;
    private String mensaje = "";
    MaskFormatter mascara;
    
    public certifica_crear() throws ParseException {
        mascara = new MaskFormatter("##/##/####");
        mascara.setPlaceholderCharacter('-');
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtcodigocarrera = new javax.swing.JTextField();
        txtcodigoestudiante = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmensaje = new javax.swing.JTextArea();
        txtfecha = new javax.swing.JFormattedTextField(mascara);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Crear Certificado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Codigo Certificado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Fecha Certificado:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Mesaje:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Codigo Carrera:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Cedula Estudiante:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, 20));

        txtcodigocarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcodigocarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 110, 20));

        txtcodigoestudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtcodigoestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 110, 20));

        jButton1.setText("Guardar");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 80, 30));

        btnsalir.setText("Salir");
        btnsalir.setBorder(new javax.swing.border.MatteBorder(null));
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 80, 30));

        txtmensaje.setColumns(20);
        txtmensaje.setRows(5);
        jScrollPane1.setViewportView(txtmensaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 360, 90));

        txtfecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        try {
            asignarVariables();
        } catch (ParseException ex) {
            Logger.getLogger(certifica_crear.class.getName()).log(Level.SEVERE, null, ex);
        }
        Crear_Certificado(BaseD);
        Cerrar_BD(BaseD);
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    
    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        MiniProyecto regresar = new MiniProyecto();
        regresar.setVisible(true);
        
    }//GEN-LAST:event_btnsalirActionPerformed
    public void asignarVariables() throws ParseException {
        cod_cer = txtcodigo.getText();
        cod_car = txtcodigocarrera.getText();
        ced_est = txtcodigoestudiante.getText();
        fecha_cer = formato.parse(txtfecha.getText());
        mensaje = txtmensaje.getText();

    }
        public void Crear_Certificado(ObjectContainer basep) {   
            boolean error = false;
            

            if (Comprobar_Certificado(basep, cod_cer) != 0) {
                error = true;
                JOptionPane.showMessageDialog(null, "EL CURSO YA EXISTE");
                LimpiarCampos();
            } else {
                txtcodigo.setText("");
            }
            
            if (Comprobar_Estudiantes(basep, ced_est) == 0) {
                error = true;
                JOptionPane.showMessageDialog(null, "EL ESTUDIANTE CON ESTE CODIGO NO EXISTE");
            }
            
            if (Comprobar_Carrera(basep, cod_car) == 0) {
                error = true;
                JOptionPane.showMessageDialog(null, "LA CARRERA CON ESTE CODIGO NO EXISTE");
            }
            
            if (!error) {
                Certifica CertificaNuevo = new Certifica(cod_cer, cod_car, ced_est, fecha_cer, mensaje );
                basep.set(CertificaNuevo);
                JOptionPane.showMessageDialog(null, "EL CURSO SE GUARDO CORRECTAMENTE");
                LimpiarCampos();

            }
          
        }
        
        public static int Comprobar_Certificado(ObjectContainer base, String codigo) {
            ObjectSet buscarCer = base.get(new Certifica(codigo, null, null, null, null));
            return buscarCer.size();
        }
        public static int Comprobar_Estudiantes(ObjectContainer basep, String cedula_per) {

            ObjectSet result = basep.get(new Estudiante(null, null, cedula_per, null, null, null, null, null));
            return result.size();
        }
        
        public static int Comprobar_Carrera(ObjectContainer basep, String cod_car) {

            ObjectSet result = basep.get(new Carrera(cod_car, null, null, null));
            
            return result.size();
        }
        public static void Cerrar_BD(ObjectContainer basep) {
            basep.close();
       }
    public void LimpiarCampos() {
        txtcodigo.setText("");
        txtfecha.setText("");
        txtcodigocarrera.setText("");
        txtcodigoestudiante.setText("");
        txtmensaje.setText("");

    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(certifica_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(certifica_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(certifica_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(certifica_modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new certifica_crear().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(certifica_crear.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcodigocarrera;
    private javax.swing.JTextField txtcodigoestudiante;
    private javax.swing.JFormattedTextField txtfecha;
    private javax.swing.JTextArea txtmensaje;
    // End of variables declaration//GEN-END:variables
}
