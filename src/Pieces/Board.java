package Pieces;

public class Board {

    private int line;
    private int columns;
    private Piece[][] pieces;

    public Board(int line, int columns) {
        this.line = line;
        this.columns = columns;
        pieces = new Piece[line][columns];
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
