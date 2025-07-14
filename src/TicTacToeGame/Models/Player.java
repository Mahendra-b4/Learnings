package TicTacToeGame.Models;

public class Player {
    final String name;
    final Symbol symbol;

    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    String getName(){
        return name;
    }
    Symbol getSymbol(){
        return symbol;
    }
}
