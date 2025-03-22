/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Departamento {
    private int id;
    private String nombre;
    private int cantidadEmpleados;
    private String ubicacion;

    public Departamento(int id, String nombre, int cantidadEmpleados, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadEmpleados = cantidadEmpleados;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getCantidadEmpleados() { return cantidadEmpleados; }
    public String getUbicacion() { return ubicacion; }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }
}