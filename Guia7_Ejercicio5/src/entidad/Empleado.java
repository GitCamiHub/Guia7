/*Crea una clase "Empleado" que tenga atributos como "nombre", "edad"
y "salario". Luego, crea un método "calcular_aumento" que calcule el 
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años
o del 5% si tiene menos de 30 años.*/
package entidad;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre empleado: ");
        nombre = leer.next();
        System.out.println("Edad: ");
        edad = leer.nextInt();
        System.out.println("Salario: ");
        salario = leer.nextDouble();
        
        if (edad>30) {
            salario += salario*0.1;
            System.out.println("El salario mas el aumento es: $"+salario);
        }else{
            salario += salario*0.05;
            System.out.println("El salario mas el aumento es: $"+salario);
        }
        
    }
}
