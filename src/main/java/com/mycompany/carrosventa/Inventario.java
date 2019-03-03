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
    
    //ArrayList<Carro> listaCarro;
    /**
     * Variable que almacena el minimos de carros en el stock
     */
    private int minimo;
    /**
     * Variable que almacena el precio mayor del carro mas caro
     */
    private double mayor = 0;
    /**
     * Variable que almacena el precio menor del carro mas barato
     */
    private double menor = 1000000000;
    /**
     * Variable que almacena el codigo del carro para mostrar
     */
    private int codigo = 0;
    /**
     * variable que almacena la marca del carro a mostrar
     */
    private String marca;
    
    /**
     * Metodo que agrega carro a la lista
     * @param codigo
     * @param marca
     * @param color
     * @param modelo
     * @param capacidadPasajeros
     * @param precio
     * @param combustuble
     * @param cilindraje 
     */
    public void agregarCarro(int codigo, String marca, String color, int modelo, int capacidadPasajeros, double precio, String combustuble, int cilindraje){}
    
    /**
     * Metodo que edita el carro 
     * @param codigo
     * @param marca
     * @param color
     * @param modelo
     * @param capacidadPasajeros
     * @param precio
     * @param combustuble
     * @param cilindraje 
     */
    
    public void editarCarro(int codigo, String marca, String color, int modelo, int capacidadPasajeros, double precio, String combustuble, int cilindraje){}
    
    /**
     * Metodo que elimina carro
     * @param codigo 
     */
    public void eliminarCarro(int codigo){}
    
    /**
     * Metodo que trae el carro mas caro para mostrarlo en consola
     */
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
    
    /**
     * Metodo que trae el carro menos caro y lo muestra en consola
     */
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
            
    /**
     * Metodo que muestra todos los carros en la consola
     */
    public void mostrarCarros(){
        Inicio carros = new Inicio();
        ArrayList<Carro>ListaCarro = carros.importaCarro();
       
        for (Carro listaCarro : ListaCarro) {
            System.out.println("Codigo: "+listaCarro.getCodigo()+" Marca: "+listaCarro.getMarca());
        }
    }
}
    
   
    
    
    

