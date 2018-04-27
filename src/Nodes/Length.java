package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Length implements RootNode{

    private String type;
    private EOL eol;

    public Length() {
        type = "LENGTH";
    }
    
    
    @Override
    public boolean print(Queue<Token> tokens) {
        eol = new EOL();
        if(tokens.size()>=1)
        {
            eol.print(tokens);
            if(tokens.peek().getToken().equals(type)){
                System.out.print(tokens.poll().getValue()+" ");
                return true;
            }
        }
        return false;
    }
    
}
