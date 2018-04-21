package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ParameterizedExpression implements RootNode{

    private String LEFT_ROUND_B;
    private Expression expression;
    private String RIGHT_ROUND_B;
    private EXP_DASH exp_dash;

    public ParameterizedExpression() {
        LEFT_ROUND_B = "LEFT_ROUND_B";
        RIGHT_ROUND_B = "RIGHT_ROUND_B";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        expression = new Expression();
        exp_dash = new EXP_DASH();
        if(tokens.size()>=3)
        {
            if(tokens.peek().getToken().equals(LEFT_ROUND_B))
            {
                System.out.print(tokens.poll().getValue());   
                if(expression.print(tokens)){
                    if(tokens.peek().getToken().equals(RIGHT_ROUND_B)) { 
                        System.out.print(tokens.poll().getValue());
                        exp_dash.print(tokens);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
