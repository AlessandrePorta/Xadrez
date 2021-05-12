package Programm;

import Board.*;
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

        for (int linha = 0; linha <= lista.length - 1; linha++){
            for (int coluna = 0; coluna < lista.length - 1; coluna++){
                if (lista[linha][coluna] == null){
                    String aux = "-";
                    lista[linha][coluna] = aux;
                }
            }
        }

        for (int linha = lista.length-1; linha >= 0; linha--) {
            System.out.println();
            int aux = linha;
            column[linha] = aux;
            System.out.print(aux);
            for (int coluna = 0; coluna <= lista[0].length-1; coluna++) {
                System.out.print("\t" + lista[linha][coluna]);
            }
        }
    }
}