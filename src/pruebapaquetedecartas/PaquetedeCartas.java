/*
La clase Paquete de cartas representa un paquete de cartas de juego
 */
package pruebapaquetedecartas;

import java.util.Random;

/**
 *
 * @author carlosjoseanguiano
 */
public class PaquetedeCartas {

    private Carta[] paquete;//Arreglo de objetos Carta
    private int cartaActual;//subindice de la siguiente carta a repartir (0 a 51)
    private static final int NUMERO_DE_CARTAS = 52;//Numero constante de cartas
    public static final Random numeroAleatorio = new Random();//Generador de numeros aleatorio

    //Constructor que llena el paquete de cartas
    public PaquetedeCartas() {
        String[] cara = {"AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE",
            "OCHO", "NUEVE", "DIEZ", "JOTO", "QUINA", "REY"};

        String[] palo = {"CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS"};

        paquete = new Carta[NUMERO_DE_CARTAS];//Crea arreglo de objetos carta
        cartaActual = 0;//Establece cartaActual para que la primera carta repartida sea 0

        //Llena el paquete con objetos carta
        for (int cuenta = 0; cuenta < paquete.length; cuenta++) {
            paquete[cuenta] = new Carta(cara[cuenta % 13], palo[cuenta / 13]);
        }
    }

    public void barajar() {
        //Despues de barajear, la reparticion debe empezar en paquete [0]
        cartaActual = 0;

        //Para cada carta, selecciona otra carta aleatoria de 0 a 51
        for (int primera = 0; primera < paquete.length; primera++) {
            int segunda = numeroAleatorio.nextInt(NUMERO_DE_CARTAS);

            //Intercambia carta actual con la carta seleccionada al azar
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
    }

    public Carta repartirCarta() {

        //Determina si quedan cartas por repartir
        if (cartaActual < paquete.length) {

            //Devuelve la carta actual en el arreglo
            return paquete[cartaActual++];
        } else {
            //Devuelve null para indicar que se repartieron todas las cartas
            return null;
        }

    }
}
