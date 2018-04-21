package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class STRING_LITERAL implements RootNode{
    private String str_literal;

    public STRING_LITERAL() {
        str_literal = "STRING_LITERAL";
    } 
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if(!tokens.peek().getToken().equals(str_literal)){
            return false;
        }
        System.out.print(tokens.poll().getValue()+" ");
        return true;
    }
}
