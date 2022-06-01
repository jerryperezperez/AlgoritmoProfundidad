import java.util.*;

public class Algoritmo {

    Ciudad nodoInicial;
    Ciudad nodoFinal;
   
    Stack<Ciudad> nodosVisitados = new Stack();
    ArrayList<Ciudad> mejorRuta = new ArrayList();
    Stack<Ciudad> rutaActual = new Stack();

    public Algoritmo(Ciudad nodoInicial, Ciudad nodoFinal) {
        this.nodoInicial = nodoInicial;
        this.nodoFinal = nodoFinal;
        this.ejecutar(nodoInicial);

    }

    public void ejecutar(Ciudad nodoActual) {
        if (!nodoActual.equals(nodoFinal)) {
//            if (nodosVisitados.add(nodoFinal)) {
//                
//            }
            if (!nodosVisitados.contains(nodoActual)) {
                rutaActual.add(nodoActual);
                this.nodosVisitados.add(nodoActual);
                //imprimirNodos();
                for (Ciudad nodoHijo : nodoActual.getCiudadesDisponibles()) {
                    if (nodoHijo.equals(nodoFinal)) {
                        rutaActual.add(nodoHijo);
                        this.nodosVisitados.add(nodoHijo);
                        this.detectarRutaCorta(rutaActual);
                        rutaActual.remove(rutaActual.size() - 1);
                        nodosVisitados.remove(nodosVisitados.size() - 1);
                    }
                    this.ejecutar(nodoHijo);
                }
                this.rutaActual.pop();
//                rutaActual.remove(rutaActual.size() - 1);
                this.nodosVisitados.pop();
                // nodosVisitados.remove(nodosVisitados.size() - 1);
                return;
            }
        }
    }

    public void detectarRutaCorta(Stack<Ciudad> rutaActual) {
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
        if (mejorRuta.isEmpty()) {
            System.out.println("OBJETIVO ALCANZADO");

        } else {
            for (Ciudad nodo : mejorRuta) {

            }
            System.out.println("--------------");
        }
    }
}
