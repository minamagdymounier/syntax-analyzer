package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ID_EXP implements RootNode{

    private String ASSIGNMENT;
    private Expression expression;
    private String SEMICOLON;
    private EOL eol;
    
    public ID_EXP() {
        ASSIGNMENT = "ASSIGNMENT";
        SEMICOLON = "SEMICOLON";
    }
   
    @Override
    public boolean print(Queue<Token> tokens) {
        expression = new Expression();
        eol = new EOL();
        if(tokens.size()>=3)
        {
            eol.print(tokens);
            if(tokens.peek().getToken().equals(ASSIGNMENT))
            {
                System.out.print(tokens.poll().getValue()+" ");
                eol.print(tokens);
                if(expression.print(tokens))
                {
                    eol.print(tokens);
                    if(tokens.peek().getToken().equals(SEMICOLON))
                    {
                        System.out.print(tokens.poll().getValue()+" ");
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
}
