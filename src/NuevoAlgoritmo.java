/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author jerry
 */
public class NuevoAlgoritmo {

    private Jugador nodoInicial;
    private Jugador nodoFinal;

    private Stack<Jugador> nodosVisitados = new Stack();
    private ArrayList<Jugador> mejorRuta = new ArrayList();
    private Stack<Jugador> rutaActual = new Stack();

    public NuevoAlgoritmo(Jugador estadoInicial, Jugador estadoFinal) {

        this.nodoInicial = estadoInicial;
        this.nodoFinal = estadoFinal;
        this.ejecutar(this.nodoInicial);
 
    }

    public void ejecutar(Jugador nodoActual) {
        System.out.println("CANTIDAD DE LA PILA: " + nodosVisitados.toString());
        System.out.println("NODO ACTUAL: " + nodoActual.toString());
        if (!nodoActual.equals(nodoFinal)) {
            if (!nodosVisitados.contains(nodoActual)) {
                this.nodosVisitados.add(nodoActual);
                this.rutaActual.add(nodoActual);

                for (Jugador nodoHijo : nodoActual.getJugadorDisponible()) {
                    if (nodoHijo.equals(nodoFinal)) {
                        rutaActual.add(nodoHijo);
                        this.nodosVisitados.add(nodoHijo);
                        this.detectarRutaCorta(rutaActual);
                        rutaActual.pop();
                        nodosVisitados.pop();
                    }
                    this.ejecutar(nodoHijo);
                }
                this.rutaActual.pop();
                this.nodosVisitados.pop();
                System.out.println("RETROCEDE");
                return;
            }
        }
    }

    public void detectarRutaCorta(Stack<Jugador> rutaActual) {
        if (mejorRuta.isEmpty()) {
            mejorRuta.addAll(rutaActual);
        } else if (mejorRuta.size() > rutaActual.size()) {
            mejorRuta.clear();
            mejorRuta.addAll(rutaActual);
        }
    }

//    public void imprimirNodos() {
//        for (NodoCiudad nodo : rutaActual) {
//            System.out.println(nodo.getName());
//        }
//        System.out.println("--------------");
//    }
    public void imprimirMejorRuta() {
        System.out.println("IMPRIMIENDO MEJOR RUTA");
        if (mejorRuta.isEmpty()) {
            System.out.println("OBJETIVO ALCANZADO");

        } else {

            for (Jugador nodo : mejorRuta) {
                System.out.println(nodo.toString());
            }
            System.out.println("--------------");
        }
    }

    public void imprimirPila() {
        for (Jugador nodosVisitado : nodosVisitados) {
            System.out.println(nodosVisitado.toString());
        }
        System.out.println("--------------");
    }

}
