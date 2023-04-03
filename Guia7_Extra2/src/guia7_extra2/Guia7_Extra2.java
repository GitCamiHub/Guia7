
package guia7_extra2;

import entidad.Puntos;

/**
 *
 * @author BANGHO
 */
public class Guia7_Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Puntos p1 = new Puntos();
      p1.crearPuntos();
      System.out.println("La distancia entre el punto1 y el punto2 es: "+p1.distancia());
    }
    
}
