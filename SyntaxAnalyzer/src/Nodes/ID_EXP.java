package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ID_EXP implements RootNode{

    private String ASSIGNMENT;
    private Expression expression;
    private String SEMICOLON;

    public ID_EXP() {
        ASSIGNMENT = "ASSIGNMENT";
        SEMICOLON = "SEMICOLON";
    }
   
    @Override
    public boolean print(Queue<Token> tokens) {
        expression = new Expression();
        if(tokens.size()>=3)
        {
            if(tokens.peek().getToken().equals(ASSIGNMENT))
            {
                System.out.print(tokens.poll().getValue());
                if(expression.print(tokens))
                {
                    if(tokens.peek().getToken().equals(SEMICOLON))
                    {
                        System.out.print(tokens.poll().getValue());
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
}
