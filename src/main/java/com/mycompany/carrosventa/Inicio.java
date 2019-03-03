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
 */
public class Inicio {
    
    ArrayList<Carro> listaCarro =new ArrayList<Carro>();
    ArrayList<Persona> listaPersonas =new ArrayList<Persona>();
    
    public ArrayList<Carro> importaCarro(){
        
        Cliente cliente1 = new Cliente (1070984895 ,"Laura Gonzalez" , "Cra1A#14B-10", 2125337917 , "Femenino");
        Cliente cliente2 = new Cliente (1070970279,"Yesid Avila", "Calle15#16-15", 2125965896 , "Masculino" );
        Cliente cliente3 = new Cliente (20203224,"Blanca Guerrero", "Cra1A#14B-10", 1256984589  , "Femenino");
        Cliente cliente4 = new Cliente (1553226,"Carolina Castellanos", "Cra1A#14B-10", 221547859  , "Femenino");
        Cliente cliente5 = new Cliente (21437552,"Miguel Pinzon", "Calle15#16-15", 225413698 , "Masculino");
        Cliente cliente6 = new Cliente (11256336,"Juanito Perez", "Calle15#16-15", 2125698523 , "Masculino" );
        
        Empleado empleado1 = new Empleado (1070596325 ,"Ana Duarte" , "Cra8#6-10", 30021452 , "Femenino");
        Empleado empleado2 = new Empleado (1070258963,"Mauricio Londoño", "Calle15#12-4", 325412563 , "Masculino" );
        Empleado empleado3 = new Empleado (1258741236,"Alison Gonzalez", "Cra7#7-89", 321456254  , "Femenino");
        Empleado empleado4 = new Empleado (1070589632,"Adriana Castellans", "Cra5#4-56", 326254125  , "Femenino");
        Empleado empleado5 = new Empleado (35214785,"Jairo Sastoque", "Calle12#3-6", 312563254 , "Masculino");
        Empleado empleado6 = new Empleado (36254128,"Andres Castellanos", "Calle15#16-15", 320125632 , "Masculino" );
        
        listaPersonas.add(cliente1);
        listaPersonas.add(cliente2);
        listaPersonas.add(cliente3);
        listaPersonas.add(cliente4);
        listaPersonas.add(cliente5);
        listaPersonas.add(cliente6);
        listaPersonas.add(empleado1);
        listaPersonas.add(empleado2);
        listaPersonas.add(empleado3);
        listaPersonas.add(empleado4);
        listaPersonas.add(empleado5);
        listaPersonas.add(empleado6);
           
        Deportivo ferrari= new Deportivo(1, "Ferrari", "Amarillo", 2019, 2, 150000000, "Gasolina", 2500);
        Deportivo lamborghini= new Deportivo(2, "Lamborghini", "Rojo", 2000, 2, 250000000, "Gasolina", 3500);
        Deportivo aston= new Deportivo(3, "Aston Martin", "Azul", 2017, 4, 550000000, "Diesel", 4500);
        
        Estandar chevrolet= new Estandar(1, "Aveo", "Gris", 2019, 5, 20000000, "Gasolina", 1400);
        Estandar toyota= new Estandar(2, "Hilux", "Verde", 2018, 5, 180000000, "Diesel", 3000);
        Estandar renault= new Estandar(3, "Logan", "Violeta", 2015, 5, 15000000 , "Gasolina", 2000);
        
        Maquinaria john= new Maquinaria(1, "John Deeere", "Amarillo", 2019, 1, 450000000, "Diesel", 2500,3);
        Maquinaria carterpillar= new Maquinaria(2, "Cat", "Amarillo", 2016, 2, 500000000, "Diesel", 8000,100);
        Maquinaria hitachi= new Maquinaria(3, "Escabadora", "Naranja", 2017, 1, 1000000000, "Diesel", 5000,250);
        
        Personalizado personalizado1= new Personalizado(1, "Corsa", "Verder", 1995, 5, 30000000, "Gasolina", 1400);
        Personalizado personalizado2= new Personalizado(2, "Mazda 3", "Naranja", 2000, 2, 15000000, "Gasolina", 2000);
        Personalizado personalizado3= new Personalizado(3, "Dodge", "Negro", 1965, 2, 120000000, "Gasolina", 6500);
        
        listaCarro.add(ferrari);
        listaCarro.add(lamborghini);
        listaCarro.add(aston);
        listaCarro.add(chevrolet);
        listaCarro.add(toyota);
        listaCarro.add(renault);
        listaCarro.add(john);
        listaCarro.add(carterpillar);
        listaCarro.add(hitachi);
        listaCarro.add(personalizado1);
        listaCarro.add(personalizado2);  
        listaCarro.add(personalizado3);  
        
        
        

        for (Persona listaPersona : listaPersonas) {
            System.out.println("Nombre: "+listaPersona.getNombre()+", Codigo: "+listaPersona.getCedula());
        
        }
        return listaCarro;
    }   
    

    public ArrayList<Carro> getListaCarro() {
        return listaCarro;
    }
    public ArrayList<Persona> getListaPersona() {
        return listaPersonas;
    }
    
    
    
}


