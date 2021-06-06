package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "N";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getLines()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //2 Esquerda 1 Cima

        p.setValues(position.getLine() + 1, position.getColumn() - 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //2 Cima 1 Esquerda

        p.setValues(position.getLine() + 2, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //2 Cima 1 Direita

        p.setValues(position.getLine() + 2, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //2 Direita 1 Cima

        p.setValues(position.getLine() + 1, position.getColumn() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //2 Direita 1 Baixo

        p.setValues(position.getLine() - 1, position.getColumn() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //2 Baixo 1 Direita

        p.setValues(position.getLine() - 2, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        //2 Baixo 1 esquerda

        p.setValues(position.getLine() - 2, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }


        //2 Esquerda 1 baixo

        p.setValues(position.getLine() -1, position.getColumn() -2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getLine()][p.getColumn()] = true;
        }

        return mat;
    }
}
