/*Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el 
título y el autor a cadenas vacías y otro que reciba como parámetros el 
título y el autor de la canción. Se deberán además definir los métodos 
getters y setters correspondientes.*/
package entidad;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Cancion {
   private String titulo;
   private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
   
   public void pedirCancion(){
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese titulo de la cancion:");
       titulo = leer.nextLine();
       System.out.println("Autor de la cancion: ");
       autor = leer.nextLine();
   }

    @Override
    public String toString() {
        return "Cancion{" + "Titulo=" + titulo + ", Autor=" + autor + '}';
    }
   
}
