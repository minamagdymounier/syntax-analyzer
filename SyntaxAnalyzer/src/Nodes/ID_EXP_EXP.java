package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ID_EXP_EXP implements RootNode{

    private String LEFT_SQUARE_B;
    private Expression expression;
    private String RIGHT_SQUARE_B;
    private String ASSIGNMENT;
    private String SEMICOLON;

    public ID_EXP_EXP() {
        LEFT_SQUARE_B = "LEFT_SQUARE_B";
        RIGHT_SQUARE_B = "RIGHT_SQUARE_B";
        ASSIGNMENT = "ASSIGNMENT";
        SEMICOLON = "SEMICOLON";
    }
    
 
    @Override
    public boolean print(Queue<Token> tokens) {
        expression = new Expression();
        if(tokens.size()>=6)
        {
            if(tokens.peek().getToken().equals(LEFT_SQUARE_B))
            {
                System.out.print(tokens.poll().getValue());
                if(expression.print(tokens))
                {
                 if(tokens.peek().getToken().equals(RIGHT_SQUARE_B))
                    {
                        System.out.print(tokens.poll().getValue());   
                        if(tokens.peek().getToken().equals(ASSIGNMENT))
                        {
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
                }
            }
        }
        return false;
    }
    
}
