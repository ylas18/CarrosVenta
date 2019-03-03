/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrosventa;

/**
 *Esta clase contiene la informacion de los empleados de la empresa
 * @author Laura Gonzalez
 * @author  Yesid Avila
 * @version 1
 */
public class Empleado extends Persona{
    
    /**
     * Esta variable contiene el codigo del empleado
     */
    private int codigoEmpleado;
    /**
     * Esta variable contiene el valor del salario del empleado
     */
    private double salario;



    /**
     * Constructor que inicializa las variables de la clase Empleado
     * @param codigoEmpleado
     * @param salario
     * @param cedula
     * @param nombre
     * @param Direccion
     * @param telefono
     * @param sexo 
     */
    public Empleado(double cedula, String nombre, String Direccion, double telefono, String sexo,int codigoEmpleado, double salario) {
        super(cedula, nombre, Direccion, telefono, sexo);
        this.codigoEmpleado = codigoEmpleado;
        this.salario = salario;
    }

    /**
     * Permite obtener los datos de la variable codgoEmpleado
     * @return 
     */
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Permite modificar el codigo del empleado
     * @param codigoEmpleado 
     */
    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Permite obtener el salario del empleado
     * @return 
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Permite editar el salario del empleado
     * @param salario 
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
        
}
