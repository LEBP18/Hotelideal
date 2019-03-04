/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelideal;

/**
 *
 * @author Usuario
 */
public class Huesped {
    private int id_huesped;
    private String nombre;
    private int dni;
    private String domicilio;
    private String correo;
    private long celular;

    public Huesped(int id_huesped, String nombre, int dni, String domicilio, String correo, long celular) {
        this.id_huesped = id_huesped;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }

    public Huesped(String nombre, int dni, String domicilio, String correo, long celular) {
        id_huesped=-1;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }

    public Huesped() {
        id_huesped=-1;
    }

    public Huesped(int id_huesped) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_huesped() {
        return id_huesped;
    }

    public void setId_huesped(int id_huesped) {
        this.id_huesped = id_huesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    
    public String toString() {
        return "Huesped{" + "id_huesped=" + id_huesped + ", nombre=" + nombre + '}';
    }
    
}
