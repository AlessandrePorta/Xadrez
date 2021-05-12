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

        lista[9][0] = "a";
        lista[9][1] = "b";
        lista[9][2] = "c";
        lista[9][3] = "d";
        lista[9][4] = "e";
        lista[9][5] = "f";
        lista[9][6] = "g";
        lista[9][7] = "h";

        for (int linha = 0; linha < lista.length-1; linha++){
            for (int coluna = 0; coluna < lista.length - 2; coluna++){
                if (lista[linha][coluna] == null){
                    String aux = "-";
                    lista[linha][coluna] = aux;
                }
            }
        }

        for (int coluna = lista.length-1; coluna >= 1; coluna--) {
            System.out.println("");
            int aux = coluna;
            column[coluna] = aux;
            System.out.print(column[coluna]);
            for (int linha = 0; linha <= lista[0].length-1; linha++) {
                System.out.print(lista[coluna][linha]);
            }
        }
    }
}
