/*
Aplicacion para barajear y reparitir cartas
 */
package pruebapaquetedecartas;

/**
 *
 * @author carlosjoseanguiano
 */
public class PruebaPaquetedeCartas {

    public static void main(String[] args) {
        PaquetedeCartas mipaquetedeCartas = new PaquetedeCartas();
        mipaquetedeCartas.barajar();//Coloca las cartas en orden aleatorio

        //Imprime las 52 cartas en el orden en el que reparten
        for (int i = 1; i <= 52; i++) {
            //Reparte e imprime una carta
            System.out.printf("%-19s", mipaquetedeCartas.repartirCarta());

            //Imprime una nueva linea despues de cada cuatro cartas
            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }

}
