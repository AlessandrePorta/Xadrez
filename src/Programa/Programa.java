package Programa;

import Board.Board;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Board board = new Board();
        int[][] lista = board.getBoard();

        lista[0][1] = 1;
        lista[0][2] = 2;
        lista[0][3] = 3;
        lista[0][4] = 4;
        lista[0][5] = 5;
        lista[0][6] = 6;
        lista[0][7] = 7;
        lista[0][8] = 8;

        for (int coluna = 0; coluna <= lista.length - 1; coluna++) {
            System.out.println("");
            for (int linha = 0; linha <= lista[0].length - 1; linha++) {
                System.out.print(lista[coluna][linha]);
            }
        }
    }
}
