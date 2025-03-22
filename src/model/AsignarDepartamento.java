/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class AsignarDepartamento {
    private int idEmpleado;
    private int idDepartamento;

    public AsignarDepartamento(int idEmpleado, int idDepartamento) {
        this.idEmpleado = idEmpleado;
        this.idDepartamento = idDepartamento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }
}