/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrosventa;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.ArrayList;

/**
 *Esta clase contiene las facturas de las ventas realizadas
 * @author Laura Gonzalez
 * @author Yesid Avila
 * @version 1
 */
public class Factura {
    
    /**
     * Esta variable contiene la fecha d ela factura
     */
    private String fecha;
    /**
     * Esta variable contiene el codigo de la factura
     */
    private int codigo;
    /**
     * Esta variable contiene el codigo del cliente que realizo la compra
     */
    private int cliente;
    /**
     * Esta lista contiene las ventas realizadas al cliente 
     */
    private ArrayList<Venta> venta;

    /**
     * Este constructor inicializa las variables de la clase Factura
     * @param fecha
     * @param codigo
     * @param cliente
     * @param venta 
     */
    public Factura(String fecha, int codigo, int cliente, ArrayList<Venta> venta) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.cliente = cliente;
        this.venta = venta;
    }
    
    /**
     * Permite obtener la fecha de la factura
     * @return 
     */
    public String getFecha() {
        return fecha;
    }
    
    /**
     * Permite editar la fecha de la factura
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Permite obtener el codigo de la factura
     * @return 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Permite editar el codigo de la factura 
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Permite obtener el codigo del cliente que realizo la compra
     * @return 
     */
    public int getCliente() {
        return cliente;
    }

    /**
     * Permite editar el codigo del cliente que realizo la compra
     * @param cliente 
     */
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    /**
     * Permite obtener la lista de las ventas realizadas en la factura 
     * @return 
     */
    public ArrayList<Venta> getVenta() {
        return venta;
    }

    /**
     * Permite editar la lista de ventas realizadas 
     * @param venta 
     */
    public void setVenta(ArrayList<Venta> venta) {
        this.venta = venta;
    }
  
    
}
