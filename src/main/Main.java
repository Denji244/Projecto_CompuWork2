/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
import controller.Controlador;
import model.Empleado;
import model.Departamento;
import java.util.Scanner;
import model.ReporteDesempeno;
import model.Temporal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();
        ReporteDesempeno reporte = new ReporteDesempeno();
        
        int indice;
        int indice2;
        int idViejo;
        int idViejo2;
        
        System.out.println("Bienvenido al sistema de Gestion de empleados \n");
        do {
            System.out.println("Ingresa lo que deseas hacer\n");
            System.out.println("1. Empleado\n");
            System.out.println("2. Departamento\n");
            System.out.println("3. Reportes\n");
            System.out.println("4. Cerrar\n");

            indice = scanner.nextInt();
            
            
            switch (indice) {
                case 1:
                        System.out.println("1. Agregar empleado\n");
                        System.out.println("2. Actualizar empleado\n");
                        System.out.println("3. Eliminar empleado\n");
                        System.out.println("4. Actualizar permanencia\n");
                        System.out.println("5. Mostrar empleados\n");
                        System.out.println("6. regresar\n");
                        indice2 = scanner.nextInt();
                        switch (indice2) {
                        case 1:
                            controlador.agregarEmpleado(new Empleado(1, "Juan", "Perez", "Analista", "juan@email.com", true));
                            controlador.agregarEmpleado(new Temporal (1, "Juan", "Perez", "Analista", "juan@email.com","21/03/2025","21/03/2027"));
                            break;
                        case 2:
                            System.out.println("Ingresa el id a actualizar");
                            idViejo = scanner.nextInt();
                            Empleado empleadoActualizado = new Empleado(idViejo, "Andres", "Gomez", "Ingeniero Senior", "juan.nuevo@example.com", false);
                            controlador.actualizarEmpleado(idViejo,empleadoActualizado);
                            break;
                        case 3:
                            System.out.println("El empleado es temporal?");
                            String pregunta = scanner.nextLine();
                            String respuesta="si";
                            if (pregunta.equalsIgnoreCase(pregunta)) {
                                System.out.println("ingresa el id a eliminar");
                                int idEliminar = scanner.nextInt();
                                controlador.eliminarEmpleadoT(idEliminar);
                            }else{
                                System.out.println("ingresa el id a eliminar");
                                int idEliminar = scanner.nextInt();
                                controlador.eliminarEmpleado(idEliminar);
                            }
                            break;
                        case 4:
                            System.out.println("ingresa el id a actualizar permanencia");
                            int idActualizar = scanner.nextInt();
                            controlador.actualizarPermanencia(idActualizar);
                            break;
                        case 5:
                            controlador.mostrarEmpleados();
                            controlador.mostrarEmpleadosT();
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("ingresar un numero valido");
                    }
                    break;
                case 2:
                        System.out.println("1. Agregar departamento\n");
                        System.out.println("2. Actualizar departamento\n");
                        System.out.println("3. Eliminar departamento\n");
                        System.out.println("4. Mostrar departamentos\n");
                        System.out.println("5. regresar\n");
                        indice2 = scanner.nextInt();
                        switch (indice2) {
                        case 1:
                            controlador.agregarDepartamento(new Departamento(1, "Recursos Humanos", 5, "Edificio A"));
                            break;
                        case 2:
                            System.out.println("Ingresa el id a actualizar");
                            idViejo = scanner.nextInt();
                            Departamento departamentoActualizado = new Departamento(idViejo, "Ingenieria", 7,"Edificio B" );
                            controlador.actualizarDepartameto(idViejo,departamentoActualizado);
                            break;
                        case 3:
                            System.out.println("ingresa el id a eliminar");
                            int idEliminar = scanner.nextInt();
                            controlador.eliminarDepartamento(idEliminar);
                            break;
                        case 4:
                            controlador.mostrarDepartamentos();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("ingresar un numero valido");
                    }
                    break;
                case 3:
                        System.out.println("1. Generar reporte empleado\n");
                        System.out.println("2. Generar reporte departamento\n");
                        System.out.println("3. Generar reporte final\n");
                        System.out.println("4. regresar\n");
                        indice2 = scanner.nextInt();
                        switch (indice2) {
                        case 1:
                            System.out.println("Ingresa el id del empleado a generar el reporte");
                            idViejo = scanner.nextInt();
                            reporte.generarReporteEmpleado(idViejo);
                            break;
                        case 2:
                            System.out.println("Ingresa el id del departamento a generar el reporte");
                            idViejo = scanner.nextInt();
                            reporte.generarReporteDepartamento(idViejo);
                            break;
                        case 3:
                            System.out.println("Ingresa el id del departamento a generar el reporte");
                            idViejo = scanner.nextInt();
                            System.out.println("Ingresa el id del empleado a generar el reporte");
                            idViejo2 = scanner.nextInt();
                            reporte.generarReporteFinal(idViejo2,idViejo);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("ingresar un numero valido");
                    }
                    break;
                default:
                    System.out.println("ingresar un numero valido");
            }
        } while (indice != 4);
        


        /*
        controlador.agregarEmpleado(new Empleado(1, "Juan", "Perez", "Analista", "juan@email.com", true));
        controlador.agregarEmpleado(new Empleado(2, "Maria", "Gomez", "Ingeniera", "maria@email.com", false));

        controlador.agregarDepartamento(new Departamento(101, "Recursos Humanos", 5, "Edificio A"));
        controlador.agregarDepartamento(new Departamento(102, "IT", 8, "Edificio B"));
           
        // Mostrar datos
        controlador.mostrarEmpleados();
        controlador.mostrarDepartamentos();
        
        // Eliminar un empleado por ID
        System.out.print("Ingrese el ID del empleado a eliminar: ");
        int idEliminar = scanner.nextInt();
        controlador.eliminarEmpleado(idEliminar);
        controlador.mostrarEmpleados();

        // Asignar un empleado a un departamento
        System.out.print("Ingrese el ID del empleado a asignar: ");
        int idEmp = scanner.nextInt();
        System.out.print("Ingrese el ID del departamento: ");
        int idDept = scanner.nextInt();
        controlador.asignarEmpleadoDepartamento(idEmp, idDept);
        */
    }
}
