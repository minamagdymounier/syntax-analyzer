package Nodes;

import java.util.Queue;
import javafx.application.Platform;
import syntaxanalyzer.Token;

public class Type implements RootNode{

    DataType dataType ;
    Square_Brakets square_Brakets;
    
    public Type() {
        dataType = new DataType();
        square_Brakets = new Square_Brakets();
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if(!dataType.print(tokens)){
            System.out.println();
            System.out.println(" syntax Error ");
            System.exit(0);
            return false;
        }else{
            square_Brakets.print(tokens);
            return true;
        }
    }
}
