/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author jerry
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Ciudad malaga, sevilla, granada, valencia, madrid, salamanca, santiago,
                santander, zaragoza, barcelona;

        malaga = new Ciudad("malaga");
        sevilla = new Ciudad("sevilla");
        granada = new Ciudad("granada");
        valencia = new Ciudad("valencia");
        madrid = new Ciudad("madrid");
        salamanca = new Ciudad("salamanca");
        santiago = new Ciudad("santiago");
        santander = new Ciudad("santander");
        zaragoza = new Ciudad("zaragoza");
        barcelona = new Ciudad("barcelona");
        malaga.head(madrid);
        malaga.head(salamanca, madrid, barcelona);
        sevilla.head(santiago, madrid);
        granada.head(valencia);
        valencia.head(granada, barcelona);
        barcelona.head(zaragoza, santiago, madrid, malaga, valencia);
        zaragoza.head(barcelona);
        santander.head(santiago, madrid);
        santiago.head(santander, barcelona, sevilla);
        salamanca.head(malaga, madrid);
        madrid.head(malaga, sevilla, salamanca, santander, barcelona);

        //Algoritmo busqueda = new Algoritmo(granada, sevilla);
        Tablero tablero = new Tablero();
        tablero.imprimirTablero();
        NuevoAlgoritmo nuevoAlgoritmo = new NuevoAlgoritmo(new Jugador(0, 0), new Jugador(2,4));
        nuevoAlgoritmo.imprimirMejorRuta();

    }

}
