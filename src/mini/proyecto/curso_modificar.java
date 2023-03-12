/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.proyecto;

import clases.Curso;
import clases.Estudiante;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import static mini.proyecto.Estudiante_Modificar.Cerrar_BD;


public class curso_modificar extends javax.swing.JFrame {

    String cod_cur = "" ;
    String nombre_cur = "";
    String duracion = "";
    double precio = 0;
    String silabo = "";
    String deescripcion = "";
    String id_pro = "";
    String cod_car= "";
    String convertir = String.valueOf(precio);
    
    public curso_modificar() {
        initComponents();
    }

   
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
        txtnombre = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtduracion = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoConsultar = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSilabo = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaModificar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Curso");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 230, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel3.setText("Precio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel4.setText("Duracion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel5.setText("Silabo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 130, -1));

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 130, -1));

        txtduracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtduracionKeyTyped(evt);
            }
        });
        jPanel1.add(txtduracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 130, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 80, 50));

        jLabel10.setText("Codigo Curso");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtCodigoConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoConsultarKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigoConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 130, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 50));

        jLabel11.setText("Descripcion:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        txtSilabo.setColumns(20);
        txtSilabo.setRows(5);
        jScrollPane3.setViewportView(txtSilabo);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        tablaModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Curso", "Nombre", "Precio", "Duracion", "Silabo", "Descripcion", "Codigo Carrera", "ID Profesor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaModificar);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 740, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoConsultarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoConsultarKeyTyped
        char aux = evt.getKeyChar();
        boolean numeros = aux >= '0' && aux <= '9';
        if (!numeros) {
            System.out.println("Ingreso erroneo: " + evt.getKeyChar());
            evt.consume();
        } else if (txtCodigoConsultar.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoConsultarKeyTyped

    private void txtduracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtduracionKeyTyped
        char aux = evt.getKeyChar();
        String texto = txtduracion.getText();

        if (!Character.isLetter(aux) || texto.length() >= 20) {
            evt.consume(); // Ignorar caracteres que no sean letras o que excedan la longitud permitida
        } else if (texto.length() == 0 && !Character.isUpperCase(aux)) {
            evt.consume(); // Si el primer carácter no es mayúscula, ignorar
        } else if (texto.length() > 0 && !Character.isLowerCase(aux)) {
            evt.consume(); // Si no es el primer carácter y no es minúscula, ignorar
        }
    }//GEN-LAST:event_txtduracionKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        char aux = evt.getKeyChar();
        String texto = txtprecio.getText();

        if (!Character.isLetter(aux) || texto.length() >= 20) {
            evt.consume(); // Ignorar caracteres que no sean letras o que excedan la longitud permitida
        } else if (texto.length() == 0 && !Character.isUpperCase(aux)) {
            evt.consume(); // Si el primer carácter no es mayúscula, ignorar
        } else if (texto.length() > 0 && !Character.isLowerCase(aux)) {
            evt.consume(); // Si no es el primer carácter y no es minúscula, ignorar
        }
    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char aux = evt.getKeyChar();
        boolean numeros = aux >= '0' && aux <= '9';
        if (!numeros) {
            System.out.println("Ingreso erroneo: " + evt.getKeyChar());
            evt.consume();
        } else if (txtnombre.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        MiniProyecto m = new MiniProyecto();
        m.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        Modificar_Curso(BaseD);
        Cerrar_BD(BaseD);
        txtCodigoConsultar.setEditable(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        buscar(BaseD);
        Cerrar_BD(BaseD);
        
    }//GEN-LAST:event_btnConsultarActionPerformed
    public void buscar(ObjectContainer basep) {//cargardatos
        btnModificar.setEnabled(false);
        String IDAux;
        IDAux = txtCodigoConsultar.getText();

        curso_crear EAux = new curso_crear();

        if (txtCodigoConsultar.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "INGRESE UN CODIGO");
        } else {
            if (EAux.Comprobar_Cursos(basep, IDAux) == 0) {
                JOptionPane.showMessageDialog(null, "EL CURSO NO EXISTE EN LA BASE DE DATOS");
                LimpiarCamposdeTexto();
            } else {
                Curso CursoBuscar = new Curso(null, null, IDAux, 0, null, null, null, null);

                ObjectSet result = basep.get(CursoBuscar);
                for (int i = 0; i < result.size(); i++) {

                    Curso miC = new Curso();
                    miC = (Curso) result.get(i);

                    txtnombre.setText(miC.getNombre_cur());
                    txtprecio.setText(String.valueOf(miC.getPrecio()));
                    txtduracion.setText(miC.getDuracion());
                    txtDescripcion.setText(miC.getDeescripcion());
                    txtSilabo.setText(miC.getSilabo());                    
                }
                //Hacer editable los campos de texto
                HabilitarCampos_deTexto();
                txtCodigoConsultar.setEditable(false);
            }
        }
    }
    public void asignarVariables(ObjectContainer basep) {
        cod_cur = txtCodigoConsultar.getText();
        nombre_cur = txtnombre.getText();
        precio = Double.parseDouble(txtprecio.getText());
        duracion = txtduracion.getText();
        deescripcion = txtDescripcion.getText();
        silabo = txtSilabo.getText();
    }
    public void Modificar_Curso(ObjectContainer basep) {            
                Curso Cmodi = new Curso(null, null, txtCodigoConsultar.getText(), 0, null,null,null, null);
                ObjectSet result = basep.get(Cmodi);
                Curso CursoModificar = (Curso) result.next();
                CursoModificar.setNombre_cur(txtnombre.getText());
                CursoModificar.setPrecio(Double.parseDouble(txtprecio.getText()));
                CursoModificar.setDuracion(txtduracion.getText());
                CursoModificar.setDeescripcion(txtDescripcion.getText());
                CursoModificar.setSilabo(txtSilabo.getText());
                JOptionPane.showMessageDialog(null, "El CURSO FUE MODIFICADO CORRECTAMENTE");
                LimpiarCamposdeTexto();           
    }                                           
                                           
    public void LimpiarCamposdeTexto() {
        txtCodigoConsultar.setText("");
        txtnombre.setText("");
        txtduracion.setText("");
        txtprecio.setText("");
        txtDescripcion.setText("");
        txtSilabo.setText("");       
    }
    public void HabilitarCampos_deTexto() {
        txtCodigoConsultar.setEditable(true);
        txtnombre.setEditable(true);
        txtduracion.setEditable(true);
        txtprecio.setEditable(true);
        txtDescripcion.setEditable(true);
        txtSilabo.setEditable(true);
    }        
    public static void Cerrar_BD(ObjectContainer basep) {
        basep.close();
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablaModificar;
    private javax.swing.JTextField txtCodigoConsultar;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtSilabo;
    private javax.swing.JTextField txtduracion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
