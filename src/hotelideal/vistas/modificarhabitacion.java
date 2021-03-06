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
public class modificarhabitacion extends javax.swing.JInternalFrame {
  private HabitacionData habitacionData;
  private TipoDeHabitacionData tipoDeHabitacionData;
  private int id_habitacion;
  private Conexion conexion;
    /**
     * Creates new form modificarhabitaciones
     */
    public modificarhabitacion() {
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

        modificarhabitacion = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JtId = new javax.swing.JTextField();
        JtNumero = new javax.swing.JTextField();
        JtPiso = new javax.swing.JTextField();
        JtEstado = new javax.swing.JTextField();
        JtTipo = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();

        modificarhabitacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modificarhabitacion.setText("Modificar Habitacion");

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        jBborrar.setText("Borrar");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Id");

        jLabel2.setText("Numero");

        jLabel3.setText("Piso");

        jLabel4.setText("Estado");

        jLabel5.setText("Tipo de habitacion");

        JtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtNumeroActionPerformed(evt);
            }
        });

        JtPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtPisoActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jBborrar)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JtId, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(JtNumero)
                            .addComponent(JtPiso)
                            .addComponent(JtEstado)
                            .addComponent(JtTipo))
                        .addGap(40, 40, 40)
                        .addComponent(Buscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(modificarhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Modificar)
                    .addComponent(jBborrar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
        private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed

    }//GEN-LAST:event_jBSalirActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
          try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(modificarhabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        int id_habitacion = Integer.parseInt(JtId.getText());
        int numero = Integer.parseInt(JtNumero.getText());
        int piso = Integer.parseInt(JtPiso.getText());
        boolean estado = Boolean.parseBoolean("true");
        TipoDeHabitacion tipo_de_habitacion = tipoDeHabitacionData.buscarxTipoDeHabitacion(JtTipo.getText());     
        Habitacion habitacion=new Habitacion(id_habitacion,numero,piso,estado,tipo_de_habitacion);
        habitacionData.actualizarHabitacion(habitacion);         
        //JtId.setText(habitacion.getId_habitacion()+"");
        JOptionPane.showMessageDialog(rootPane, "La Habitacion Nro "+ numero +" se guardó Correctamente");   
    }//GEN-LAST:event_ModificarActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBborrarActionPerformed

    private void JtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtNumeroActionPerformed

    private void JtPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtPisoActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(JtId.getText());
        Habitacion habitacion = habitacionData.buscarHabitacion(id);
        if (habitacion!=null) {
            JtId.setText(habitacion.getId_habitacion()+"");
            JtNumero.setText(habitacion.getNumero()+"");
            JtPiso.setText(habitacion.getPiso()+"");
            JtEstado.setText(habitacion.isEstado()+"");    
            //jcOcupado.setVisible(habitacion.getEstado());
            JtTipo.setText(habitacion.getTipo_de_habitacion().getTipo());
            }else{
          JOptionPane.showMessageDialog(this, "La habitacion no se encuentra cargada\n Complete los campos para agregar una nueva");
        }
    }//GEN-LAST:event_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField JtEstado;
    private javax.swing.JTextField JtId;
    private javax.swing.JTextField JtNumero;
    private javax.swing.JTextField JtPiso;
    private javax.swing.JTextField JtTipo;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton jBborrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel modificarhabitacion;
    // End of variables declaration//GEN-END:variables
}
