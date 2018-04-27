package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class X implements RootNode{

    private ConditionalOperations conditionalOperations;
    private Squre_Brakets_Expression squre_Brakets_Expression;
    private DOT dot;

    public X() {
        
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        conditionalOperations = new ConditionalOperations();
        squre_Brakets_Expression = new Squre_Brakets_Expression();
        dot =  new DOT();
        if(tokens.size()>=1)
        {
            if(conditionalOperations.print(tokens)) return true;
            if(squre_Brakets_Expression.print(tokens)) return true;
            if(dot.print(tokens)) return true;
        }
        return false;
    }
    
}
