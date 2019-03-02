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
 * Esta clase alamcena los datos de los vehiculos que se pueden personalizar
 */
public class Personalizado extends Carro{
    
    public Personalizado(int codigo, String marca, String color, int modelo, int capacidadPasajeros, double precio, String combustuble, int cilindraje){
        super(codigo, marca, color, modelo, capacidadPasajeros, precio, combustuble, cilindraje);
    }
    
    public void cambiarColor(int codigo, String color){
    }
    public void cambiarMotor(int codigo, String motor){
    }
}
