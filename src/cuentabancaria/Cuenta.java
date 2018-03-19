/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author huangho
 */
public class Cuenta {
    //Atributos
    private String titular;
    private double cantidad;
 
    //Constructores. Sobrecargar
    public Cuenta(String titular) {
        this(titular, 0);
    }
 
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        //Si <0 -> 0
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }
 
    //Methids. getter setters
    public String getTitular() {
        return titular;
    }
 
    public void setTitular(String titular) {
        this.titular = titular;
    }
 
    public double getCantidad() {
        return cantidad;
    }
 
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * 
     */
    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.cantidad += cantidad;   
        }
    }
    
    /**
     * 
     */
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }
    
    /**
     * 
     */
    public String toString() {
        return "El usuario " + titular + " dispone de " + cantidad + " euros en su cuenta";
    }
}
