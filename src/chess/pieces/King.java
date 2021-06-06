package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    private ChessMatch chessMatch;

    public King(Board board, Color color, ChessMatch chessMatch) {
        super(board, color);
        this.chessMatch = chessMatch;
    }

    @Override
    public String toString() {
        return "K";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    private boolean testRookCastling(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p instanceof Rook && p.getColor() == getColor() && p.getMoveCount() == 0;
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getLines()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //Mover para cima

        p.setValues(position.getLine() - 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //Abaixo

        p.setValues(position.getLine() + 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //Esquerda

        p.setValues(position.getLine(), position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //Direita

        p.setValues(position.getLine(), position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        // Diagonal Direita cima

        p.setValues(position.getLine() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        // Diagonal Esquerda cima

        p.setValues(position.getLine() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        // Diagonal Direita baixo

        p.setValues(position.getLine() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        // Diagonal Esquerda baixo

        p.setValues(position.getLine() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //Movimento especial roque pequeno

        if (getMoveCount() == 0 && !chessMatch.getCheck()) {
            //Roque pequeno
            Position posK = new Position(position.getLine(), position.getColumn() + 3);
            if (testRookCastling(posK)) {
                Position p1 = new Position(position.getLine(), position.getColumn() + 1);
                Position p2 = new Position(position.getLine(), position.getColumn() + 2);
                if (getBoard().piece(p1) == null && getBoard().piece(p2) == null) {
                    mat[position.getLine()][position.getColumn() + 2] = true;
                }
            }
        }
        //Movimento especial roque grande

        if (getMoveCount() == 0 && !chessMatch.getCheck()) {
            //Roque Grande
            Position posK = new Position(position.getLine(), position.getColumn() - 4);
            if (testRookCastling(posK)) {
                Position p1 = new Position(position.getLine(), position.getColumn() - 1);
                Position p2 = new Position(position.getLine(), position.getColumn() - 2);
                Position p3 = new Position(position.getLine(), position.getColumn() - 3);
                if (getBoard().piece(p1) == null && getBoard().piece(p2) == null && getBoard().piece(p3) == null) {
                    mat[position.getLine()][position.getColumn() - 3] = true;
                }
            }
        }
        return mat;
    }
}
