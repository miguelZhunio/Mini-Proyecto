package mini.proyecto;

import clases.Estudiante;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import static mini.proyecto.Estudiante_Crear.Cerrar_BD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author IV
 */
public class Estudiante_Modificar extends javax.swing.JFrame {

    /**
     * Creates new form Estudiante_Modificar
     */
    String cedula_per = "";
    String nombre_per = "";
    String apellido_per = "";
    String pais_per = "";
    String correo_per = "";
    String password_per = "";
    String fechaInscripcion_est = "";
    String nivel_est = "";

    public Estudiante_Modificar() {
        initComponents();
        btnModificar.setEnabled(false);//Iniciar el boton desabilitado
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtFecha = new javax.swing.JTextField();
        cbNivel = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        cbPais = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiante = new javax.swing.JTable();
        jBbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Estudiante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 260, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("Cedula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel5.setText("Pais:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel6.setText("Contraseña:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel7.setText("Correo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel8.setText("Fecha  de Inscipcion:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 130, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 130, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 160, -1));

        jLabel9.setText("Nivel:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 160, -1));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 110, -1));

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Alto", "Medio", "Bajo" }));
        jPanel1.add(cbNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 70, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 100, 60));

        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ecuador", "Colombia", "Venezuela", "Peru" }));
        jPanel1.add(cbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        tblEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Pais", "Correo", "Contraseña", "Fecha Inscripcion", "NIvel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEstudiante);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 820, 150));

        jBbuscar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jBbuscar.setForeground(new java.awt.Color(0, 0, 255));
        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        jBbuscar.setToolTipText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        MiniProyecto m = new MiniProyecto();
        m.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char aux = evt.getKeyChar();
        boolean numeros = aux >= '0' && aux <= '9';
        if (!numeros) {
            System.out.println("Ingreso erroneo: " + evt.getKeyChar());
            evt.consume();
        } else if (txtCedula.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char aux = evt.getKeyChar();
        String texto = txtNombre.getText();

        if (!Character.isLetter(aux) || texto.length() >= 20) {
            evt.consume(); // Ignorar caracteres que no sean letras o que excedan la longitud permitida
        } else if (texto.length() == 0 && !Character.isUpperCase(aux)) {
            evt.consume(); // Si el primer carácter no es mayúscula, ignorar
        } else if (texto.length() > 0 && !Character.isLowerCase(aux)) {
            evt.consume(); // Si no es el primer carácter y no es minúscula, ignorar
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char aux = evt.getKeyChar();
        String texto = txtApellido.getText();

        if (!Character.isLetter(aux) || texto.length() >= 20) {
            evt.consume(); // Ignorar caracteres que no sean letras o que excedan la longitud permitida
        } else if (texto.length() == 0 && !Character.isUpperCase(aux)) {
            evt.consume(); // Si el primer carácter no es mayúscula, ignorar
        } else if (texto.length() > 0 && !Character.isLowerCase(aux)) {
            evt.consume(); // Si no es el primer carácter y no es minúscula, ignorar
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed

        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        buscar(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_jBbuscarActionPerformed
    public void buscar(ObjectContainer basep) {//cargardatos

        btnModificar.setEnabled(false);
        String IDAux;
        IDAux = txtCedula.getText();

        Estudiante_Crear EAux = new Estudiante_Crear();

        if (txtCedula.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Ingrese una cedula");
        } else {

            if (EAux.Comprobar_Estudiantes(basep, IDAux) == 0) {

                JOptionPane.showMessageDialog(null, "El estudiante no existe en la base de datos");
                LimpiarCamposdeTexto();

            } else {

                Estudiante Ebuscar = new Estudiante(null, null, IDAux, null, null, null, null, null);

                ObjectSet result = basep.get(Ebuscar);
                for (int i = 0; i < result.size(); i++) {

                    Estudiante miE = new Estudiante();

                    miE = (Estudiante) result.get(i);

                    txtNombre.setText(miE.getNombre_per());
                    txtApellido.setText(miE.getApellido_per());
                    cbPais.setSelectedItem(miE.getPais_per());
                    txtCorreo.setText(miE.getCorreo_per());
                    txtContraseña.setText(miE.getPassword_per());
                    txtFecha.setText(miE.getFechaInscripcion_est());
                    cbNivel.setSelectedItem(miE.getNivel_est());
                }

                //Hacer editable los campos de texto
                HabilitarCampos_deTexto();
                txtCedula.setEditable(false);
            }

        }

    }

    public void asignarVariables(ObjectContainer basep) {
        cedula_per = txtCedula.getText();
        nombre_per = txtNombre.getText();
        apellido_per = txtApellido.getText();
        pais_per = cbPais.getSelectedItem().toString();
        correo_per = txtCorreo.getText();
        password_per = txtContraseña.getText();
        fechaInscripcion_est = txtFecha.getText();
        nivel_est = cbNivel.getSelectedItem().toString();
       
        
    }
    public void Modificar_Estudiante(ObjectContainer basep) {
            
                Estudiante Emodi = new Estudiante(null, null, txtCedula.getText(), null, null,null,null, null);
                ObjectSet result = basep.get(Emodi);
                Estudiante Emodificar = (Estudiante) result.next();
                Emodificar.setNombre_per(txtNombre.getText());
                Emodificar.setApellido_per(txtNombre.getText());
                Emodificar.setPais_per(cbPais.getSelectedItem().toString());
                Emodificar.setCorreo_per(txtNombre.getText());
                Emodificar.setPassword_per(txtNombre.getText());
                Emodificar.setFechaInscripcion_est(txtFecha.getText());
                Emodificar.setNivel_est(cbNivel.getSelectedItem().toString());
                basep.set(Emodificar);
                JOptionPane.showMessageDialog(null, "El estudiante fue modificado exitosamente");
                LimpiarCamposdeTexto();
            
    }
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        Modificar_Estudiante(BaseD);
        Cerrar_BD(BaseD);
        txtCedula.setEditable(true);
    }//GEN-LAST:event_btnModificarActionPerformed
    public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed
    public void LimpiarCamposdeTexto() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        cbPais.setSelectedIndex(0);
        txtCorreo.setText("");
        txtContraseña.setText("");
        txtFecha.setText("");
        cbNivel.setSelectedIndex(0);
    }

    public void HabilitarCampos_deTexto() {
        txtCedula.setEditable(true);
        txtNombre.setEditable(true);
        txtApellido.setEditable(true);
        cbPais.setEditable(true);
        txtCorreo.setEditable(true);
        txtContraseña.setEditable(true);
        txtFecha.setEditable(true);
        cbNivel.setEditable(true);
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
//            java.util.logging.Logger.getLogger(Estudiante_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Estudiante_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Estudiante_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Estudiante_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Estudiante_Modificar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbNivel;
    private javax.swing.JComboBox<String> cbPais;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstudiante;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
