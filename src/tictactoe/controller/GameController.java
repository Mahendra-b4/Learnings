package tictactoe.controller;

import tictactoe.exceptions.DuplicateSymbolFoundException;
import tictactoe.exceptions.MoreThanOneBotException;
import tictactoe.exceptions.PlayersCountMismatchException;
import tictactoe.models.Game;
import tictactoe.models.Player;
import tictactoe.strategies.winningStratagies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int dimensions, List<Player>players, List<WinningStrategy> winningStrategies) throws PlayersCountMismatchException, MoreThanOneBotException, DuplicateSymbolFoundException {
        return Game.getBuilder()
                .setDimensions(dimensions)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game) {
        game.undo();
    }
}
