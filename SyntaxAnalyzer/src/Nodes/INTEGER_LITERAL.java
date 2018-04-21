package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class INTEGER_LITERAL  implements RootNode{

    private String int_literal;

    public INTEGER_LITERAL() {
        int_literal = "INTEGRAL_LITERAL";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if(!tokens.peek().getToken().equals("INTEGRAL_LITERAL")){
            return false;
        }   
        System.out.print(tokens.poll().getValue()+" ");
        return true;
    }
    
}
