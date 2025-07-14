package TicTacToeGame.Models;

public class Game {
    final Board board;
    final Player[] players;
    int currentPlayerIndex;
    GameStatus gameStatus;

    public Game(Player player1, Player player2, int size){
        players = new Player[2];
        players[0] = player1;
        players[1] = player2;
        board = new Board(size);
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public void makeMove(int row, int col){
        Player player = players[currentPlayerIndex];
        GameStatus state = board.placeMove(row, col, player);
        currentPlayerIndex++;
        currentPlayerIndex = currentPlayerIndex%2;

        if(state.equals(GameStatus.WIN)){
            this.gameStatus = state;
            System.out.println(player.getName()+" has won the game");
        }
        else if(state.equals(GameStatus.DRAW)){
            System.out.println("Game DRAW");
        }
//        return ;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void printBoard() {
        board.printBoard();
    }

}
