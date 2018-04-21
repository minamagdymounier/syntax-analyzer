package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class NEW implements RootNode{
    private String type;

    public NEW() {
        type = "NEW";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if(!tokens.peek().getToken().equals(type))
            return false;
        System.out.print(tokens.poll().getValue()+" ");
        return true;
    }
}
