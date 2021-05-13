package Programm;

import Board.*;
import Pieces.Position;

import java.util.Locale;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Position position = new Position("P", "T", "H", "B", "Q", "K");
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

        for (int l = 1; l<=lista.length; l++){

        }
        //Setting - Tower
        lista[1][0] = position.getTower();
        lista[8][0] = position.getTower();
        lista[1][7] = position.getTower();
        lista[8][7] = position.getTower();
        //Setting - Horse
        lista[1][1] = position.getHorse();
        lista[8][1] = position.getHorse();
        lista[1][6] = position.getHorse();
        lista[8][6] = position.getHorse();
        //Setting - Bishop
        lista[1][2] = position.getBishop();
        lista[8][2] = position.getBishop();
        lista[1][5] = position.getBishop();
        lista[8][5] = position.getBishop();
        //Setting - Queen
        lista[1][4] = position.getQueen();
        lista[8][3] = position.getQueen();
        //Setting - King
        lista[1][3] = position.getKing();
        lista[8][4] = position.getKing();


        for (int linha = 0; linha <= lista.length - 1; linha++) {
            for (int coluna = 0; coluna < lista.length - 1; coluna++) {
                if (lista[linha][coluna] == null) {
                    String aux = "-";
                    lista[linha][coluna] = aux;
                }
            }
        }

        for (int n = 0; n < lista.length - 1; n++) {
            lista[2][n] = "P";
            for (int m = 0; m < lista.length - 1; m++){
                lista[7][m] = "P";
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