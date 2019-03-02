/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrosventa;

/**
 * Esta clase es la clase padre de ciente y empleado la cual contiene sus atributos en comun 
 *@author Laura Gonzalez
 * @author  Yesid Avila
 * @version 1
 */
public class Persona {
    /**
     * Enesta variable contiene la cedula de la persona que sera usada como su id
     */
    private double cedula;
    /**
     * Esta variable contiene el nombre de cada persona 
     */
    private String nombre;
    /**
     * Esta variable contiene la direccion de cada persona
     */
    private String Direccion;
    /**
     * Esta variable contiene el telefono de cada persona
     */
    private double telefono;
    /**
     * Esta variable contiene el genero (femenino/msculino) de cada persona
     */
    private String sexo;

    /**
     * Constructor que nicializa las variables de la clase padre Persona
     * @param cedula
     * @param nombre
     * @param Direccion
     * @param telefono
     * @param sexo 
     */
    public Persona(double cedula, String nombre, String Direccion, double telefono, String sexo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    /**
     * Devuelve la cedula respectiva de cada usuario
     * @return 
     */
    public double getCedula() {
        return cedula;
    }
    /**
     * Nos perite modificar el dato almacenado en la variable cedula
     * @param cedula 
     */
    public void setCedula(double cedula) {
        this.cedula = cedula;
    }
    /**
     * Devuelve el nombre de cada usuario
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Nos perite modificar el dato almacenado en la variable nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve la direccion respectiva de cada usuario
     * @return 
     */
    public String getDireccion() {
        return Direccion;
    }
    /**
     * Nos perite modificar el dato almacenado en la variable direccion
     * @param Direccion 
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    /**
     * Devuelve el telefono de cada usuario
     * @return 
     */
    public double getTelefono() {
        return telefono;
    }
    /**
     * Nos perite modificar el dato almacenado en la variable telefono
     * @param telefono 
     */
    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
    /**
     * Devuelve el sexo de cada usuario
     * @return 
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * Nos perite modificar el dato almacenado en la variable sexo
     * @param sexo 
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
            
    
}
