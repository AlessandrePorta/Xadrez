package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "B";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getLines()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //Diagonal Esquerda Cima

        p.setValues(position.getLine() - 1, position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
            p.setValues(p.getLine() - 1, p.getColumn() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //Diagonal Direita Cima

        p.setValues(position.getLine() - 1, position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
            p.setValues(p.getLine() - 1, p.getColumn() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //Diagonal Esquerda Baixo

        p.setValues(position.getLine() + 1, position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
            p.setValues(p.getLine() + 1, p.getColumn() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //Diagonal Direita Baixo

        p.setValues(position.getLine() + 1, position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
            p.setValues(p.getLine() + 1, p.getColumn() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        return mat;
    }
}