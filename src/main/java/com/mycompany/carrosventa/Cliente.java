/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrosventa;

/**
 * Esta clase contiene a los clientes de la empresa 
 *@author Laura Gonzalez
 * @author  Yesid Avila
 * @version 1
 */
public class Cliente extends Persona {

    public Cliente(double cedula, String nombre, String Direccion, double telefono, String sexo) {
        super(cedula, nombre, Direccion, telefono, sexo);
    }
    
}
