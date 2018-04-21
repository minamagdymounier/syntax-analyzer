package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class FLOAT_LITERAL implements RootNode{
    
    private String float_literal;

    public FLOAT_LITERAL() {
        float_literal = "FLOAT_LITERAL";
    }
    
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if(!tokens.peek().getToken().equals("FLOAT_LITERAL"))
            return false;
        System.out.print(tokens.poll().getValue()+" ");
        return true;
    }
    
}
