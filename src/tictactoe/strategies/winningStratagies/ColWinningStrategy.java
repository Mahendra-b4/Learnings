package tictactoe.strategies.winningStratagies;

import tictactoe.models.Board;
import tictactoe.models.Move;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy {
    Map<Integer, Map<Character, Integer>> col_map = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        char symbol = move.getPlayer().getSymbol();
        int col_number = move.getCell().getCol();
        if(!col_map.containsKey(col_number)){
            col_map.put(col_number, new HashMap<>());
        }
        Map<Character, Integer> cur_map = col_map.get(col_number);
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
        int col_number = lastMove.getCell().getCol();
        char symbol = lastMove.getPlayer().getSymbol();

        Map<Character, Integer> cur_map = col_map.get(col_number);

        cur_map.put(symbol, cur_map.get(symbol)-1);

        col_map.put(col_number, cur_map);
    }
}
