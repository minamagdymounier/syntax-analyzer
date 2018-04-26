package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Identifier implements RootNode{
    String identifier;

    public Identifier() {
        identifier = "ID";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if(tokens.size()>=1)
        {
            if(tokens.peek().getToken().equals(identifier))
            {
                System.out.print(tokens.poll().getValue()+" ");
                return true;
            }
        }
        return false;
    }
    
    
}
