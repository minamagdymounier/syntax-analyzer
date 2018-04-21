package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class TRUE implements RootNode{
    private String True;

    public TRUE() {
        True = "true";
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        if(!tokens.peek().getToken().equals(True))
            return false;
        System.out.print(tokens.poll().getValue()+" ");
        return true;
    }
    
}
