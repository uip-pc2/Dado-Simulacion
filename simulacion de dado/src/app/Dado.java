package app;

/** Create: Alejandro Cerrud
 * 04/10/17
 */
import java.util.ArrayList;

public class Dado {
    private ArrayList<Integer> listadelanzamientos = new ArrayList<Integer>();
        // Acciones de la clase

    //Lanzar el dado e impresion de dialogos despues del lanzamiento
    public int lanzar() {
        int num = (int) (Math.random()*6+1);

        setLanzamientos(num);
        System.out.println ();
        System.out.println("El Dado fue lanzado!!! veamos el resultado :) ");
        System.out.println("Estas de suerte :D, cayo en el numero" );
        return num;
    // Impresion y guardado de los resultados de la lista de Lanzamientos
    }public void resultados(){

        for (int x=0; x < listadelanzamientos.size(); x++ ){
            System.out.println( "Lanzamiento #"+ (x+1) + " El Resultado fue: "+ listadelanzamientos.get(x));

        }
    }


    public void setLanzamientos(int lanzamientos) {
        this.listadelanzamientos.add(lanzamientos);
    }


}