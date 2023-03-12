
package mini.proyecto;

import clases.Certifica;
import clases.Curso;
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
import static mini.proyecto.curso_modificar.Cerrar_BD;

public class certifica_modificar extends javax.swing.JFrame { 
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private String cod_cer= "";
    private String cod_car = "";
    private String ced_est = "";
    private Date fecha_cer = null;
    private String mensaje = "";
    MaskFormatter mascara;   
    public certifica_modificar() throws ParseException {
        initComponents();
        mascara = new MaskFormatter("##/##/####");
        mascara.setPlaceholderCharacter('-');
        this.setLocationRelativeTo(null);
        this.setTitle("Modificar Certificado");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtconsultarcer = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Fecha = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mensaje = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaModificar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Certificado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 290, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("Fecha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 80, 50));

        jLabel10.setText("Codigo Certificado:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtconsultarcer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtconsultarcerKeyTyped(evt);
            }
        });
        jPanel1.add(txtconsultarcer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, 20));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 50));

        jLabel11.setText("Mensaje:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));
        jPanel1.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 120, -1));

        Mensaje.setColumns(20);
        Mensaje.setRows(5);
        jScrollPane1.setViewportView(Mensaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        tablaModificar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaModificar);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 740, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        MiniProyecto m = new MiniProyecto();
        m.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtconsultarcerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconsultarcerKeyTyped
        char aux = evt.getKeyChar();
        boolean numeros = aux >= '0' && aux <= '9';
        if (!numeros) {
            System.out.println("Ingreso erroneo: " + evt.getKeyChar());
            evt.consume();
        } else if (txtconsultarcer.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtconsultarcerKeyTyped

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        try {
            buscar(BaseD);
        } catch (ParseException ex) {
            Logger.getLogger(certifica_modificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        Cerrar_BD(BaseD);               
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        ObjectContainer BaseD = Db4o.openFile(MiniProyecto.direccionBD);
        try {
            Modificar_Certificado(BaseD);
        } catch (ParseException ex) {
            Logger.getLogger(certifica_modificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        Cerrar_BD(BaseD);
        txtconsultarcer.setEditable(true);
    }//GEN-LAST:event_btnModificarActionPerformed
    public void buscar(ObjectContainer basep) throws ParseException {//cargardatos
        btnModificar.setEnabled(false);
        String IDAux;
        IDAux = txtconsultarcer.getText();

        certifica_crear EAux = new certifica_crear();

        if (txtconsultarcer.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "INGRESE UN CODIGO");
        } else {
            if (EAux.Comprobar_Certificado(basep, IDAux) == 0) {
                JOptionPane.showMessageDialog(null, "EL CURSO NO EXISTE EN LA BASE DE DATOS");
                LimpiarCamposdeTexto();
            } else {
                Curso CursoBuscar = new Curso(null, null, IDAux, 0, null, null, null, null);

                ObjectSet result = basep.get(CursoBuscar);
                for (int i = 0; i < result.size(); i++) {

                    Certifica miC = new Certifica();
                    miC = (Certifica) result.get(i);
                    Fecha.setText(String.valueOf(miC.getFecha_cer()));
                    Mensaje.setText(miC.getMensaje());                    
                }
                //Hacer editable los campos de texto
                HabilitarCampos_deTexto();
                txtconsultarcer.setEditable(false);
            }
        }
    }
    public void asignarVariables(ObjectContainer basep) throws ParseException {
        cod_cer = txtconsultarcer.getText();
        fecha_cer = formato.parse(Fecha.getText());
        mensaje = Mensaje.getText();
    }
    public void Modificar_Certificado(ObjectContainer basep) throws ParseException {            
                Certifica Cmodi = new Certifica(txtconsultarcer.getText(), null,null,null, null);
                ObjectSet result = basep.get(Cmodi);
                Certifica CertificadoModificar = (Certifica) result.next();
                CertificadoModificar.setFecha_cer(formato.parse(Fecha.getText()));
                CertificadoModificar.setMensaje(Mensaje.getText());
                JOptionPane.showMessageDialog(null, "El CERTIFICADO FUE MODIFICADO CORRECTAMENTE");
                LimpiarCamposdeTexto();           
    } 
        public void LimpiarCamposdeTexto() {
        txtconsultarcer.setText("");
        Fecha.setText("");
        Mensaje.setText("");   
    }
    public void HabilitarCampos_deTexto() {
        txtconsultarcer.setEditable(true);
        Fecha.setEditable(true);
        Mensaje.setEditable(true);
    }        
    public static void Cerrar_BD(ObjectContainer basep) {
        basep.close();
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Fecha;
    private javax.swing.JTextArea Mensaje;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaModificar;
    private javax.swing.JTextField txtconsultarcer;
    // End of variables declaration//GEN-END:variables
}
