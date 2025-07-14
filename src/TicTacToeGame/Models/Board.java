package TicTacToeGame.Models;

import TicTacToeGame.Stratagies.ColWinningStratagy;
import TicTacToeGame.Stratagies.DiaWinningStratagy;
import TicTacToeGame.Stratagies.RowWinningStratagy;
import TicTacToeGame.Stratagies.WinningStratagy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {

    final int size;
    Cell[][] board;
    int movesCount;
    private List<WinningStratagy> winningStratagylist;
    Board(int size){
        this.size = size;
        initializeBoard(size);
        movesCount = 0;
        winningStratagylist = Arrays.asList(new RowWinningStratagy(), new ColWinningStratagy(), new DiaWinningStratagy());
    }

    public int getSize() {
        return size;
    }

    public Cell[][] getBoard() {
        return board;
    }

    private void initializeBoard(int size) {
        board = new Cell[size][size];
        for(int i=0 ; i<size ; i++){
            for(int j=0 ; j<size ; j++){
                board[i][j] = new Cell();
                board[i][j].setSymbol(Symbol.EMPTY);
            }
        }
    }

    Boolean isMoveValid(int row, int col){
        return (row>=0 && row<3 && col>=0 && col<3 && board[row][col].isEmpty()) ;
    }

    GameStatus placeMove(int row, int col, Player player){
        if(isMoveValid(row, col)) {
            board[row][col].setSymbol(player.getSymbol());
//            printBoard();
            movesCount++;
            if (checkWin(row, col, player.getSymbol())) {
//                System.out.println(player.getName() + " has won the game");
//                return true;
                return GameStatus.WIN;
            }
            if (movesCount == 9) {
//                System.out.println("Game Draw");
//                return true;
                return GameStatus.DRAW;
            }
//            return false;
            return GameStatus.IN_PROGRESS;
        }
        else{
            System.out.println("Given row and col are incorrect or the cell is already occupied, kindly give correct input");
        }
        return GameStatus.IN_PROGRESS;
    }

    private boolean checkWin(int row, int col, Symbol symbol) {
        for(WinningStratagy ws:winningStratagylist){
            if(ws.checkWinner(board, row, col, symbol)) return true;
        }
        return false;
    }

    public void printBoard() {
        for(int i=0 ; i<size ; i++){
            for(int j=0 ; j<size ; j++){
                board[i][j].display();
            }
            System.out.println();
        }
    }

}
