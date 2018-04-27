package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ELSE_PART implements RootNode{

    private String type;
    private Statement statement;
    private EOL eol;
    public ELSE_PART() {
        type = "ELSE";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        statement = new Statement();
        eol = new EOL();
        if(tokens.size()>=2)
        {
            eol.print(tokens);
            if(tokens.peek().getToken().equals(type))
            {
                System.out.print(tokens.poll().getValue()+" ");
                eol.print(tokens);
                if(statement.print(tokens)){ return true;}
            }
        }
        return false;
    }
    
}
