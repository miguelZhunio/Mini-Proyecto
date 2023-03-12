/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.proyecto;

import clases.Carrera;
import clases.Certifica;
import clases.Curso;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import static mini.proyecto.Estudiante_Crear.Cerrar_BD;


public class certifica_consultar extends javax.swing.JFrame {

   
    public certifica_consultar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Comsulta de Certidicados");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIDCER = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsultar = new javax.swing.JTable();
        btnElimianr = new javax.swing.JButton();
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
        jLabel1.setText("Consultar Certificado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 250, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 110, 50));

        jLabel2.setText("ID Certificado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        txtIDCER.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtIDCER, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 130, 30));

        tablaConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo Curso", "Fecha Certificado", "Mensaje", "Codigo Carrera", "Cedula Estudiante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaConsultar);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 740, 120));

        btnElimianr.setText("Eliminar");
        btnElimianr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimianrActionPerformed(evt);
            }
        });
        jPanel1.add(btnElimianr, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 90, 40));

        BuscarOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Ver todos", "Codigo Certificado", "Fecha" }));
        jPanel1.add(BuscarOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Buscar_Certificado(BaseD);
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnElimianrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimianrActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        try {
            Eliminar_Certificado(BaseD);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(certifica_consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Cerrar_BD(BaseD);
    }//GEN-LAST:event_btnElimianrActionPerformed
    
    public void Buscar_Certificado(ObjectContainer basep) {       
        if (BuscarOpcion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONA UNA OPCION");
        } else {

            if (BuscarOpcion.getSelectedIndex() == 1) {
                Certifica Cerbuscar = new Certifica(null, null,null,null,null);
                ObjectSet result = basep.get(Cerbuscar);
                MostrarDatos(result);

            } else {
                if (BuscarOpcion.getSelectedIndex() == 2) {
                    String cod_cer = JOptionPane.showInputDialog("INGRESE EL CODIGO A CONSULTAR");
                    Certifica Cerbuscar = new Certifica(cod_cer,null,null,null,null);
                    ObjectSet result = basep.get(Cerbuscar);
                    MostrarDatos(result);
                } else {
                    if (BuscarOpcion.getSelectedIndex() == 3) {
                        String fecha_cer = JOptionPane.showInputDialog("INGRES LA FECHA A CONSULTAR");
                        Certifica Cbuscar = new Certifica(null,null,null,null,fecha_cer);
                        ObjectSet result = basep.get(Cbuscar);
                        MostrarDatos(result);
                    } 
                }
            }
        }
        //Borrar la eleccion y ponerla al inicio
        BuscarOpcion.setSelectedIndex(0);
    }
    public void MostrarDatos(ObjectSet result) {
        String matrizcertificado[][] = new String[result.size()][5];

        if (result.size() == 0) {
            JOptionPane.showMessageDialog(null, "EL CERTIFICADO NO EXISTE");
        } else {
            for (int i = 0; i < result.size(); i++) {
                Certifica miCer = new Certifica();

                miCer = (Certifica) result.get(i);
                matrizcertificado[i][0] = miCer.getCod_cer();
                matrizcertificado[i][1] = String.valueOf(miCer.getFecha_cer());
                matrizcertificado[i][2] = miCer.getMensaje();
                matrizcertificado[i][3] = miCer.getCod_car();
                matrizcertificado[i][4] = miCer.getCed_est();

                tablaConsultar.setModel(new javax.swing.table.DefaultTableModel(matrizcertificado, new String[]{"Codigo Certificado", "Fecha", "Mensaje","Codigo Carrera","Cedula Estudiante"}));
            }
        }
    }
    public void Eliminar_Certificado(ObjectContainer basep) throws ParseException  {
        certifica_crear Cinterfaz = new certifica_crear();
        if (txtIDCER.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN CODIGO");
        } else {

            String IDA = txtIDCER.getText();
            Certifica cerbuscar = new Certifica(IDA, null,null,null,null);
            ObjectSet result = basep.get(cerbuscar);

            if (Cinterfaz.Comprobar_Certificado(basep, IDA) == 0) {
                JOptionPane.showMessageDialog(null, "EL CERTIFICADO NO EXISTE EN LA BASE  DE DATOS");

            } else {
                Certifica cerEliminado = (Certifica) result.next();
                basep.delete(cerEliminado);
                JOptionPane.showMessageDialog(null, "EL CERTIFICADO FUE ELIMINADO CORRECTAMENTE");
            }
        }
        //Borrar el campo de texto
        txtIDCER.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BuscarOpcion;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnElimianr;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaConsultar;
    private javax.swing.JTextField txtIDCER;
    // End of variables declaration//GEN-END:variables

    
}
