/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelideal.vistas;

import hotelideal.Conexion;
import hotelideal.Habitacion;
import hotelideal.HabitacionData;
import hotelideal.TipoDeHabitacion;
import hotelideal.TipoDeHabitacionData;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class VistaHabitacion extends javax.swing.JInternalFrame {
  private HabitacionData habitacionData;
  private TipoDeHabitacionData tipoDeHabitacionData;
  private int id_habitacion;
  private Conexion conexion;
  
    
    public VistaHabitacion() {
        initComponents();
    
       try {
            conexion=new Conexion("jdbc:mysql://localhost/hotelidealgrupo5","root","");
               habitacionData=new HabitacionData(conexion);
               tipoDeHabitacionData=new TipoDeHabitacionData(conexion);
               
               //JtId.setEnabled(false);
               
         } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaHabitacion.class.getName()).log(Level.SEVERE, null, ex);
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
        jcOcupado = new javax.swing.JCheckBox();
        tipo = new javax.swing.JLabel();
        JtNumero = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        JtPiso = new javax.swing.JTextField();
        BtGuardar = new javax.swing.JButton();
        BtLimpiar = new javax.swing.JButton();
        BtModificar = new javax.swing.JButton();
        BtBorrar = new javax.swing.JButton();
        numero = new javax.swing.JLabel();
        JtId = new javax.swing.JTextField();
        piso = new javax.swing.JLabel();
        BtBuscar = new javax.swing.JButton();
        estado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Hotel Ideal");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestión Habitación"));

        jcOcupado.setText("Libre");
        jcOcupado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcOcupadoActionPerformed(evt);
            }
        });

        tipo.setText("Tipo de habitacion");

        JtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtNumeroActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Estándar simple", "Doble", "Triple", "Suite Lujo" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        JtPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtPisoActionPerformed(evt);
            }
        });

        BtGuardar.setText("Guardar");
        BtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtGuardarActionPerformed(evt);
            }
        });

        BtLimpiar.setText("Limpiar");
        BtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimpiarActionPerformed(evt);
            }
        });

        BtModificar.setText("Actualizar");
        BtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtModificarActionPerformed(evt);
            }
        });

        BtBorrar.setText("Borrar");
        BtBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBorrarActionPerformed(evt);
            }
        });

        numero.setText("Numero");

        piso.setText("Piso");

        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        estado.setText("Estado");

        jLabel1.setText("ID");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/descarga.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(piso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(BtModificar)
                                .addGap(18, 18, 18)
                                .addComponent(BtBorrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JtId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JtNumero, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JtPiso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(BtBuscar))
                            .addComponent(jcOcupado)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(BtLimpiar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtBuscar))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numero)
                            .addComponent(JtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(piso)
                            .addComponent(JtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estado)
                            .addComponent(jcOcupado))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipo)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtGuardar)
                    .addComponent(BtModificar)
                    .addComponent(BtBorrar)
                    .addComponent(BtLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
 

       
    private void JtPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtPisoActionPerformed

    private void BtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtGuardarActionPerformed
        // TODO add your handling code here:
        int numero = Integer.parseInt(JtNumero.getText());
        int piso = Integer.parseInt(JtPiso.getText());
        boolean estado = jcOcupado.isSelected();
            if (jcOcupado.isSelected()){
              estado = true;
            } else{estado=false;}
         
            TipoDeHabitacion tipo_de_habitacion = tipoDeHabitacionData.buscarxTipoDeHabitacion(cbTipo.getSelectedItem()+"");
           
        //String tipo_de_habitacion = (String) cbTipo.getSelectedItem();
        
        Habitacion habitacion=new Habitacion(numero,piso,estado,tipo_de_habitacion);
        
        habitacionData.guardarHabitacion(habitacion);         
        JtId.setText(habitacion.getId_habitacion()+"");
        JOptionPane.showMessageDialog(rootPane, "La Habitacion Nro "+ numero +" se guardó Correctamente");   
    }//GEN-LAST:event_BtGuardarActionPerformed

    private void BtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimpiarActionPerformed
        // TODO add your handling code here:
        JtId.setText("");
        JtNumero.setText("");
        JtPiso.setText("");
       jcOcupado.setSelected(false);
        
       
    }//GEN-LAST:event_BtLimpiarActionPerformed

    private void JtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtNumeroActionPerformed

    private void BtBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBorrarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(JtId.getText());
        habitacionData.borrarHabitacion(id);
        
         JOptionPane.showMessageDialog(null, " La habitación se borró satisfactoriamente ");
        
         JtId.setText("");
        JtNumero.setText("");
        JtPiso.setText("");
       jcOcupado.setSelected(false);
    }//GEN-LAST:event_BtBorrarActionPerformed

    private void BtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtModificarActionPerformed
        // TODO add your handling code here:
        if(JtId.getText()!=null){    
        int id_habitacion = Integer.parseInt(JtId.getText());
        int numero = Integer.parseInt(JtNumero.getText());
        int piso = Integer.parseInt(JtPiso.getText());
        boolean estado = jcOcupado.isSelected();
            if (jcOcupado.isSelected()){
                estado = true;
            } else{estado=false;}
        TipoDeHabitacion tipo_de_habitacion = tipoDeHabitacionData.buscarxTipoDeHabitacion(cbTipo.getSelectedItem()+"");     
        Habitacion habitacion=new Habitacion(id_habitacion,numero,piso,estado,tipo_de_habitacion);
        habitacionData.actualizarHabitacion(habitacion);         
        //JtId.setText(habitacion.getId_habitacion()+"");
        JOptionPane.showMessageDialog(rootPane, "La Habitacion Nro "+ numero +" se modificó Correctamente");  
        }
       
        /*
        TipoDeHabitacion tipo_de_habitacion = new TipoDeHabitacion();
        tipo_de_habitacion.getTipo();
        tipoDeHabitacionData.buscarxTipoDeHabitacion(tipo_de_habitacion.getTipo());
        
        tipoDeHabitacionData.buscarxTipoDeHabitacion(JtTipo.getText());
        TipoDeHabitacion tipo_de_habitacion = JtTipo.getText();
        JtTipo1     
         */
    }//GEN-LAST:event_BtModificarActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(JtId.getText());
        Habitacion habitacion = habitacionData.buscarHabitacion(id);
        if (habitacion!=null) {
            JtId.setText(habitacion.getId_habitacion()+"");
            JtNumero.setText(habitacion.getNumero()+"");
            JtPiso.setText(habitacion.getPiso()+"");
            //jcOcupado.setText(habitacion.getEstado()+"");
            if(habitacion.isEstado()){
                    jcOcupado.setSelected(true);
                    
                }
           cbTipo.setSelectedItem(habitacion.getTipo_de_habitacion().getTipo());
                   
            
           // TipoDeHabitacion tipo_de_habitacion = tipoDeHabitacionData.buscarxTipoDeHabitacion(tipo);
            
           // cbTipo.setSelectedItem(tipo_de_habitacion);
           
            
            //JtTipo.setText(habitacion.getTipo_de_habitacion().getTipo());
            }else{
          JOptionPane.showMessageDialog(this, "La habitacion no se encuentra cargada\n Complete los campos para agregar una nueva");
        }
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void jcOcupadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcOcupadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcOcupadoActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
        cbTipo.transferFocus();
    }//GEN-LAST:event_cbTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBorrar;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtGuardar;
    private javax.swing.JButton BtLimpiar;
    private javax.swing.JButton BtModificar;
    private javax.swing.JTextField JtId;
    private javax.swing.JTextField JtNumero;
    private javax.swing.JTextField JtPiso;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcOcupado;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel piso;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables
}
