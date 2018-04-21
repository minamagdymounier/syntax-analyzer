package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ParameterizedExpression implements RootNode{

    String LEFT_ROUND_B;
    Expression expression;
    String RIGHT_ROUND_B;

    public ParameterizedExpression() {
        LEFT_ROUND_B = "(";
        expression = new Expression();
        RIGHT_ROUND_B = ")";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if(tokens.size()>=3)
        {
            if(tokens.peek().getToken().equals(LEFT_ROUND_B))
            {
                System.out.print(tokens.poll().getValue());   
                if(expression.print(tokens))
                    if(tokens.peek().getToken().equals(RIGHT_ROUND_B))  
                        System.out.print(tokens.poll().getValue());
                        return true;
            }
        }
        return false;
    }
}
