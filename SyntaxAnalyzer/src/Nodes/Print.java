package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Print implements RootNode{

    private String SYSTEM_OUT_PRINTLN;
    private String LEFT_ROUND_B;
    private Expression expression;
    private String RIGHT_ROUND_B;
    private String SEMICOLON;

    public Print() {
        SEMICOLON = "SEMICOLON";
        RIGHT_ROUND_B = "RIGHT_ROUND_B";
        LEFT_ROUND_B = "LEFT_ROUND_B";
        SYSTEM_OUT_PRINTLN = "SYSTEM.OUT.PRINTLN";
    }
    
    
    
    
    @Override
    public boolean print(Queue<Token> tokens) {
        expression = new Expression();
        if(tokens.size()>=5)
        {
            if(tokens.peek().getToken().equals(SYSTEM_OUT_PRINTLN))
            {
                System.out.print(tokens.poll().getValue());
                if(tokens.peek().getToken().equals(LEFT_ROUND_B))
                    {
                        System.out.print(tokens.poll().getValue());
                        if(expression.print(tokens))
                        {
                            if(tokens.peek().getToken().equals(RIGHT_ROUND_B))
                                {
                                    System.out.print(tokens.poll().getValue());
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
        return false;
    }
    
}
