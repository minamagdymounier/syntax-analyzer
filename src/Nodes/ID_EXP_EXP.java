package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ID_EXP_EXP implements RootNode{

    private String LEFT_SQUARE_B;
    private Expression expression;
    private String RIGHT_SQUARE_B;
    private String ASSIGNMENT;
    private String SEMICOLON;
    private EOL eol;
    
    public ID_EXP_EXP() {
        LEFT_SQUARE_B = "LEFT_SQUARE_B";
        RIGHT_SQUARE_B = "RIGHT_SQUARE_B";
        ASSIGNMENT = "ASSIGNMENT";
        SEMICOLON = "SEMICOLON";
    }
    
 
    @Override
    public boolean print(Queue<Token> tokens) {
        expression = new Expression();
        eol = new EOL();
        if(tokens.size()>=5)
        {
            eol.print(tokens);
            if(tokens.peek().getToken().equals(LEFT_SQUARE_B))
            {
                System.out.print(tokens.poll().getValue()+" ");
                eol.print(tokens);
                if(expression.print(tokens))
                {
                 eol.print(tokens);
                    if(tokens.peek().getToken().equals(RIGHT_SQUARE_B))
                    {
                        System.out.print(tokens.poll().getValue()+" ");   
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
                }
            }
        }
        return false;
    }
    
}
