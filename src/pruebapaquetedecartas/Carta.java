/*
La clase representa una carta de juego
 */
package pruebapaquetedecartas;

/**
 *
 * @author carlosjoseanguiano
 */
public class Carta {

    private String cara;//Cara de la carta (as, dos , tres etc.)
    private String palo;//Palo de la carta (diamante corazon etc.)

    //El constructor de los argumentos inicializa la cara y el palo de la carta
    public Carta(String cara, String palo) {
        this.cara = cara;
        this.palo = palo;
    }
//Devuelve representacion string de la carta

    public String toString() {
        return cara + " de " + palo;
    }
}
