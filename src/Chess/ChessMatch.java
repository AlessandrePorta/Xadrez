package Chess;

import BoardGame.Board;
import BoardGame.Position;
import Chess.Pieces.King;
import Chess.Pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
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

    private void initialSetup(){
        board.PlacePiece(new Rook(board, Color.WHITE), new Position(2,1));
        board.PlacePiece(new King(board, Color.BLACK), new Position(0,4));
        board.PlacePiece(new King(board, Color.WHITE), new Position(7,4));
    }
}
