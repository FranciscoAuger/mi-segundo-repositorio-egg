/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Fran
 */
public class Cuenta {
   
    //Atributos
    String crearCuenta;
    int numeroCuenta;
    long DNI;
    double saldoActual;

    // Constructor por defecto
    public Cuenta() {
    }
             //Contructores
    public Cuenta(String crearCuenta, int numeroCuenta, long DNI, double saldoActual) {
        this.crearCuenta = crearCuenta;
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }
           // Get y Set
    public String getCrearCuenta() {
        return crearCuenta;
    }

    public void setCrearCuenct(String crearCuenta) {
        this.crearCuenta = crearCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "crearCuenca=" + crearCuenta + ", numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + '}';
    }
    
    
    
}
   
  
    
    
   
    
    

   