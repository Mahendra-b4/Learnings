package tictactoe.appRunner;

import tictactoe.controller.GameController;
import tictactoe.exceptions.DuplicateSymbolFoundException;
import tictactoe.exceptions.MoreThanOneBotException;
import tictactoe.exceptions.PlayersCountMismatchException;
import tictactoe.models.*;
import tictactoe.strategies.winningStratagies.ColWinningStrategy;
import tictactoe.strategies.winningStratagies.DiaWinningStrategy;
import tictactoe.strategies.winningStratagies.RowWinningStrategy;
import tictactoe.strategies.winningStratagies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws PlayersCountMismatchException, MoreThanOneBotException, DuplicateSymbolFoundException {
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        int dimensions = 3;
        List<Player> playerList = new ArrayList<>();
        List<WinningStrategy> winningStrategyList = new ArrayList<>();

        playerList.add(new Player("Mahendra", 9, 'X', PlayerType.HUMAN));
//        playerList.add(new Player("Bot", 9, 'X', PlayerType.BOT));

        playerList.add(new Bot("Sys", 10, 'O',PlayerType.BOT, BotDifficultyLevel.EASY));

        winningStrategyList.add(new RowWinningStrategy());
        winningStrategyList.add(new ColWinningStrategy());
        winningStrategyList.add(new DiaWinningStrategy());

        Game game = gameController.startGame(dimensions, playerList, winningStrategyList);
//        GameState = GameState.IN_PROG;
        while (game.getGameState().equals(GameState.IN_PROG)) {
            gameController.printBoard(game);
//            if(game.getNextPlayerIndex())
            System.out.println("For UNDO type 'YES' or type 'NO' for continuing");
            String undo = scanner.next();

            if(undo.equalsIgnoreCase("YES")){
                gameController.undo(game);
                continue;
            }

            gameController.makeMove(game);
        }

        if(game.getGameState().equals(GameState.SUCCESS)){
            System.out.println(game.getWinner().getName() + " Congratulations!!, you are a winner");
        }
        if(game.getGameState().equals(GameState.DRAW)){
            System.out.println("Game Draw");
        }
    }
}
