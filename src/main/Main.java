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
import view.IniciarSesion;
import view.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        
        String usuario = "admin123";
        String contrasena = "123";
        IniciarSesion sesion = new IniciarSesion(usuario,contrasena);
        sesion.setVisible(true);

    }
}
