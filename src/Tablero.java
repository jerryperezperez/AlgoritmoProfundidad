/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jerry
 */
public class Tablero {

    static int variable = 0;
    private char[][] casillas;

    public Tablero() {

        char[][] cuerda = {{'.', '#', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '#', '#', '.', '.', '.', '.', '.'},
        };

        this.casillas = cuerda;
//        this.casillas[0][0] = '.';//COMIENZA
//        this.casillas[0][1] = '#';
//        this.casillas[0][2] = '.';//FINALIZA
//        this.casillas[1][1] = '.';
//        this.casillas[1][0] = '.';
//        this.casillas[2][2] = '#';
//        this.casillas[2][0] = '.';
//        this.casillas[2][1] = '#';
//        this.casillas[1][2] = '.';
    }

    public static void imprimir() {
        System.out.println(Tablero.variable);
    }

    public void imprimirTablero() {
        for (char[] casilla : casillas) {
            for (char c : casilla) {
                System.out.print(c + "  ");
            }
            System.out.println();
        }
    }

    public void posicionarJugador(int fila, int columna) {
        this.casillas[fila][columna] = 'T';
    }

    public char[][] getCasillas() {
        return casillas;
    }

}
