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
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta_1 = new Cuenta("Alejandro Noriega");
        Cuenta cuenta_2 = new Cuenta("Andrea López", 1200.50);
         
        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(250.10);
        cuenta_2.ingresar(915.75);
         
        //Retiramos dinero en las cuentas
        cuenta_1.retirar(423.52);
        cuenta_2.retirar(99.98);
         
        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros
    }
    
}
