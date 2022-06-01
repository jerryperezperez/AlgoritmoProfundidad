/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jerry
 */
public class Clase {

    private String nombre;
    private int edad;

    public Clase(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Clase) {
            Clase tmpPersona = (Clase) obj;
            return this.nombre.equals(tmpPersona.nombre) && this.edad == tmpPersona.edad;
        } else {
            return false;
        }

    } //Cierre del método equals

}
