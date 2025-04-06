/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author user
 */
import model.Empleado;
import model.Departamento;
import java.util.ArrayList;
import model.Temporal;

public class Controlador {
    private ArrayList<Empleado> empleados;
    private ArrayList<Temporal> temporales;
    private ArrayList<Departamento> departamentos;

    public Controlador() {
        this.empleados = new ArrayList<>();
        this.departamentos = new ArrayList<>();
        this.temporales = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        try {
            empleados.add(empleado);
            System.out.println("Empleado agregado correctamente");
        } catch (Exception e) {
            System.out.println("Ingresar informacion del empleado valida");
        }  
    }
    
    public void agregarEmpleado(Temporal temporal) {
        try {
            temporales.add(temporal);
            System.out.println("Empleado agregado correctamente");
        } catch (Exception e) {
            System.out.println("Ingresar informacion del empleado valida");
        }  
    }

    public void eliminarEmpleado(int id) {
        try {
            empleados.removeIf(empleado -> empleado.getId() == id);
            System.out.println("Empleado con el ID " + id + " ha sido eliminado correctamente");   
        } catch (Exception e) {
            System.out.println("Ingresar el id de empleado a elminar correcto");
        }
    }
    
    public void eliminarEmpleadoT(int id) {
        try {
            temporales.removeIf(temporal -> temporal.getId() == id);
            System.out.println("Empleado con el ID " + id + " ha sido eliminado correctamente");   
        } catch (Exception e) {
            System.out.println("Ingresar el id de empleado a elminar correcto");
        }
    }

    public void eliminarDepartamento(int id) {
        try {
            departamentos.removeIf(departamento -> departamento.getId() == id);
            System.out.println("Departamento con el ID " + id + " ha sido eliminado correctamente");
        } catch (Exception e) {
            System.out.println("Ingresar el id de departamento a elminar correcto");
        }

    }

    public void agregarDepartamento(Departamento departamento) {
        try {
            departamentos.add(departamento);
            System.out.println("Departamento agregado correctamente");
        } catch (Exception e) {
            System.out.println("Ingresar informacion del empleado valida");
        }

    }
    
    // devuelve todo el array
    public Empleado buscarEmpleadoId(int id) {
    for (int i = 0; i < empleados.size(); i++) {
        if (empleados.get(i).getId() == id) {
            return empleados.get(i);
        }
    }
    return null;
    }
    
    //devolver id
    private int buscarIdEmpleado(int id) {
        for (int i = 0; i < empleados.size(); i++){
        if (empleados.get(i).getId() == id) {
            return empleados.get(i).getId();
        }    
        }
        return -1;
    }
    
        public Temporal buscarEmpleadoIdT(int id) {
        for (int i = 0; i < temporales.size(); i++) {
        if (temporales.get(i).getId() == id) {
            return temporales.get(i);
        }
    }
    return null;
    }
    
    //devolver id
    private int buscarIdEmpleadoT(int id) {
        for (int i = 0; i < temporales.size(); i++){
        if (temporales.get(i).getId() == id) {
            return temporales.get(i).getId();
        }    
        }
        return -1;
    }
    
    // devuelve todo el array
    private Departamento buscarDepartamentoId(int id) {
        for (int i = 0; i < departamentos.size(); i++) {
            if (departamentos.get(i).getId() == id)
                return departamentos.get(i);
        }
        return null;
    }
    
    //devolver id
    private int buscarIdDepartamento(int id) {
        for (int i = 0; i < departamentos.size(); i++) {
            if (departamentos.get(i).getId() == id)
                return departamentos.get(i).getId();
        }
        return -1;
    }

    public void asignarEmpleadoDepartamento(int idEmpleado, int idDepartamento) {
        try {
            Empleado empleado = buscarEmpleadoId(idEmpleado);
            Departamento d = buscarDepartamentoId(idDepartamento);

            if (empleado != null && d != null) {
                d.setCantidadEmpleados(d.getCantidadEmpleados() + 1);
                System.out.println("El empleado " + empleado.getNombre() + " ha sido asignado a el departamento: " + d.getNombre());
            } else {
                System.out.println("Departamento o empleado no encontrado");
            }
        } catch (Exception e) {
            System.out.println("ingrear id valido");
        }
    }
    
    public void asignarEmpleadoTemporalDepartamento(int idEmpleado, int idDepartamento) {
        try {
            Temporal temporal = buscarEmpleadoIdT(idEmpleado);
            Departamento d = buscarDepartamentoId(idDepartamento);

            if (temporal != null && d != null) {
                d.setCantidadEmpleados(d.getCantidadEmpleados() + 1);
                System.out.println("El empleado " + temporal.getNombre() + " ha sido asignado a el departamento: " + d.getNombre());
            } else {
                System.out.println("Departamento o empleado no encontrado");
            }
        } catch (Exception e) {
            System.out.println("ingrear id valido");
        }
    }
    
