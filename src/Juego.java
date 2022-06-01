/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author jerry
 */
public class Juego {

    private Tablero tablero;
    private Jugador jugador;

    public Juego(Tablero tablero, Jugador jugador) {
        this.tablero = tablero;
        this.jugador = jugador;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Jugador> getJugadorDisponible() {

        ArrayList<Jugador> jugadores = new ArrayList<>();
        Jugador auxiliar = this.jugador;
        auxiliar.moverAbajo();
        if (auxiliar.getColumna() >= 0 && auxiliar.getColumna() <= 2) {
            if (auxiliar.getFila() >= 0 && auxiliar.getFila() <= 2) {
                if (this.tablero.getCasillas()[auxiliar.getFila()][auxiliar.getColumna()] != '#') {
                    jugadores.add(auxiliar);
                }
            }
        }

        auxiliar.moverArriba();
        if (auxiliar.getColumna() >= 0 && auxiliar.getColumna() <= 2) {
            if (auxiliar.getFila() >= 0 && auxiliar.getFila() <= 2) {
                if (this.tablero.getCasillas()[auxiliar.getFila()][auxiliar.getColumna()] != '#') {
                    jugadores.add(auxiliar);
                }
            }
        }

        auxiliar.moverDerecha();
        if (auxiliar.getColumna() >= 0 && auxiliar.getColumna() <= 2) {
            if (auxiliar.getFila() >= 0 && auxiliar.getFila() <= 2) {
                if (this.tablero.getCasillas()[auxiliar.getFila()][auxiliar.getColumna()] != '#') {
                    jugadores.add(auxiliar);
                }
            }
        }

        auxiliar.moverIzquierda();
        if (auxiliar.getColumna() >= 0 && auxiliar.getColumna() <= 2) {
            if (auxiliar.getFila() >= 0 && auxiliar.getFila() <= 2) {
                if (this.tablero.getCasillas()[auxiliar.getFila()][auxiliar.getColumna()] != '#') {
                    jugadores.add(auxiliar);
                }
            }
        }
        return (ArrayList<Jugador>) jugadores.clone();
    }

}
