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
 * Esta clase almacena el listado de los carros en el sistema y controla el minimo de carros el cual esta en el inventario
 */
public class Inventario {
    
    ArrayList<Carro> listaCarro;
    
    private int minimo;
    private double mayor = 0;
    private double menor = 1000000000;
    private int codigo = 0;
    private String marca;
    public void agregarCarro(int codigo, String marca, String color, int modelo, int capacidadPasajeros, double precio, String combustuble, int cilindraje){}
    
    public void editarCarro(int codigo, String marca, String color, int modelo, int capacidadPasajeros, double precio, String combustuble, int cilindraje){}
    
    public void eliminarCarro(int codigo){}
    
    
    

    
    public void carroMasCaro(){
        Inicio carros = new Inicio();
        ArrayList<Carro>ListaCarro = carros.importaCarro();
        
        
        for (Carro listaCarro : ListaCarro) {
            
            if(listaCarro.getPrecio()>mayor){
            mayor = listaCarro.getPrecio();
            codigo = listaCarro.getCodigo();
            marca = listaCarro.getMarca();
            }
                 
        }
        System.out.println("Carro mas caro es: "+"Codigo: "+codigo+" Marca: "+marca+" Precio: "+mayor);
            
      

    }
        public void carroMenosCaro(){
        Inicio carros = new Inicio();
        ArrayList<Carro>ListaCarro = carros.importaCarro();
        
        
        for (Carro listaCarro : ListaCarro) {
            
            if(listaCarro.getPrecio()<menor){
            menor = listaCarro.getPrecio();
            codigo = listaCarro.getCodigo();
            marca = listaCarro.getMarca();
            }
                 
        }
        System.out.println("Carro mas economico es: "+"Codigo: "+codigo+" Marca: "+marca+" Precio: "+menor);
    }
        
        
        public void mostrarCarros(){
            Inicio carros = new Inicio();
            ArrayList<Carro>ListaCarro = carros.importaCarro();
            
            for (Carro listaCarro : ListaCarro) {
                System.out.println("Codigo: "+listaCarro.getPrecio()+" Marca: "+listaCarro.getMarca());
            }
        }
            
        
    
}
    
   
    
    
    

