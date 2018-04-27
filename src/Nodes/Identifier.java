package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Identifier implements RootNode{
    String identifier;
    private EOL eol;
    
    public Identifier() {
        identifier = "ID";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        eol = new EOL();
        if(tokens.size()>=1)
        {
            eol.print(tokens);
            if(tokens.peek().getToken().equals(identifier))
            {
                System.out.print(tokens.poll().getValue()+" ");
                return true;
            }
        }
        return false;
    }
    
    
}
