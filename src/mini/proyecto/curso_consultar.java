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
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import javax.swing.JOptionPane;
import static mini.proyecto.Estudiante_Crear.Cerrar_BD;

/**
 *
 * @author PC01
 */
public class curso_consultar extends javax.swing.JFrame {

    
    public curso_consultar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsultar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtcodigoC = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        BuscarOpcion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Consultar Curso");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 210, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 110, 50));

        tablaConsultar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaConsultar);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 740, 120));

        jLabel2.setText("ID Curso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        txtcodigoC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcodigoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoCKeyTyped(evt);
            }
        });
        jPanel1.add(txtcodigoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 130, 30));

        Eliminar.setText("Eliminar");
        Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 110, 50));

        BuscarOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Ver todos", "Codigo Curso", "Buscar Parametros" }));
        BuscarOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarOpcionActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
            BuscarCurso_id(BaseD);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(Estudiante_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

    private void txtcodigoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoCKeyTyped
        char aux = evt.getKeyChar();
        boolean numeros = aux >= '0' && aux <= '9';
        if (!numeros) {
            System.out.println("Ingreso erroneo: " + evt.getKeyChar());
            evt.consume();
        } else if (txtcodigoC.getText().length() >= 10) {
            evt.consume();
        }      
    }//GEN-LAST:event_txtcodigoCKeyTyped

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        Eliminar_Curso(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_EliminarActionPerformed
    public void BuscarCurso_id(ObjectContainer basep) throws ParseException {

        if (BuscarOpcion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selección invalida");
//            deshabilitarParametros();
        } else {
            if (BuscarOpcion.getSelectedIndex() == 1) {
//                deshabilitarParametros();
                Curso Cbuscar = new Curso(null, null, null, 0, null, null, null, null);

                ObjectSet result = basep.get(Cbuscar);
                MostrarDatos(result);
            } else {
                if (BuscarOpcion.getSelectedIndex() == 2) {
//                    deshabilitarParametros();
                    String IDAux = JOptionPane.showInputDialog("Ingrese la cedula a consultar");
//Ojo
                    Curso Cbuscar = new Curso(null, null, null, 0, null, null, null, null);

                    ObjectSet result = basep.get(Cbuscar);
                    MostrarDatos(result);

                } else {
                    if (BuscarOpcion.getSelectedIndex() == 3) {
//                      habilitarParametros();
                        BuscarParametros(basep);
                    }
                }
            }
        }

        //Borrar la eleccion y ponerla al inicio
        BuscarOpcion.setSelectedIndex(0);
    }
    public void habilitarParametros() {
        
        
    }
    public void deshabilitarParametros() {
        
    }
    public void BuscarParametros(ObjectContainer basep) throws ParseException {
        
    }
    public void MostrarDatos(ObjectSet result) {
        String matrizescursos[][] = new String[result.size()][8];

        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "El CURSO NO SE ENCUENTRA EN LA BASE DE DATOS!!");
        } else {
            for (int i = 0; i < result.size(); i++) {

                Curso miC = new Curso();

                miC = (Curso) result.get(i);
                matrizescursos[i][0] = miC.getId_pro();
                matrizescursos[i][1] = miC.getNombre_cur();
                matrizescursos[i][2] = miC.getPrecio();
                matrizescursos[i][3] = miC.getDuracion();
                matrizescursos[i][4] = miC.getSilabo();
                matrizescursos[i][5] = miC.getDeescripcion();
                matrizescursos[i][6] = miC.getCod_car();
                matrizescursos[i][7] = miC.getId_pro();

                tablaConsultar.setModel(new javax.swing.table.DefaultTableModel(matrizescursos, new String[]{"Codigo Curso", "Nombre", "Precio", "Duracion", "Silabo","Descripcion", "Codigo Carrera", "ID_Producto"}));

            }
        }

    }
    public void Eliminar_Curso(ObjectContainer basep) {

        Curso Cinterfaz = new Curso();//Crear un objeto de la clase Estudiantes para traer el metodo Comprobar_Estudiantes

        if (txtcodigoC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID no valido");
        } else {

            String txtCodigoCo = txtcodigoC.getText();
            Curso cursoElim = new Curso(txtCodigoCo,null, null, 0, null, null, null, null);
            ObjectSet result = basep.get(cursoElim);

            if (Cinterfaz.Comprobar_Cursos(basep, txtCodigoCo) == 0) {

                JOptionPane.showMessageDialog(null, "EL CURSO NO EXISTE EN LA BASE DE DATOS");

            } else {
                Curso Cursoeliminar = (Curso) result.next();

                basep.delete(Cursoeliminar);
                JOptionPane.showMessageDialog(null, "EL CURSO FUE ELIMINADO DE LA BASE DE DATOS CORRECTAMENTE");
            }
        }
        //Borrar el campo de texto
        txtcodigoC.setText("");
    }
    public void Cerrar_BD(ObjectContainer basep) {

        basep.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BuscarOpcion;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaConsultar;
    private javax.swing.JTextField txtcodigoC;
    // End of variables declaration//GEN-END:variables

    private void Buscar_EstudianteID(ObjectContainer BaseD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
