/*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a
dos jugadores jugar un juego de adivinanza de números. El primer jugador elige
un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
después de cada intento. El juego termina cuando el segundo jugador adivina 
el número o se queda sin intentos. Registra el número de intentos necesarios 
para adivinar el número y el número de veces que cada jugador ha ganado.*/
package entidad;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Juego {
    private int num;

    public Juego() {
    }

    public Juego(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void iniciar_juego(){
        int victorias=0;
        int intentos=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1 ingrese un numero.");
        num = leer.nextInt();
        System.out.println("Jugador 2 intente adivinar el numero.");
        int adiv = leer.nextInt();
        while (intentos<2) {
            intentos++;
            if (adiv < num) {
                System.out.println("Más alto");
                 adiv = leer.nextInt();
            } else if (adiv > num) {
                System.out.println("Más bajo");
                 adiv = leer.nextInt();
            } else {
                System.out.println("ADIVINASTE");
                victorias++;
            }
        }
        if(victorias==0){
            System.out.println("PERDISTE :(");
        }
    }
}
