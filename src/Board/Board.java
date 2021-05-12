package Board;

public class Board {


    private int[][] board = new int[9][9];

    public Board(int[][] board) {
        this.board = board;
    }

    public Board() {
    }

    public int[][] getBoard() {
        return board;
    }

    public String toString(){
        return "" + getBoard();
    }
}
