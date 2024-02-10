package tictactoe.models;

import tictactoe.exceptions.DuplicateSymbolFoundException;
import tictactoe.exceptions.MoreThanOneBotException;
import tictactoe.exceptions.PlayersCountMismatchException;
import tictactoe.strategies.winningStratagies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextPlayerIndex;
    private List<WinningStrategy> winningStrategies;

    private Game(int dimensions, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimensions);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.IN_PROG;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void printBoard() {
        board.printBoard();
    }

    public void makeMove() {
        Player curr_player = players.get(nextPlayerIndex);
        Cell cell = curr_player.makeMove(board);

        Move move = new Move(cell, curr_player);
        moves.add(move);
        // adding cur move to moves list

        if(checkWinner(board, move)){
            gameState = GameState.SUCCESS;
            winner = curr_player;
            System.out.println("The winner is "+curr_player.getName());
            printBoard();
            return;
        }
        if(moves.size() == board.getDimensions()* board.getDimensions()){
            gameState = GameState.DRAW;
            return;
        }

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();
    }

    private boolean checkWinner(Board board, Move move) {
        for(WinningStrategy winningStrategy : winningStrategies){
            if (winningStrategy.checkWinner(board, move) == true) {
                return true;
            }
        }
        return false;
    }

    public void undo() {
        Move last_Move = removeLastMove();
        if(last_Move == null){
            return;
        }
        updateTheCellandUndoStratagies(last_Move);
        updateNextPlayerIndex();
    }

    private void updateNextPlayerIndex() {
        nextPlayerIndex--;
        if(nextPlayerIndex < 0){
            nextPlayerIndex = players.size()-1;
        }
    }

    private void updateTheCellandUndoStratagies(Move last_move){
        Cell cell = last_move.getCell();
        cell.setCellState(CellState.EMPTY);

        for(WinningStrategy winningStrategy:winningStrategies){
            winningStrategy.undo(board, last_move);
        }
    }

    private Move removeLastMove(){
        if(moves.size() == 0){
            System.out.println("There is nothing to undo!");
            return null;
        }
        Move last_move = moves.get(moves.size()-1);

        moves.remove(last_move);
        return last_move;
    }

    public static class Builder{
        private int dimensions;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

//        private Builder() {
//            this.dimensions = 0;
//            this.players = new ArrayList<>();
//            this.winningStrategies = new ArrayList<>();
//        }

        public Game build() throws MoreThanOneBotException, DuplicateSymbolFoundException, PlayersCountMismatchException {
            /*
            1. validateBotCount <= 1
            2. validateUniqueSymbolforPlayer
            3. validateDimensionsAndPlayersCount
             */

            validateBotCount();
            validateUniqueSymbolforPlayer();
            validateDimensionsAndPlayersCount();
            
            return new Game(dimensions, players, winningStrategies);
        }

        private void validateDimensionsAndPlayersCount() throws PlayersCountMismatchException {
            if((dimensions-1) != players.size()){
                throw new PlayersCountMismatchException();
            }
        }

        private void validateUniqueSymbolforPlayer() throws DuplicateSymbolFoundException {
            Set<Character> symbols = new HashSet<>();

            for(Player player:players){
                if(symbols.contains(player.getSymbol())){
                    throw new DuplicateSymbolFoundException();
                }
                else{
                    symbols.add(player.getSymbol());
                }
            }
        }

        private void validateBotCount() throws MoreThanOneBotException {
            int botCount = 0;

            for(Player player : players){
                if(player.equals(PlayerType.BOT)) {
                    botCount++;
                }
            }
            if(botCount > 1){
                throw new MoreThanOneBotException();
            }
        }

        public Builder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
//        this.moves = new ArrayList<>();
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }
}
