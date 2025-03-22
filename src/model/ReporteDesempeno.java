/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class ReporteDesempeno {
    private int idEmpleado;
    private int idDepartamento;

    public ReporteDesempeno() {
    }
    
    public ReporteDesempeno(int idEmpleado, int idDepartamento) {
        this.idEmpleado = idEmpleado;
        this.idDepartamento = idDepartamento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }
    
    public void generarReporteEmpleado(int idEmpleado) {
        try {
            System.out.println("Reporte de Empleado id: "+idEmpleado+"\n");
            System.out.println("Buen trabajo \n");
        } catch (Exception e) {
            System.out.println("Ingresar id del empleado valido");
        }
    }

    public void generarReporteDepartamento(int idDepartamento) {
        try {
            System.out.println("Reporte de Departamento id: "+idDepartamento+"\n");
            System.out.println("Buen trabajo \n");
        } catch (Exception e) {
            System.out.println("Ingresar id del departamento valido");
        }

    }

    public void generarReporteFinal(int idEmpleado, int idDepartamento) {
        try {
            System.out.println("Reporte Final id empleado: "+idEmpleado+" id departamento: "+idDepartamento+"\n");
            System.out.println("Buen trabajo \n");
        } catch (Exception e) {
            System.out.println("Ingresar id del departamento y del empleado valido");
        }
        
    }
}
