/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelideal.vistas;

import hotelideal.Conexion;
import hotelideal.TipoDeHabitacion;
import hotelideal.TipoDeHabitacionData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LEBP
 */
public class VistaTipoDeHabitacion extends javax.swing.JInternalFrame {
private TipoDeHabitacionData tipoDeHabitacionData;
private Conexion conexion;
    /**
     * Creates new form VistaTipoDeHabitacion
     */
    public VistaTipoDeHabitacion() {
        initComponents();
        try {
            conexion = new Conexion("jdbc:mysql://localhost/hotelidealgrupo5", "root", "");
            tipoDeHabitacionData = new TipoDeHabitacionData(conexion);
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaTipoDeHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jtId = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jtCantCamas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtCantPersonas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbTipoCama = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        btLimpiar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Hotel Ideal");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Habitación"));

        jtId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdActionPerformed(evt);
            }
        });

        jLabel6.setText("Cantidad Camas");

        jtCantCamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCantCamasActionPerformed(evt);
            }
        });

        jLabel2.setText("Id");

        jLabel3.setText("Tipo Habitacion");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estándar simple", "Doble", "Triple", "Suite Lujo" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad Personas (Max)");

        jtCantPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCantPersonasActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo Cama");

        cbTipoCama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simples", "Queen", "King Size" }));

        jLabel4.setText("Precio Por Noche");

        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btBorrar.setText("Borrar");
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });

        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipoCama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtBuscar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btModificar)
                                .addGap(37, 37, 37)
                                .addComponent(btBorrar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpiar)
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addComponent(BtBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpiar)
                    .addComponent(btGuardar)
                    .addComponent(btModificar)
                    .addComponent(btBorrar))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Tipo de Habitación");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCantCamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCantCamasActionPerformed
        // TODO add your handling code here:
        jtCantCamas.transferFocus();
    }//GEN-LAST:event_jtCantCamasActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
        cbTipo.transferFocus();
    }//GEN-LAST:event_cbTipoActionPerformed

    private void jtCantPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCantPersonasActionPerformed
        // TODO add your handling code here:
        jtCantPersonas.transferFocus();
    }//GEN-LAST:event_jtCantPersonasActionPerformed

    private void jtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioActionPerformed
        // TODO add your handling code here:
        jtPrecio.transferFocus();
    }//GEN-LAST:event_jtPrecioActionPerformed

    private void jtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
        jtId.setText("");
        jtPrecio.setText("");
        jtCantCamas.setText("");
        jtCantPersonas.setText("");
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
        int cant_camas=Integer.parseInt(jtCantCamas.getText()); 
        int max_personas=Integer.parseInt(jtCantPersonas.getText());
        double precio_noche=Double.parseDouble(jtPrecio.getText());
        String tipo_camas = (String) cbTipoCama.getSelectedItem();
        String tipo = (String) cbTipo.getSelectedItem();
        
        TipoDeHabitacion tipoDeHabitacion = new TipoDeHabitacion(tipo, max_personas, cant_camas, tipo_camas, precio_noche);
        tipoDeHabitacionData.guardarTipoDeHabitacion(tipoDeHabitacion);
        jtId.setText(tipoDeHabitacion.getId_tipo_de_habitacion()+"");
        JOptionPane.showMessageDialog(null, " El tipo de habitación fue registrado satisfactoriamente ");

        // En blanco los campos de texto y actualiza tabla
        
        jtPrecio.setText("");
        jtCantCamas.setText("");
        jtCantPersonas.setText("");
        
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(jtId.getText());
        tipoDeHabitacionData.borrarTipoDeHabitacion(id);
        
         JOptionPane.showMessageDialog(null, " El tipo de habitación se borró satisfactoriamente ");
    }//GEN-LAST:event_btBorrarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        // TODO add your handling code here:
        if (jtId.getText() != null){
            int id_tipo_de_habitacion = Integer.parseInt (jtId.getText());
            int cant_camas=Integer.parseInt(jtCantCamas.getText()); 
            int max_personas=Integer.parseInt(jtCantPersonas.getText());
            double precio_noche=Double.parseDouble(jtPrecio.getText());
            String tipo_camas = (String) cbTipoCama.getSelectedItem();
            String tipo = (String) cbTipo.getSelectedItem(); 
            TipoDeHabitacion tipoDeHabitacion = new TipoDeHabitacion(id_tipo_de_habitacion, tipo, max_personas, cant_camas, tipo_camas, precio_noche);
            tipoDeHabitacionData.actualizarTipoDeHabitacion(tipoDeHabitacion);
            
             JOptionPane.showMessageDialog(null, " El tipo de habitación se modificó satisfactoriamente ");
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(jtId.getText());
        TipoDeHabitacion tipoDeHabitacion = tipoDeHabitacionData.buscarTipoDeHabitacion(id);
        if(tipoDeHabitacion !=null){
            jtId.setText(tipoDeHabitacion.getId_tipo_de_habitacion()+"");
            jtCantCamas.setText(tipoDeHabitacion.getCant_camas()+"");
            jtCantPersonas.setText(tipoDeHabitacion.getMax_personas()+"");
            jtPrecio.setText(tipoDeHabitacion.getPrecio_noche()+"");
            //String tipo= tipoDeHabitacion.getId_tipo_de_habitacion().getTipo();
             //   cbxTipoHabitacion.setSelectedItem(tipo);
            String tipo=tipoDeHabitacion.getTipo();
            //id=tipoHabitacion.getId_tipoHabitacion();
            String tipoCama=tipoDeHabitacion.getTipo_camas(); 
             
            cbTipoCama.setSelectedItem(tipoCama);
            cbTipo.setSelectedItem(tipo);
             
            //cbTipo.setToolTipText(tipoDeHabitacion.getTipo()+"");
            //cbTipoCama.setToolTipText(tipoDeHabitacion.getTipo_camas()+"");
        }else{
          JOptionPane.showMessageDialog(this, "El tipo de habitacion no se encuentra cargada\n Complete los campos para agregar una nueva");
        }
    }//GEN-LAST:event_BtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> cbTipoCama;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtCantCamas;
    private javax.swing.JTextField jtCantPersonas;
    private javax.swing.JFormattedTextField jtId;
    private javax.swing.JTextField jtPrecio;
    // End of variables declaration//GEN-END:variables
}
