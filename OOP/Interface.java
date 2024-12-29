public class Interface {
    
    public static void main(String[] args){
        queen q = new queen();
        q.moves();
    }
}
 
interface  ChessPlayer {
    void moves(); // we cannot implement because we have to implement abstraction
//bluprintof chessplayer  ki  wo kesadikhta hoga ushka naam de diye chesspalyer
}

class queen implements ChessPlayer {
    public void moves(){ // we have to write public
        System.out.println("up,down,left,right,diagonal");

    }
}
class rook implements ChessPlayer {
    public void moves(){ // we have to write public
        System.out.println("up,down,left,right");

    }
}
class king implements ChessPlayer {
    public void moves(){ // we have to write public
        System.out.println("up,down,left,right,diagonal(by one step)");

    }
}

// absraction aaise implement hua ki moves ke liye bas hamne likh diya ki kese implement ina chahiye difine nhi kiya kyuki sub class btatigi 