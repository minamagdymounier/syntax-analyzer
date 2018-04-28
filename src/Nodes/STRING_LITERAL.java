package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class STRING_LITERAL implements RootNode{
    private String str_literal;
    private EOL eol;
    
    public STRING_LITERAL() {
        str_literal = "STRING_LITERAL";
    } 
    
    @Override
    public boolean print(Queue<Token> tokens) {
        eol = new EOL();
        eol.print(tokens);
        if(tokens.size()>=1){            
            if(tokens.peek().getToken().equals(str_literal)){
                System.out.print(tokens.poll().getValue()+" ");
                eol.print(tokens);
                return true;
            }
        }
        return false;
    }
}
