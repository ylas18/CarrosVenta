/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrosventa;

import java.util.ArrayList;

/**
 *Esta clase contiene una lista de carros vendidos a un cliente 
 * @author Laura Gonzalez
 * @author  Yesid Avila
 * @version 1
 */
public class Venta {
    
    /**
     * Esta variable contiene el codigo de la venta 
     */
    private int idVenta;
   
    /**
     * Esta variable contiene la cantidad de autos vendidos
     */
    private int cantidad;
    
    /**
     * Esta variable contiene el total de la venta 
     */
    private double total;
    
    /**
     * Esta variable contiene el codigo del empleado que realizo la venta 
     */
    private double empleado;
 
    private ArrayList<Carro> carro = new ArrayList<Carro>();

    public Venta(int idVenta, int cantidad, double total, double empleado) {
        this.idVenta = idVenta;
        this.cantidad = cantidad;
        this.total = total;
        this.empleado = empleado;
    }


    /**
     * Permite obtener el id de la venta 
     * @return 
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * permite editar el id de la venta 
     * @param idVenta 
     */
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * Permite obtener la cantidad de autos vendidos a un cliente
     * @return 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Permite editar la cnatida de autos vendidos 
     * @param cantidad 
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Permite obtener el total de la venta realizada 
     * @return 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Permite editar el total de la venta realizada 
     * @param total 
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Permite obtener el codigo del empleado que realizo la venta 
     * @return 
     */
    public double getEmpleado() {
        return empleado;
    }

    /**
     * Permite editar el codigo del ciente que realizo la venta 
     * @param empleado 
     */
    public void setEmpleado(double empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Carro> getCarro() {
        return carro;
    }

    public void setCarro(ArrayList<Carro> carro) {
        this.carro = carro;
    }
    
    
   
    
}
