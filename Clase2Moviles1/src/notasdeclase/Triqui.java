package notasdeclase;

import java.util.Scanner;

public class Triqui {
        static Scanner sc = new Scanner(System.in);
        static String player1;
        static String player2;
        static int fila = 0;
        static int columna = 0;
        static char[][] board = new char [3][3];

        public static void main(String[] args) {

        System.out.println("Nombre del jugador 1: ");
        player1 = sc.nextLine();
        System.out.println("Nombre del jugador 2: ");
        player2 = sc.nextLine();

        llenar(board);

        dibujar(board);

        play(board);

    }
        public static void llenar(char[][] board) {

            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }
        }
        public static void dibujar(char[][] board) {

        System.out.println("+++++++++TABLERO+++++++++");

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print("  | " + board[i][j] + " | ");
            }
            System.out.println();
        }
    }
        public static void play(char[][] board){

            boolean Fin = false;
            boolean player = true;

            while(!Fin) {

                if(player) {
                    System.out.println("Turno de " + player1);
                }else {
                    System.out.println("Turno de " + player2);
                }

                char simbolo = '-';

                if(player) {
                    simbolo = 'X';
                }else {
                    simbolo = 'O';
                }
                while(true) {
                    System.out.println("Ingresa la fila (1, 2 o 3)");
                    fila = sc.nextInt() - 1;
                    System.out.println("Ingresa la columna (1, 2 o 3)");
                    columna = sc.nextInt() - 1;
                    if(fila < 0 || columna < 0 || fila > 2 || columna > 2) {
                        System.out.println("Opción fuera de los límites del tablero.");
                    }else if (board[fila][columna] != '-'){
                        System.out.println("Esta posición ya se encuentra ocupada.");
                    } else {
                        break;
                    }
                }
                board[fila][columna] = simbolo;

                if(GameWon(board) == 'X') {
                    System.out.println(player1 + " ha ganado!");
                    Fin = true;
                }
                else if(GameWon(board) == 'O') {
                    System.out.println(player2 + " ha ganado");
                    Fin = true;
                }
                else if(boardIsFull(board)) {
                    System.out.println( "Empate! ");
                    Fin = true;
                }
                else {
                    player = !player;
                    dibujar(board);
                }
            }
    }
        public static boolean boardIsFull(char[][]board) {
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    if(board[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }
        public static char GameWon(char[][]board) {

            //Comprueba la fila
            for(int i=0; i<3; i++) {
                if(board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                    return board[i][0];
                }
            }
            //comprueba la columna
            for(int i=0; i<3; i++) {
                if(board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                    return board[0][i];
                }
            }
            //Comprueba diagonal
            if(board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                return board[0][0];
            }
            //Comprueba segunda diagonal
            if(board[2][0] != '-' && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
                return board[2][0];
            }
            return ' ';
        }
    }

