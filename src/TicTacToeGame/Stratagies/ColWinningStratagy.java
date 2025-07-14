package TicTacToeGame.Stratagies;

import TicTacToeGame.Models.Board;
import TicTacToeGame.Models.Cell;
import TicTacToeGame.Models.Symbol;

public class ColWinningStratagy implements WinningStratagy{
    @Override
    public boolean checkWinner(Cell[][] board, int row, int col, Symbol symbol) {
        int count = 0;
        for(int j=0 ; j< 3 ; j++){
            if(board[row][j].getSymbol().equals(symbol)){
                count++;
            }
        }
        return count == 3;
    }
}
