package TicTacToeGame.Controllers;

import TicTacToeGame.Models.Game;
import TicTacToeGame.Models.Player;

import java.util.Scanner;

public class GameController {

    private Scanner scanner;

    public Game startGame(Player player1, Player player2){
        scanner = new Scanner(System.in);
        return new Game(player1, player2, 3);
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

    public void makeMove(Game game) throws NullPointerException{
        System.out.println("Enter row and column");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        game.makeMove(x, y);
    }
}
