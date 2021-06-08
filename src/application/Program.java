package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ChessMatch chessMatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();

        while (!chessMatch.getCheckMate()) {
            try {
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.println();
                System.out.print("Qual peca deseja mover: ");
                ChessPosition source = UI.readChessPosition(sc);
                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);
                System.out.println();
                System.out.print("Para qual casa: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                if(capturedPiece != null){
                    captured.add(capturedPiece);
                }
                if(chessMatch.getPromoted() != null){
                    System.out.print("Digite para qual peça deseja promover: (B/N/R/Q)");
                    String type = sc.nextLine();
                    chessMatch.replacePromotedPiece(type);
                }
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        UI.clearScreen();
        UI.printMatch(chessMatch, captured);
    }
}