package Pieces;

public class Pawn extends Movimentation {

    private String movimentPawn = "P";

    public Pawn(String movimentPawn) {
        this.movimentPawn = movimentPawn;
    }

    public String getmovimentPawn() {
        return movimentPawn;
    }

    public void setmovimentPawn(String movimentPawn) {
        this.movimentPawn = movimentPawn;
    }
}
