package BoardGame;

public class Board {

    private int line;
    private int column;
    private Piece[][] pieces;

    public Board(int line, int columns) {
        this.line = line;
        this.column = columns;
        pieces = new Piece[line][columns];
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumns() {
        return column;
    }

    public void setColumn(int columns) {
        this.column = columns;
    }

    public Piece piece(int line, int column){
        return pieces[line][column];
    }

    public Piece piece(Position position){
        return pieces[position.getLine()][position.getColumn()];
    }
}
