package Board;

public class Board {


    private String[][] board = new String[9][8];

    public Board(String[][] board) {
        this.board = board;
    }

    public Board() {
    }

    public String[][] getBoard() {
        return board;
    }

    public String toString(){
        return "" + getBoard();
    }
}
