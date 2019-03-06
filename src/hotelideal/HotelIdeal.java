

package hotelideal;

import java.util.logging.Level;
import java.util.logging.Logger;


public class HotelIdeal {

    
    public static void main(String[] args) {
        
       
        try {
            Conexion conexion;
            conexion = new Conexion
                        ("jdbc:mysql://localhost/hotelidealgrupo5", "root","");
            
        
       /* HabitacionData habitacionData =new HabitacionData(conexion);
        Habitacion habitacion =new Habitacion(1, 1, true, 1);
        habitacionData.guardarHabitacion(habitacion);
         */   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HotelIdeal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        /*
        huespedData = new HuespedData(conexion);
        Huesped huesped = new Huesped();
        //huesped.setId_huesped(20);
        huespedData.borrarHuesped(20);
        
      */   
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package hotelideal;

import java.util.logging.Level;
import java.util.logging.Logger;

 *
 * @author Usuario

public class HotelIdeal {
    
     * @param args the command line arguments
    
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion conexion;
        Huesped huesped = new Huesped("Sandra",1733344,"Las cañitas","sandra@gmail.com",26645566);
        try {
            conexion = new Conexion("jdbc:mysql://localhost/universidad", "root", "");
            HuespedData huespedData = new HuespedData(conexion);
            huespedData.guardarHuesped(huesped);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HotelIdeal.class.getName()).log(Level.SEVERE, null, ex);
        }
        


                                              
            //PARA INSCRIBIR PERSONA
            PersonaData personadata = new PersonaData (conexion);
            Persona persona1 = new Persona ("Majo", 38750019, 15474985);
            personadata.inscribirPersona(persona1);
            System.out.println("El id de la persona es: " + persona1.getNombrePersona());
             /* 
            CursoData cursodata=new CursoData(conexion);
            Curso matematica=new Curso ("matematica","esta bueno",150,20,1);
            cursodata.altaCurso(matematica);
            System.out.println("El id del curso es: " + curso1.getId_curso());
            
            PARA CONSULTAR PERSONA
            personadata.listaPersonas().forEach(Persona->{System.out.println("ID: " + Persona.getId_persona());});
           
            PARA BORRAR PERSONA
            Persona persona= new Persona();
            persona.setId_persona(5);
            persondadata.borrarPersona;




    }
    
} */
