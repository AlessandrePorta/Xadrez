package Chess;

import BoardGame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getLine()][board.getColumns()];
        for( int i = 0; i < board.getLine(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}