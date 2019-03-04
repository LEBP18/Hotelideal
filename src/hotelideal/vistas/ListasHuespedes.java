/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelideal.vistas;

import hotelideal.Conexion;
import hotelideal.HabitacionData;
import hotelideal.Huesped;
import hotelideal.HuespedData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maqui's
 */
public class ListasHuespedes extends javax.swing.JInternalFrame {
private DefaultTableModel modelo;
private Conexion conexion;
private ArrayList<Huesped> listaHuespedes;
private HuespedData huespedData;
    /**
     * Creates new form ListasHuespedes
     */
    public ListasHuespedes() {
    initComponents();
        try {
                conexion = new Conexion("jdbc:mysql://localhost/hotelidealgrupo5", "root", "");
        
        modelo = new DefaultTableModel();
        
        huespedData=new HuespedData (conexion);
        listaHuespedes= (ArrayList) huespedData.obtenerHuespedes();
        
        armaCabeceraTabla();
        cargaDatos();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ListasHuespedes.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void armaCabeceraTabla(){
    
        //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("NOMBRE");
        columnas.add("DNI");
        columnas.add("DOMICILIO");
        columnas.add("CORREO");
        columnas.add("CELULAR");
       
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        tbHuespedes.setModel(modelo);
  }
    public void cargaDatos(){
            
            HuespedData hd =new HuespedData(conexion);
            listaHuespedes=(ArrayList) hd.obtenerHuespedes();
             
        //Llenar filas
        for(Huesped h:listaHuespedes){
          
            modelo.addRow(new Object[]{h.getId_huesped(),h.getNombre(),h.getDni(),h.getDomicilio(),h.getCorreo(),h.getCelular()});
               
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
        tbHuespedes = new javax.swing.JTable();

        tbHuespedes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbHuespedes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHuespedes;
    // End of variables declaration//GEN-END:variables

}