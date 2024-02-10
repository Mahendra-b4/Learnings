package tictactoe.models;

import tictactoe.strategies.botPlayingStratigies.BotPlayingStrategy;
import tictactoe.strategies.botPlayingStratigies.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, int id, char symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(name, id, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyforDifficultyLevel(botDifficultyLevel);
    }

//    public BotDifficultyLevel getDifficultyLevel() {
//        return botDifficultyLevel;
//    }

//    public void setDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
//        this.botDifficultyLevel = botDifficultyLevel;
//    }

    @Override
    public Cell makeMove(Board board){
        System.out.println("It's Bot turn, wait for the move");
        Cell cell = botPlayingStrategy.makeMove(board);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(this);
        return cell;
    }
}
