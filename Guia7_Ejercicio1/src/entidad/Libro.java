/*Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío. Crear un método para 
cargar un libro pidiendo los datos al usuario y luego informar mediante otro
método el número de ISBN, el título, el autor del libro y el número de páginas.*/
package entidad;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int numPag;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    public void cargar_libro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ISBN del libro.");
        ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("Titulo: ");
        titulo = leer.nextLine();
        System.out.println("Autor: ");
        autor = leer.nextLine();
        System.out.println("Cantidad de paginas: ");
        numPag = leer.nextInt();
    }

    @Override
    public String toString() { //Puedo modificar el titulo para que salga mas lindo y no con el nombre de las variables
        return "Libro{" + "ISBN = " + ISBN + ", Titulo = " + titulo + ", Autor = " + autor + ", Cantidad de páginas = " + numPag + '}';
    }
    
    public void mostrar_libro(){
        System.out.println("--------------------------------------------");
        System.out.println("ISBN: "+ ISBN);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Cantidad de páginas: "+numPag);
    }
    
}
