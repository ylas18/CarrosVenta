/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrosventa;

/**
 *
 * @author Yesid Avila
 * @version 1.0
 * Esta clase contiene los datos de un vehiculo tipo maquinaria
 */

public class Maquinaria extends Carro{
    
     /**
     * Variable que almacena la capacidad de carga de las maquinarias pesadas
     */
    private double capacidadCarga;
    /**
     * Constructor que inicializa las variables para poder hacer uso de ellas
     * @param codigo
     * @param marca
     * @param color
     * @param modelo
     * @param capacidadPasajeros
     * @param precio
     * @param combustuble
     * @param cilindraje
     * @param capacidadCarga 
     */
    public Maquinaria(int codigo, String marca, String color, int modelo, int capacidadPasajeros, double precio, String combustuble, int cilindraje, double capacidadCarga){
        super(codigo, marca, color, modelo, capacidadPasajeros, precio, combustuble, cilindraje);
        this.capacidadCarga = capacidadCarga;
    }

    
    
}
