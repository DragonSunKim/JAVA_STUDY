// Coding By 김용선.

class Chess {
    enum ChessPlayer {
        WHITE, BLACK
    }

    // final 메서드.
    final ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }
}

class WorldChess extends Chess {

    // getFirstPlayer()는 final 메서드이기 때문에 오버라이딩하면 오류가 발생한다.
    // ChessPlayer getFirstPlayer(){}
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        WorldChess w = new WorldChess();
        w.getFirstPlayer();
    }
}
