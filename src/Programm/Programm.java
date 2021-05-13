package Programm;

import Chess.ChessMatch;

import java.util.Locale;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}