package app;
/** Create: Alejandro Cerrud
 * 04/10/17
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {

         Dado dado = new Dado();

        //Para ingresar el numero de opcion al usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int opcion = 0;

            System.out.println("SIMULACION DE DADO");
            System.out.println("1. Lanzar dado");
            System.out.println("2. Resultados Anteriores");
            System.out.println("3. Salir");
            try {
                System.out.print("OPCION:");
                opcion = Integer.parseInt(br.readLine());

            } catch (Exception e){

            }
// Opciones disponibles en el juego de dados
            switch (opcion) {
                //Opcion 1 para lanzar el dado, llama al metodo dado
                case 1:
                    System.out.println( dado.lanzar() );
                    System.out.println ();
                    break;
                    //Llama al metodo resultados
                case 2:
                    System.out.println ();
                    System.out.println("***Resultado Anteriores***");
                    dado.resultados();
                    System.out.println ();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Hasta Pronto!!!");
                    System.exit(0);
                    System.out.println ();
                    break;
                default:
                    System.out.println ();
                    System.out.println("Opcion Incorrecta :(, Lee e intentalo nuevamente");
                    System.out.println ();

            }

        }
    }
}




