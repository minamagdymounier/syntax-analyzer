package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class FALSE implements RootNode{
    private String False;

    public FALSE() {
        False = "FALSE";
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        if(!tokens.peek().getToken().equals(False))
            return false;
        System.out.print(tokens.poll().getValue()+" ");
        return true;
    }
}
