package mini.proyecto;

import clases.Estudiante;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mini.proyecto.MiniProyecto;

/**
 *
 * @author IV
 */
public class Estudiante_Consultar extends javax.swing.JFrame {
    
    
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
    /**
     * Creates new form Estudiante_Consultar
     */
    public Estudiante_Consultar() {
        initComponents();
        deshabilitarParametros();
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
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstudiante1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        BuscarOpcion = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        txlCedula = new javax.swing.JLabel();
        txlNombre = new javax.swing.JLabel();
        txlApellido = new javax.swing.JLabel();
        txlPais = new javax.swing.JLabel();
        txlContraseña = new javax.swing.JLabel();
        txlCorreo = new javax.swing.JLabel();
        txlFI = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txlNivel = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtFecha = new javax.swing.JTextField();
        cbNivel = new javax.swing.JComboBox<>();
        cbPais = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        txlCedulaC = new javax.swing.JLabel();
        txtCedulaC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Estudiante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 140, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 50));

        tblEstudiante1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
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
        tblEstudiante1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblEstudiante1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 810, 150));

        jLabel3.setText("Filtro:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        BuscarOpcion.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        BuscarOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Ver todos", "ID", "Buscar Parametros" }));
        BuscarOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarOpcionActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txlCedula.setText("Cedula:");
        jPanel2.add(txlCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txlNombre.setText("Nombre:");
        jPanel2.add(txlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        txlApellido.setText("Apellido:");
        jPanel2.add(txlApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        txlPais.setText("Pais:");
        jPanel2.add(txlPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        txlContraseña.setText("Contraseña:");
        jPanel2.add(txlContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        txlCorreo.setText("Correo:");
        jPanel2.add(txlCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        txlFI.setText("Fecha  de Inscipcion:");
        jPanel2.add(txlFI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 130, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 130, -1));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 160, -1));

        txlNivel.setText("Nivel:");
        jPanel2.add(txlNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 160, -1));
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 110, -1));

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Alto", "Medio", "Bajo" }));
        jPanel2.add(cbNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 70, -1));

        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ecuador", "Colombia", "Venezuela", "Peru" }));
        jPanel2.add(cbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 690, 230));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, 50));

        txlCedulaC.setText("Cedula:");
        jPanel1.add(txlCedulaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));
        jPanel1.add(txtCedulaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
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
        try {
            BuscarEstudiante_Cedula(BaseD);
        } catch (ParseException ex) {
            Logger.getLogger(Estudiante_Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
        Cerrar_BD(BaseD);
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void BuscarOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarOpcionActionPerformed
        if (BuscarOpcion.getSelectedIndex() == 0) {
            deshabilitarParametros();
        } else {
            if (BuscarOpcion.getSelectedIndex() == 1) {
                deshabilitarParametros();
            } else {
                if (BuscarOpcion.getSelectedIndex() == 2) {
                    deshabilitarParametros();
                } else {
                    if (BuscarOpcion.getSelectedIndex() == 3) {
                        habilitarParametros();
                    }
                }
            }
        }
    }//GEN-LAST:event_BuscarOpcionActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        Eliminar_Estudiante(BaseD);
        Cerrar_BD(BaseD);
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void BuscarEstudiante_Cedula(ObjectContainer basep) throws ParseException {

        if (BuscarOpcion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selección invalida");
//            deshabilitarParametros();
        } else {
            if (BuscarOpcion.getSelectedIndex() == 1) {
//                deshabilitarParametros();
                Estudiante Ebuscar = new Estudiante(null, null, null, null, null, null, null, null);

                ObjectSet result = basep.get(Ebuscar);
                MostrarDatos(result);
            } else {
                if (BuscarOpcion.getSelectedIndex() == 2) {
//                    deshabilitarParametros();
                    String IDAux = JOptionPane.showInputDialog("Ingrese la cedula a consultar");
//Ojo
                    Estudiante Ebuscar = new Estudiante(null, null, null, null, null, null, null, null);

                    ObjectSet result = basep.get(Ebuscar);
                    MostrarDatos(result);

                } else {
                    if (BuscarOpcion.getSelectedIndex() == 3) {
//                        habilitarParametros();
                        BuscarParametros(basep);

                    }
                }
            }
        }

        //Borrar la eleccion y ponerla al inicio
        BuscarOpcion.setSelectedIndex(0);
    }
    public void habilitarParametros() {
        txtCedula.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        cbPais.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtContraseña.setEnabled(true);
        txtFecha.setEnabled(true);
        cbNivel.setEnabled(true);
        //
        txlCedula.setEnabled(true);
        txlNombre.setEnabled(true);
        txlApellido.setEnabled(true);
        txlPais.setEnabled(true);
        txlCorreo.setEnabled(true);
        txlContraseña.setEnabled(true);
        txlFI.setEnabled(true);
        txlNivel.setEnabled(true);
        
    }
    public void deshabilitarParametros() {
        txtCedula.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        cbPais.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtContraseña.setEnabled(false);
        txtFecha.setEnabled(false);
        cbNivel.setEnabled(false);
        //
        txlCedula.setEnabled(false);
        txlNombre.setEnabled(false);
        txlApellido.setEnabled(false);
        txlPais.setEnabled(false);
        txlCorreo.setEnabled(false);
        txlContraseña.setEnabled(false);
        txlFI.setEnabled(false);
        txlNivel.setEnabled(false);
    }
    public void BuscarParametros(ObjectContainer basep) throws ParseException {
        //String CedulaAux;
        String NombreAux;
        String ApellidoAux;
        String PaisAux;
        String CorreoAux;
        String ContraseñaAux;
        String FIAux;
        String NivelAux;
        

//        if (txtCedula.getText().isEmpty()) {
//
//            CedulaAux = null;
//        } else {
//            CedulaAux = txtCedula.getText();
//        }

        if (txtNombre.getText().isEmpty()) {

            NombreAux = null;
        } else {
            NombreAux = txtNombre.getText();
        }
        if (txtApellido.getText().isEmpty()) {

            ApellidoAux = null;
        } else {
            ApellidoAux = txtApellido.getText();
        }
        if (cbPais.getSelectedIndex() == 0) {
            PaisAux = null;
        } else {
            PaisAux = cbPais.getSelectedItem().toString();
        }
        if (txtCorreo.getText().isEmpty()) {

            CorreoAux = null;
        } else {
            CorreoAux = txtCorreo.getText();
        }
        if (txtContraseña.getText().isEmpty()) {

            ContraseñaAux = null;
        } else {
            ContraseñaAux = txtContraseña.getText();
        }if (txtFecha.getText().isEmpty()) {

            FIAux = null;
        } else {
            FIAux = txtFecha.getText();
        }
        if (cbNivel.getSelectedIndex() == 0) {
            NivelAux = null;
        } else {
            NivelAux = cbNivel.getSelectedItem().toString();
        }
        
        if (NombreAux == null && ApellidoAux == null && PaisAux == null && CorreoAux == null && ContraseñaAux == null &&  FIAux== null && NivelAux == null) {
            JOptionPane.showMessageDialog(null, "Aun no ha ingresado los parametros");
        } else {
            Estudiante Ebuscar = new Estudiante(FIAux, NivelAux,null, NombreAux, ApellidoAux, PaisAux, CorreoAux, ContraseñaAux);
            ObjectSet result = basep.get(Ebuscar);
            MostrarDatos(result);
        }
    }
    public void MostrarDatos(ObjectSet result) {
        String matrizestudiantes[][] = new String[result.size()][8];

        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "El estudiante no se encuentra en la base de datos");
        } else {
            for (int i = 0; i < result.size(); i++) {

                Estudiante miE = new Estudiante();

                miE = (Estudiante) result.get(i);
                matrizestudiantes[i][0] = miE.getCedula_per();
                matrizestudiantes[i][1] = miE.getNombre_per();
                matrizestudiantes[i][2] = miE.getApellido_per();
                matrizestudiantes[i][3] = miE.getPais_per();
                matrizestudiantes[i][4] = miE.getCorreo_per();
                matrizestudiantes[i][5] = miE.getPassword_per();
                matrizestudiantes[i][6] = miE.getFechaInscripcion_est();
                matrizestudiantes[i][7] = miE.getNivel_est();

                tblEstudiante1.setModel(new javax.swing.table.DefaultTableModel(matrizestudiantes, new String[]{"Cedula", "Nombre", "Apellido", "Pais", "Correo","Contraseña", "Fecha Inscripcion", "Nivel"}));

            }
        }

    }
    public void Eliminar_Estudiante(ObjectContainer basep) {

        Estudiante Einterfaz = new Estudiante();//Crear un objeto de la clase Estudiantes para traer el metodo Comprobar_Estudiantes

        if (txtCedulaC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID no valido");
        } else {

            String txtCedulaCo = txtCedulaC.getText();
            Estudiante Leliminar = new Estudiante(null, null, txtCedulaCo, null, null, null, null, null);
            ObjectSet result = basep.get(Leliminar);

            if (Einterfaz.Comprobar_Estudiantes(basep, txtCedulaCo) == 0) {

                JOptionPane.showMessageDialog(null, "El estudiante no existe en la base de datos");

            } else {
                Estudiante Estudianteeliminar = (Estudiante) result.next();

                basep.delete(Estudianteeliminar);
                JOptionPane.showMessageDialog(null, "El estudiante fue eliminado de la base de datos exitosamente");
            }

        }
        //Borrar el campo de texto
        txtCedulaC.setText("");
    }
    public void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }
    
    
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
//            java.util.logging.Logger.getLogger(Estudiante_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Estudiante_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Estudiante_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Estudiante_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Estudiante_Consultar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BuscarOpcion;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbNivel;
    private javax.swing.JComboBox<String> cbPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEstudiante1;
    private javax.swing.JLabel txlApellido;
    private javax.swing.JLabel txlCedula;
    private javax.swing.JLabel txlCedulaC;
    private javax.swing.JLabel txlContraseña;
    private javax.swing.JLabel txlCorreo;
    private javax.swing.JLabel txlFI;
    private javax.swing.JLabel txlNivel;
    private javax.swing.JLabel txlNombre;
    private javax.swing.JLabel txlPais;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaC;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
