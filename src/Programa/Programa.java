package Programa;

import Board.Board;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Board board = new Board();
        String[][] lista = board.getBoard();
        int[] column = new int[9];

        lista[8][0] = "a";
        lista[8][1] = "b";
        lista[8][2] = "c";
        lista[8][3] = "d";
        lista[8][4] = "e";
        lista[8][5] = "f";
        lista[8][6] = "g";
        lista[8][7] = "h";

        for (int linha = 0; linha < lista.length; linha++){
            for (int coluna = 0; coluna < lista.length-1; coluna++){
                if (lista[linha][coluna] == null){
                    String aux = "-";
                    lista[linha][coluna] = aux;
                }
            }
        }

        for (int coluna = 0; coluna <= lista.length - 1; coluna++) {
            System.out.println("");
            int aux = coluna;
            column[coluna] = aux;
            System.out.print(column[coluna]);
            for (int linha = 0; linha <= lista[0].length - 1; linha++) {
                System.out.print(lista[coluna][linha]);
            }
        }
    }
}
