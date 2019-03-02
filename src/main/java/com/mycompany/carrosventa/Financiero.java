/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrosventa;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase contiene la lista de facturas de los carros vendidos 
 *@author Laura Gonzalez
 * @author  Yesid Avila
 * @version 1
 */
public class Financiero {
    /**
     * Esta variable contiene el valor 
     */
    private int valor;
    /**
     * Esta lista contiene todas las facturas de todas las ventas que se han realizado 
     */
    private ArrayList<Factura> factura;

    /**
     * Este constructor inicializa la clase Financiero
     * @param valor
     * @param factura 
     */
    public Financiero(int valor, ArrayList<Factura> factura) {
        this.valor = valor;
        this.factura = factura;
    }

    /**
     * Permite obtener el valor 
     * @return 
     */
    public int getValor() {
        return valor;
    }
    
    /** 
     * Permite editar el valor
     * @param valor 
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Permite obtener la lista de las facturas 
     * @return 
     */
    public ArrayList<Factura> getFactura() {
        return factura;
    }

    /**
     * Permite editar la lista de facturas 
     * @param factura 
     */
    public void setFactura(ArrayList<Factura> factura) {
        this.factura = factura;
    }
    
    
    
    
    
}
