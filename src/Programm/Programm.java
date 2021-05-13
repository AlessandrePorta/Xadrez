package Programm;

import Board.*;
import Pieces.Pawn;

import java.util.Locale;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Board board = new Board();
        String[][] lista = board.getBoard();
        int[] column = new int[9];

        lista[0][0] = "a";
        lista[0][1] = "b";
        lista[0][2] = "c";
        lista[0][3] = "d";
        lista[0][4] = "e";
        lista[0][5] = "f";
        lista[0][6] = "g";
        lista[0][7] = "h";

        //Setting - Tower
        lista[1][0] = "T";
        lista[8][0] = "T";
        lista[1][7] = "T";
        lista[8][7] = "T";
        //Setting - Horse
        lista[1][1] = "H";
        lista[8][1] = "H";
        lista[1][6] = "H";
        lista[8][6] = "H";
        //Setting - Bishop
        lista[1][2] = "B";
        lista[8][2] = "B";
        lista[1][5] = "B";
        lista[8][5] = "B";
        //Setting - Queen
        lista[1][4] = "Q";
        lista[8][3] = "Q";
        //Setting - King
        lista[1][3] = "K";
        lista[8][4] = "K";


        for (int linha = 0; linha <= lista.length - 1; linha++) {
            for (int coluna = 0; coluna < lista.length - 1; coluna++) {
                if (lista[linha][coluna] == null) {
                    String aux = "-";
                    lista[linha][coluna] = aux;
                }
            }
        }

        for (int n = 0; n < lista.length - 1; n++) {
            String p = new String("P");
            lista[2][n] = p;
            for (int m = 0; m < lista.length - 1; m++){
                lista[7][m] = p;
            }
        }

        for (int linha = lista.length - 1; linha >= 0; linha--) {
            System.out.println();
            int aux = linha;
            column[linha] = aux;
            System.out.print(aux);
            for (int coluna = 0; coluna <= lista[0].length - 1; coluna++) {
                System.out.print("\t" + lista[linha][coluna]);
            }
        }
    }
}