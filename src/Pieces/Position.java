package Pieces;

public class Position {

    private String pawn = "P";
    private String tower = "T";
    private String horse = "H";
    private String bishop = "B";
    private String queen = "Q";
    private String king = "K";

    public Position(String pawn, String tower, String horse, String bishop, String queen, String king) {
        this.pawn = pawn;
        this.tower = tower;
        this.horse = horse;
        this.bishop = bishop;
        this.queen = queen;
        this.king = king;
    }

    public String getPawn() {
        return pawn;
    }

    public void setPawn(String pawn) {
        this.pawn = pawn;
    }

    public String getTower() {
        return tower;
    }

    public void setTower(String tower) {
        this.tower = tower;
    }

    public String getHorse() {
        return horse;
    }

    public void setHorse(String horse) {
        this.horse = horse;
    }

    public String getBishop() {
        return bishop;
    }

    public void setBishop(String bishop) {
        this.bishop = bishop;
    }

    public String getQueen() {
        return queen;
    }

    public void setQueen(String queen) {
        this.queen = queen;
    }

    public String getKing() {
        return king;
    }

    public void setKing(String king) {
        this.king = king;
    }
}
