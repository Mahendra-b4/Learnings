package TicTacToeGame.AppRunner;

import TicTacToeGame.Controllers.GameController;
import TicTacToeGame.Models.Game;
import TicTacToeGame.Models.GameStatus;
import TicTacToeGame.Models.Player;
import TicTacToeGame.Models.Symbol;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        Player player1 = new Player("Mahendra", Symbol.X);
        Player player2 = new Player("Dhanesh", Symbol.O);

        Game game = gameController.startGame(player1, player2);

        while(game.getGameStatus().equals(GameStatus.IN_PROGRESS)){
            gameController.printBoard(game);
            gameController.makeMove(game);
        }
    }
}
