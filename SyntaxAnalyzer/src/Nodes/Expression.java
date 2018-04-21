package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Expression implements RootNode{

    INTEGER_LITERAL integer_literal;
    FLOAT_LITERAL float_literal;
    TRUE True ;
    FALSE False ;
    THIS This;
    NEW New;
    NOT not;
    
    
    public Expression() {
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        
        return false;
    }
    
    
}
