package tictactoe.models;

import java.util.Scanner;

public class Player {
    private String name;
    private int id;
    private char symbol;
    private PlayerType playerType;

    private Scanner scanner;

    public Player(String name, int id, char symbol, PlayerType playerType) {
        this.name = name;
        this.id = id;
        this.symbol = symbol;
        this.playerType = playerType;
        scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Cell makeMove(Board board) {
        System.out.println("Hi "+getName()+", it's your turn kindly make move");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        while(!validateMove(row, col, board)){
            System.out.println("Invalid move, kindly make move again");
            row = scanner.nextInt();
            col = scanner.nextInt();
        }
        Cell cell = board.getBoard().get(row).get(col);
//        cell.setCellState(CellState.FILLED);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(this);
//        System.out.println("state = "+cell.getCellState());
//        System.out.println("player = "+cell.getPlayer().getName());
        return cell;
    }

    private boolean validateMove(int row, int col, Board board) {
        int size = board.getDimensions();
        if(row >= size || row < 0){
            return false;
        }
        if(col >= size || col < 0 ){
            return false;
        }
        if(CellState.FILLED.equals(board.getBoard().get(row).get(col))){
            return false;
        }
        return true;
    }
}
