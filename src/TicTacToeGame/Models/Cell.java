package TicTacToeGame.Models;

public class Cell {
    Symbol symbol;

    Cell(){
    };

    public Symbol getSymbol(){
        return symbol;
    }
    void setSymbol(Symbol symbol){
        this.symbol = symbol;
    }
    boolean isEmpty(){
        return symbol == Symbol.EMPTY;
    }

    public void display() {
        if(isEmpty()){
            System.out.print("| - |");
        }
        else{
            System.out.print("| "+getSymbol()+" |");
        }
    }
}
