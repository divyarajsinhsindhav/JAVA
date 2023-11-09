package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("Up, Down, Right, Left, Diagonal(All 4 Sides)");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("Up, Down, Right, Left");
    }
}