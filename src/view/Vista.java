/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author user
 */
import model.Empleado;
import model.Departamento;
import model.Temporal;

public class Vista {
    public void mostrarEmpleado(Empleado empleado) {
        System.out.println("Empleado: " + empleado.getNombre() + " " + empleado.getApellido() +
                           "\nCargo: " + empleado.getCargo() +
                           "\nCorreo: " + empleado.getCorreo() +
                           "\nPermanente: " + empleado.isPermanente());
    }
    
    public void mostrarEmpleado(Temporal temporal) {
        System.out.println("Empleado: " + temporal.getNombre() + " " + temporal.getApellido() +
                           "\nCargo: " + temporal.getCargo() +
                           "\nCorreo: " + temporal.getCorreo() +
                           "\nFecha inicio: " + temporal.getFechainicio()+
                           "\nFecha fin: " + temporal.getFechafinal());
    }

    public void mostrarDepartamento(Departamento departamento) {
        System.out.println("Departamento: " + departamento.getNombre() +
                           "\nCantidad de Empleados: " + departamento.getCantidadEmpleados() +
                           "\nUbicación: " + departamento.getUbicacion());
    }
}