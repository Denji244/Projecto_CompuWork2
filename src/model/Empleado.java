/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lucas y Juan Pablo 
 */

public class Empleado {
    private static int contador=1;
    private int id;
    private String nombre;
    private String apellido;
    private String cargo;
    private String correo;
    private boolean permanente;

    public Empleado(int id, String nombre, String apellido, String cargo, String correo, boolean permanente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.correo = correo;
        this.permanente = permanente;
    }

    
    public Empleado(String nombre, String apellido, String cargo, String correo, boolean permanente) {
        this.id = contador;
        contador++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.correo = correo;
        this.permanente = permanente;
    }
    
    public Empleado(int id, String nombre, String apellido, String cargo, String correo) {
        this.id = contador;
        contador++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.correo = correo;
    }
    
    public Empleado (String nombre, String apellido, String cargo, String correo) {
        this.id = contador;
        contador++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isPermanente() {
        return permanente;
    }

    public void setPermanente(boolean permanente) {
        this.permanente = permanente;
    }
    
    
}