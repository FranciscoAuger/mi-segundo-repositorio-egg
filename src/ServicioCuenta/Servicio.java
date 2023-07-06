/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ServicioCuenta;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Servicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta nuevaCuenta(){
        Cuenta c1 = new Cuenta();
        
        System.out.println("Ingrese nombre y apellido para habilitar la cuenta");
        c1.setCrearCuenct(leer.next());
        System.out.println("Ingrese el DNI");
        c1.setDNI(leer.nextInt());
        return c1;
        
    }
    
    public void nCuenta(Cuenta c1){
        String cuenta1 = c1.getCrearCuenta();
        long DNI1 = c1.getDNI();
    }
    public void ingresarSaldo(Cuenta c1){
        
        System.out.println("primer deposito");              //metodo para ingresar saldo y lo agregamos a saldo actual
        int deposito = leer.nextInt();
        double nuevoSaldo = c1.getSaldoActual()+ deposito;
        
    }
     public void retirarDinero(Cuenta c1){
         System.out.println("Ingrese la cantidad a retirar");
         int retirar = leer.nextInt();
         if(c1.getSaldoActual()> retirar){
             c1.setSaldoActual(c1.getSaldoActual()- retirar);
            
         }else {System.out.println("El monto a retirar es mayor al saldo disponible");
         
         }
     }
     //Retirar el 20% del saldo
     public void extraccion20(Cuenta c1){
         double saldo = leer.nextDouble();
         double extraccion = saldo* 0.2;
         if(extraccion < saldo && saldo >0){
             saldo  = extraccion;
             
             c1.setSaldoActual(saldo);
              System.out.println("Ha retirado el 20% de su dinero ["+extraccion+"].");
            System.out.println("Su saldo actual es de ["+saldo+"]");
         } else { System.out.println("Error no se puede realizar la operacion");
         
         }
     }



    
}
