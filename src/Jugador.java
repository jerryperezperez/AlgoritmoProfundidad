/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author jerry
 */
public class Jugador {

    private int fila, columna;
    private ArrayList<Jugador> jugadoresAdyacentes;

    public Jugador(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.jugadoresAdyacentes = new ArrayList<>();
    }

    public void setPosicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public void moverIzquierda() {
        this.columna = this.columna - 1;
    }

    public void moverAbajo() {
        this.fila = this.fila + 1;
    }

    public void moverArriba() {
        this.fila = this.fila - 1;
    }

    public void moverDerecha() {
        this.columna = this.columna + 1;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public ArrayList<Jugador> getJugadorDisponible() {

        ArrayList<Jugador> jugadores = new ArrayList<>();
        Jugador auxiliar = new Jugador(this.fila, this.columna);
        auxiliar.moverAbajo();

        if (auxiliar.getColumna() >= 0 && auxiliar.getColumna() <= 7) {
            if (auxiliar.getFila() >= 0 && auxiliar.getFila() <= 2) {
                if ((auxiliar.getFila() == 0 && auxiliar.getColumna() == 1) == false) {
                    if ((auxiliar.getFila() == 2 && auxiliar.getColumna() == 2) == false) {
                        if ((auxiliar.getFila() == 2 && auxiliar.getColumna() == 1) == false) {
                            if (!this.equals(auxiliar)) {
                                this.jugadoresAdyacentes.add(auxiliar);
                                System.out.println(auxiliar.toString());
                            }
                        }
                    }
                }
            }
        }
        auxiliar = new Jugador(this.fila, this.columna);
        auxiliar.moverArriba();

        if (auxiliar.getColumna() >= 0 && auxiliar.getColumna() <= 7) {
            if (auxiliar.getFila() >= 0 && auxiliar.getFila() <= 2) {
                if ((auxiliar.getFila() == 0 && auxiliar.getColumna() == 1) == false) {
                    if ((auxiliar.getFila() == 2 && auxiliar.getColumna() == 2) == false) {
                        if ((auxiliar.getFila() == 2 && auxiliar.getColumna() == 1) == false) {
                            if (!this.equals(auxiliar)) {
                                this.jugadoresAdyacentes.add(auxiliar);
                                System.out.println(auxiliar.toString());
                            }
                        }
                    }
                }
            }
        }
        auxiliar = new Jugador(this.fila, this.columna);
        auxiliar.moverDerecha();

        if (auxiliar.getColumna() >= 0 && auxiliar.getColumna() <= 7) {
            if (auxiliar.getFila() >= 0 && auxiliar.getFila() <= 2) {
                if ((auxiliar.getFila() == 0 && auxiliar.getColumna() == 1) == false) {
                    if ((auxiliar.getFila() == 2 && auxiliar.getColumna() == 2) == false) {
                        if ((auxiliar.getFila() == 2 && auxiliar.getColumna() == 1) == false) {
                            if (!this.equals(auxiliar)) {
                                this.jugadoresAdyacentes.add(auxiliar);
                                System.out.println(auxiliar.toString());
                            }
                        }
                    }
                }
            }
        }
        auxiliar = new Jugador(this.fila, this.columna);
        auxiliar.moverIzquierda();

        if (auxiliar.getColumna() >= 0 && auxiliar.getColumna() <= 7) {
            if (auxiliar.getFila() >= 0 && auxiliar.getFila() <= 2) {
                if ((auxiliar.getFila() == 0 && auxiliar.getColumna() == 1) == false) {
                    if ((auxiliar.getFila() == 2 && auxiliar.getColumna() == 2) == false) {
                        if ((auxiliar.getFila() == 2 && auxiliar.getColumna() == 1) == false) {
                            if (!this.equals(auxiliar)) {
                                this.jugadoresAdyacentes.add(auxiliar);
                                System.out.println(auxiliar.toString());
                            }

                        }
                    }
                }
            }
        }
        System.out.println("TALLA DEL ARREGLO: " + jugadoresAdyacentes.size());
        return (ArrayList<Jugador>) this.jugadoresAdyacentes.clone();
    }

    @Override
    public String toString() {
        return "[" + this.fila + " , " + this.columna + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Jugador) {
            Jugador jugador = (Jugador) obj;
            return (this.fila == jugador.fila && this.columna == jugador.columna);
        } else {
            return false;
        }

    } //Cierre del método equals

}
