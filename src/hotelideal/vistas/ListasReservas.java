/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelideal.vistas;

import hotelideal.Conexion;
import hotelideal.Reserva;
import hotelideal.ReservaData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maqui's
 */
public class ListasReservas extends javax.swing.JInternalFrame {
private DefaultTableModel modelo;
private ArrayList<Reserva> obtenerReservas;
private ReservaData reservaData;
private Conexion conexion;
    /**
     * Creates new form ListasReservas
     */
    public ListasReservas() {
    initComponents();
        try {
        
        conexion = new Conexion("jdbc:mysql://localhost/hotelidealgrupo5", "root", "");
        
        modelo = new DefaultTableModel();
        
        reservaData=new ReservaData (conexion);
        obtenerReservas = (ArrayList) reservaData.obtenerReservas();
        
        armaCabeceraTabla();
        cargaDatos();
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ListasReservas.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
public void armaCabeceraTabla(){
    
        //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("FECHA INGRESO");
        columnas.add("FECHA SALIDA");
        columnas.add("IMPORTE TOTAL");
        columnas.add("ESTADO");
        columnas.add("HUESPED");
        columnas.add("HABITACION");
        columnas.add("CANTIDAD PERSONAS");
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        tbReservas.setModel(modelo);
  }
public void cargaDatos(){
            
            ReservaData rd=new ReservaData(conexion);
            obtenerReservas =(ArrayList) rd.obtenerReservas();
        
        for(Reserva r:obtenerReservas){
    
    modelo.addRow(new Object[]{r.getId_reserva(),r.getIngreso(),r.getEgreso(),r.getImporte_total(),r.getEstado(),r.getHuesped(),r.getHabitacion(),r.getCantidad_personas()});
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbReservas = new javax.swing.JTable();

        tbReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbReservas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbReservas;
    // End of variables declaration//GEN-END:variables
}