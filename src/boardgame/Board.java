package boardgame;

public class Board {

    private int lines;
    private int columns;
    private Piece[][] pieces;

    public Board(int lines, int columns) {
        if(lines <1 || columns < 1){
            throw new BoardException("Error criando o tabuleiro: é necessário pelo menor uma linha e uma coluna.");
        }
        this.lines = lines;
        this.columns = columns;
        pieces = new Piece[lines][columns];
    }

    public int getLines() {
        return lines;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int lines, int columns){
        if(!positionExists(lines, columns)) {
            throw new BoardException("Posição não existe no tabuleiro.");
        }
        return pieces[lines][columns];
    }

    public Piece piece(Position position){
        if(!positionExists(position)) {
            throw new BoardException("Posição não existe no tabuleiro.");
        }
        return pieces[position.getLine()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardException("Já existe uma peça na posição "+position+" do tabuleiro");
        }
        pieces[position.getLine()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Posicao nao existe no tabuleiro.");
        }
        if(piece(position) == null){
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getLine()][position.getColumn()] = null;
        return aux;
    }

    private boolean positionExists(int line, int column){
        return line >= 0 && line < lines && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getLine(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if(!positionExists(position)) {
            throw new BoardException("Posicao nao existe no tabuleiro.");
        }
        return piece(position) != null;
    }
}
