/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.*/
package entidad;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void retirar_dinero(){
   String op="";
        Scanner leer = new Scanner(System.in);
        System.out.println("Titular: ");
        titular = leer.nextLine();
        saldo =35000;
        
        do {
            System.out.println("Importe a extraer:");
            double retiro = leer.nextDouble();
            if (saldo >= retiro) {
                saldo -= retiro;
                System.out.println("Dinero en la cuenta: " + saldo);
            } else if (saldo < retiro) {
                System.out.println("Saldo insuficiente.");
            }
            System.out.println("Desea realizar otra operacion? S/N");
            op = leer.next();
        } while (op.equals("S"));
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Titular=" + titular + ", Saldo=" + saldo + '}';
    }
    
}
