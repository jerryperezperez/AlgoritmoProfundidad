/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Ciudad implements Comparable<Ciudad> {

    private final String nombre;
    private ArrayList<Ciudad> ciudadesDisponibles;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.ciudadesDisponibles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Ciudad> getCiudadesDisponibles() {
Collections.shuffle(this.ciudadesDisponibles);
        return (ArrayList<Ciudad>) this.ciudadesDisponibles.clone();
    }

    public void head(Ciudad ciudad) {
        this.ciudadesDisponibles.add(ciudad);
    }

    public void head(Ciudad... ciudades) {
        this.ciudadesDisponibles.addAll(Arrays.asList(ciudades));
    }

    @Override
    public int compareTo(Ciudad ciudad) {
        return this.nombre.compareTo(ciudad.getNombre());
    }

}
