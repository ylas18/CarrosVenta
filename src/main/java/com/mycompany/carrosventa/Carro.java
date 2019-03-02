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
 * Esta clase es una clase padre que almacena los datos comunes entre los diferentes tipos de carros
 */
public abstract class Carro {
    
    /**
     * Variable que identifica cada carro de manera unica
     */
    private int codigo;
    /**
     *  Variable que almacena la marca de cada carro
     */
    private String marca;
    /**
     * Variabe que alamcena el color de cada carro
     */
    private String color;
    /**
     * Variable que almacena el modelo de cada carro
     */
    private int modelo;
    /**
     * Variable que almacena la capacidad de pasajeros que tiene cada carro
     */
    private int capacidadPasajeros;
    /**
     * Variable que almacena el precio de cada carro
     */
    private double precio;
    /**
     * Variable que amacena dl tipo de combustible que consume cada carro
     */
    private String combustuble;
    /**
     * Variable que almacena el cilindraje de cada motor que tiene el carro
     */
    private int cilindraje;

    public Carro(int codigo, String marca, String color, int modelo, int capacidadPasajeros, double precio, String combustuble, int cilindraje) {
        this.codigo = codigo;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precio = precio;
        this.combustuble = combustuble;
        this.cilindraje = cilindraje;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCombustuble() {
        return combustuble;
    }

    public void setCombustuble(String combustuble) {
        this.combustuble = combustuble;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
}
