/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_extra4;

import entidad.Cuenta;

/**
 *
 * @author BANGHO
 */
public class Guia7_Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.retirar_dinero();
        System.out.println(cuenta.toString());
    }
    
}
