/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.proyecto;

import clases.Curso;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static mini.proyecto.Estudiante_Crear.Cerrar_BD;

/**
 *
 * @author PC01
 */
public class curso_crear extends javax.swing.JFrame {

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    String cod_cur = "" ;
    String nombre_cur = "";
    String duracion = "";
    double precio = 0;
    String silabo = "";
    String deescripcion = "";
    String id_pro = "";
    String cod_car= "";     
    public curso_crear() {
        initComponents();
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtcodigocarrera = new javax.swing.JTextField();
        txtidprofesor = new javax.swing.JTextField();
        txtduracion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtsilabo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Crear Curso");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Codigo curso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Silabo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Duraciòn:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Codigo Carrera:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("ID Profesor:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Descripciòn");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 100, -1));

        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, -1));

        txtprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 100, -1));

        txtcodigocarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcodigocarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigocarreraKeyTyped(evt);
            }
        });
        jPanel1.add(txtcodigocarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 90, -1));

        txtidprofesor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidprofesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidprofesorKeyTyped(evt);
            }
        });
        jPanel1.add(txtidprofesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 90, -1));

        txtduracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtduracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtduracionKeyTyped(evt);
            }
        });
        jPanel1.add(txtduracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 90, -1));

        jButton1.setText("Guardar");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 80, 30));

        btSalir.setText("Salir");
        btSalir.setBorder(new javax.swing.border.MatteBorder(null));
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 80, 30));

        txtsilabo.setColumns(20);
        txtsilabo.setRows(5);
        txtsilabo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtsilabo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 100));

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        txtdescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(txtdescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);

        Crear_Curso(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        char aux = evt.getKeyChar();
        boolean numeros = aux >= '0' && aux <= '9';
        if (!numeros) {
            System.out.println("Ingreso erroneo: " + evt.getKeyChar());
            evt.consume();
        } else if (txtcodigo.getText().length() >= 10) {
            evt.consume();
        }      
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
     this.dispose();
     MiniProyecto regresarMini = new MiniProyecto();
     regresarMini.setVisible(true);    
    }//GEN-LAST:event_btSalirActionPerformed

    private void txtcodigocarreraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigocarreraKeyTyped

        char aux = evt.getKeyChar();
        boolean numeros = aux >= '0' && aux <= '9';
        if (!numeros) {
            System.out.println("Ingreso erroneo: " + evt.getKeyChar());
            evt.consume();
        } else if (txtcodigocarrera.getText().length() >= 10) {
            evt.consume();
        }    
    }//GEN-LAST:event_txtcodigocarreraKeyTyped

    private void txtduracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtduracionKeyTyped
          
    }//GEN-LAST:event_txtduracionKeyTyped

    private void txtidprofesorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidprofesorKeyTyped
             char aux = evt.getKeyChar();
        boolean numeros = aux >= '0' && aux <= '9';
        if (!numeros) {
            System.out.println("Ingreso erroneo: " + evt.getKeyChar());
            evt.consume();
        } else if (txtidprofesor.getText().length() >= 10) {
            evt.consume();
        }    
      
    }//GEN-LAST:event_txtidprofesorKeyTyped
public void asignarVariables(ObjectContainer basep) throws ParseException {

        
        if (!txtcodigo.getText().isEmpty()) {
        cod_cur = txtcodigo.getText();
    }
    if (!txtnombre.getText().isEmpty()) {
        nombre_cur = txtnombre.getText();
    }
    if (!txtprecio.getText().isEmpty()) {
        precio = Double.parseDouble(txtprecio.getText());
    }
    if (!txtduracion.getText().isEmpty()) {
        duracion = txtduracion.getText();
    }
    if(!txtdescripcion.getText().isEmpty()){
        deescripcion=txtdescripcion.getText();
    }
    if (!txtsilabo.getText().isEmpty()) {
        silabo = txtsilabo.getText();
    }
    if (!txtcodigocarrera.getText().isEmpty()) {
        cod_car = txtcodigocarrera.getText();
    }
   if (!txtidprofesor.getText().isEmpty()) {
        id_pro = txtidprofesor.getText();
    }
}

    public void Crear_Curso(ObjectContainer basep) {
         Curso crearcurso = new Curso (cod_cur, nombre_cur, duracion, precio, silabo, deescripcion,  id_pro,  cod_car);
            if (Comprobar_Cursos(basep, cod_cur) == 0) {
                basep.set(crearcurso);
                JOptionPane.showMessageDialog(null, "EL CURSO SE GUARDO CORRECTAMENTE");
                LimpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "EL CURSO YA EXISTE");
            }
            txtcodigo.setText("");
    }
    public static int Comprobar_Cursos(ObjectContainer basep, String cod_cur) {

        Curso Cbuscar = new Curso(cod_cur, null, null,0, null, null, null, null);

        ObjectSet result = basep.get(Cbuscar);

        return result.size();
    }

    public static void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }
    public void LimpiarCampos() {
        txtcodigo.setText("");
        txtnombre.setText("");
        txtduracion.setText("");
        txtprecio.setText("");
        txtsilabo.setText("");
        txtdescripcion.setText("");
        txtidprofesor.setText("");
        txtcodigocarrera.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalir;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcodigocarrera;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtduracion;
    private javax.swing.JTextField txtidprofesor;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextArea txtsilabo;
    // End of variables declaration//GEN-END:variables
}
