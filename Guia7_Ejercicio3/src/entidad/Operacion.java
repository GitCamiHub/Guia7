/*Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números
y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación
por cero, si fuera a multiplicar por cero, el método devuelve 0 y 
se le informa al usuario el error. Si no, se hace la multiplicación
y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace 
la división y se devuelve el resultado al main.*/
package entidad;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

   
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros.");
        numero1=leer.nextInt();
        numero2=leer.nextInt();
    }
    
    public double sumar(){
        double suma;
        suma = numero1+numero2;
        return suma;
    }
    
    public double restar(){
         double resta;
        resta = numero1-numero2;
        return resta;
    }
    public double multiplicar(){
        double mult;
        if(numero1==0||numero2==0){
            mult = 0;
            System.out.println("Error. Multiplicación por cero.");
        }else{
            mult=numero1*numero2;
        }
        return mult;
    }
    public double dividir(){
        double div;
         if(numero2==0){
            div = 0;
            System.out.println("Error. No es posible realizar una division por cero.");
        }else{
            div=numero1/numero2;
        }
        return div;
    }
}
