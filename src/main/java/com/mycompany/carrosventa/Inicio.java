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
    
    public void informacion(){
        
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
        
        for (Carro listaCarro : listaCarro) {
            System.out.println("Marca: "+listaCarro.getMarca()+", Codigo: "+listaCarro.getPrecio());
        
        }
    

    }

    public ArrayList<Carro> getListaCarro() {
        return listaCarro;
    }
    
    
}