    public void eliminarEmpleadoDepartamento(int idEmpleado, int idDepartamento) {
        try {
            Empleado empleado = buscarEmpleadoId(idEmpleado);
            Departamento d = buscarDepartamentoId(idDepartamento);

            if (empleado != null && d != null) {
                d.setCantidadEmpleados(d.getCantidadEmpleados() - 1);
                System.out.println("El empleado " + empleado.getNombre() + " ha sido eliminado del departamento: " + d.getNombre());
            } else {
                System.out.println("Departamento o empleado no encontrado");
            }
        } catch (Exception e) {
            System.out.println("ingrear id valido");
        }
    }
    
        public void eliminarEmpleadoTemporalDepartamento(int idEmpleado, int idDepartamento) {
        try {
            Temporal temporal = buscarEmpleadoIdT(idEmpleado);
            Departamento d = buscarDepartamentoId(idDepartamento);

            if (temporal != null && d != null) {
                d.setCantidadEmpleados(d.getCantidadEmpleados() - 1);
                System.out.println("El empleado " + temporal.getNombre() + " ha sido eliminado del departamento: " + d.getNombre());
            } else {
                System.out.println("Departamento o empleado no encontrado");
            }
        } catch (Exception e) {
            System.out.println("ingrear id valido");
        }
    }

    public String mostrarEmpleados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleados:\n");
            for (int i = 0; i < empleados.size(); i++) {
                Empleado e = empleados.get(i);
                sb.append("ID: ").append(e.getId())
                .append(" | Nombre del empleado: ")
                .append(e.getNombre()).append(" ")
                .append(e.getApellido()).append(" ")
                .append(" | Cargo del empleado: ")
                .append(e.getCargo()).append(" ")
                .append(" | Correo del empleado: ")
                .append(e.getCorreo()).append("\n\n");
            }

        return sb.toString();
    }
    
    public String mostrarEmpleadosT() {
    StringBuilder sb = new StringBuilder();
    sb.append("Empleados Temporales:\n");
        for (int i = 0; i < temporales.size(); i++) {
            Temporal t = temporales.get(i);
            sb.append("ID: ").append(t.getId())
            .append(" | Nombre del empleado: ").append(t.getNombre()).append(" ").append(t.getApellido())
            .append(" | Cargo del empleado: ").append(t.getCargo()).append(" ")
            .append(" | Correo del empleado: ").append(t.getCorreo()).append(" ")
            .append(" | Fecha inicio: ").append(t.getFechainicio()).append(" ")
            .append(" | Fecha final: ").append(t.getFechafinal())
            .append("\n\n");
        }

        return sb.toString();
    }

    public void mostrarDepartamentos() {
    System.out.println("Lista de Departamentos:");
        for (int i = 0; i < departamentos.size(); i++) {
            Departamento d = departamentos.get(i); 
            System.out.println("ID: " + d.getId() +  " | Nombre del departamento: " + d.getNombre()+"\n");
        }
    }
    
    public Empleado actualizarEmpleado(int id, Empleado empleado){
        try {
            int index = buscarIdEmpleado(id);
            if (index > 0) {
                System.out.println("Empleado actualizado");
                return empleados.set((index-1),empleado);
            } else {
                System.out.println("Empleado no encontrado");
                return null;
            }
        } catch (Exception e) {
            System.out.println("ingresar la informacion del empleado valida");
            return null;
        }
    }
    
    public Temporal actualizarEmpleado(int id, Temporal temporal){
        try {
            int index = buscarIdEmpleadoT(id);
            if (index > 0) {
                System.out.println("Empleado actualizado");
                return temporales.set((index-1),temporal);
            } else {
                System.out.println("Empleado no encontrado");
                return null;
            }
        } catch (Exception e) {
            System.out.println("ingresar la informacion del empleado valida");
            return null;
        }
    }
    
    public Departamento actualizarDepartameto(int id, Departamento departamento){
        try {    
            int index = buscarIdDepartamento(id);
                if (index >= 0) {
                    System.out.println("Apartamento actualizado");
                    return departamentos.set((index-1),departamento);
                } else {
                    System.out.println("Departamento no encontrado");
                    return null;
                }
        } catch (Exception e) {
            System.out.println("ingresar la informacion del departamento valida");
            return null;
        }
    }
    
    
    public void actualizarPermanencia(int id) {
        try {            
            Empleado empleado = buscarEmpleadoId(id);
                if (empleado != null) {
                    empleado.setPermanente(true);
                    System.out.println("Se actualizo correctamente la permanencia del empleado");
                } else {
                System.out.println("No se encontró el empleado");
                }
        } catch (Exception e) {
            System.out.println("Ingresar id de empleado valido");
        }
    }
}



