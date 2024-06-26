package tictactoe.strategies.winningStratagies;

import tictactoe.models.Board;
import tictactoe.models.Move;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {
    Map<Integer, Map<Character, Integer>> row_map = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {

        char symbol = move.getPlayer().getSymbol();
        int row_number = move.getCell().getRow();
        if(!row_map.containsKey(row_number)){
            row_map.put(row_number, new HashMap<>());
        }

        Map<Character, Integer> cur_map = row_map.get(row_number);

        if(!cur_map.containsKey(symbol)){
            cur_map.put(symbol, 0);
        }

        cur_map.put(symbol, cur_map.get(symbol)+1);

        if(cur_map.get(symbol).equals(board.getBoard().size())){
            return true;
        }
        return false;
    }

    @Override
    public void undo(Board board, Move lastMove) {
        int row_number = lastMove.getCell().getRow();
        char symbol = lastMove.getPlayer().getSymbol();

        Map<Character, Integer> cur_map = row_map.get(row_number);

        cur_map.put(symbol, cur_map.get(symbol)-1);

        row_map.put(row_number, cur_map);
    }
}
