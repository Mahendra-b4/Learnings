package TicTacToeGame.Stratagies;

import TicTacToeGame.Models.Board;
import TicTacToeGame.Models.Cell;
import TicTacToeGame.Models.Symbol;

public interface WinningStratagy {

    boolean checkWinner(Cell[][] board, int row, int col, Symbol symbol);
}
