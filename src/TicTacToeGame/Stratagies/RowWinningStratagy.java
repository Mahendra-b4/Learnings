package TicTacToeGame.Stratagies;

import TicTacToeGame.Models.Board;
import TicTacToeGame.Models.Cell;
import TicTacToeGame.Models.Symbol;

public class RowWinningStratagy implements WinningStratagy{
    @Override
    public boolean checkWinner(Cell[][] board, int row, int col, Symbol symbol) {
        int count = 0;
        for(int i=0 ; i<3; i++){
            if(board[i][col].getSymbol().equals(symbol)){
                count++;
            }
        }

        return count == 3;
    }
}
