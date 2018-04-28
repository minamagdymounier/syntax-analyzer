package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Squre_Brakets_Expression implements RootNode{

    String LEFT_SQURE_B;
    Expression expression;
    String RIGHT_SQURE_B;
    private EOL eol;
    EXP_DASH exp_dash;
    
    public Squre_Brakets_Expression() {
        LEFT_SQURE_B = "LEFT_SQUARE_B";
        RIGHT_SQURE_B = "RIGHT_SQUARE_B";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        eol = new EOL();
        exp_dash = new EXP_DASH();
        if(tokens.size()>=3)
        {
            eol.print(tokens);
            if(tokens.peek().getToken().equals(LEFT_SQURE_B))
            {
                System.out.print(" "+tokens.poll().getValue());
                expression = new Expression();
                if(expression.print(tokens)){
                    eol.print(tokens);
                    if(tokens.peek().getToken().equals(RIGHT_SQURE_B)){  
                        System.out.print(tokens.poll().getValue()+" ");
                        eol.print(tokens);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
