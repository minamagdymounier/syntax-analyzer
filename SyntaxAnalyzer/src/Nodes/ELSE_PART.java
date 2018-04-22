package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ELSE_PART implements RootNode{

    private String type;
    private Statement statement;

    public ELSE_PART() {
        type = "ELSE";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        statement = new Statement();
        if(tokens.size()>=2)
        {
            if(tokens.peek().getToken().equals(type))
            {
                System.out.print(tokens.poll().getValue());
                if(statement.print(tokens)){ return true;}
            }
        }
        return false;
    }
    
}
