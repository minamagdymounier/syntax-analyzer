package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ELSE_PART implements RootNode{

    private String type;
    private InnerStatement statement;

    public ELSE_PART() {
        type = "ELSE";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if(tokens.size()>=2)
        {
            if(tokens.peek().getToken().equals(type))
            {
                System.err.print(tokens.poll().getValue());
                if(statement.print(tokens)) return true;
            }
        }
        return false;
    }
    
}
