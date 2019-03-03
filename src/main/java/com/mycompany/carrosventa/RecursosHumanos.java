/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrosventa;

import java.util.ArrayList;

/**
 *
 * @author Yesid Avila
 * @version 1.0
 * Clase que maneja las personas que estan en el concesionario
 */
public class RecursosHumanos {
    /**
     * Metodo que muestra todos los clientes del concesionario
     */
    public void mostrarPersonas(){
        Inicio personas = new Inicio();
        ArrayList<Persona> ListaPersona = personas.importaPersona();
        
        for (Persona listaPersona : ListaPersona) {
            System.out.println("Codigo: "+listaPersona.getCedula()+" Nombre: "+listaPersona.getNombre());
        }
    }
    
}
