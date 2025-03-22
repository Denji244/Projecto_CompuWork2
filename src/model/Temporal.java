/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Temporal extends Empleado{
    private String fechainicio;
    private String fechafinal;
    
    
    public Temporal(int id, String nombre, String apellido, String cargo, String correo, String fechainicio, String fechafinal) {
        super(id, nombre, apellido, cargo, correo);
        this.fechainicio=fechainicio;
        this.fechafinal=fechafinal;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(String fechafinal) {
        this.fechafinal = fechafinal;
    }
}
