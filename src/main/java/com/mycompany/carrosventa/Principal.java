/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrosventa;

import javax.swing.JList;

/**
 *
 * @author Yesid Avila
 */
public class Principal {
    
        public static void main(String[] args) {
        Inicio inicio=new Inicio();
        inicio.importaCarro();
        Inventario inve = new Inventario();
        inve.mostrarCarros();
        inve.carroMasCaro();
        inve.carroMenosCaro();
        RecursosHumanos rc = new RecursosHumanos();
        rc.mostrarClientes();
           
        }
   
}
