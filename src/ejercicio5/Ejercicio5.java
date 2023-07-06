/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import Entidades.Cuenta;
import ServicioCuenta.Servicio;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Servicio c1 = new Servicio();
        Cuenta d1 = new Cuenta();
        d1=c1.nuevaCuenta();
        c1.nCuenta(d1);
        c1.ingresarSaldo(d1);
        c1.extraccion20(d1);
        c1.retirarDinero(d1);
        
        
        
    }
    
}
