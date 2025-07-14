package TicTacToeGame.Stratagies;

import TicTacToeGame.Models.Board;
import TicTacToeGame.Models.Cell;
import TicTacToeGame.Models.Symbol;

public class DiaWinningStratagy implements WinningStratagy{
    @Override
    public boolean checkWinner(Cell[][] board, int row, int col, Symbol symbol) {
        if(Math.abs(row-col) == 1) return false;
        return rightDiaCheck(board, row, col, symbol) || leftDiaCheck(board, row, col, symbol);
    }

    private boolean leftDiaCheck(Cell[][] board, int row, int col, Symbol symbol) {
        int count = 0;
        for(int i=0 ; i< 3 ; i++){
            if(board[i][i].getSymbol().equals(symbol)) count++;
        }
        return count == 3;
    }

    private boolean rightDiaCheck(Cell[][] board, int row, int col, Symbol symbol) {
        int count = 0;
        int j=2;
        for(int i=0 ; i< 3 ; i++){
            if(board[i][j].getSymbol().equals(symbol)) count++;
            j--;
        }
        return count == 3;
    }
}
