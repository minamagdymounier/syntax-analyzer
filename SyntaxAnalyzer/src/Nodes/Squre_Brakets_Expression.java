package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Squre_Brakets_Expression implements RootNode{

    String LEFT_SQURE_B;
    Expression expression;
    String RIGHT_SQURE_B;

    public Squre_Brakets_Expression() {
        LEFT_SQURE_B = "[";
        expression = new Expression();
        RIGHT_SQURE_B = "]";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if(tokens.size()>=3)
        {
            if(tokens.peek().getToken().equals(LEFT_SQURE_B))
            {
                System.out.print(tokens.poll().getValue());
                if(expression.print(tokens))
                    if(tokens.peek().getToken().equals(RIGHT_SQURE_B))  
                        System.out.print(tokens.poll().getValue());
                        return true;
            }
        }
        return false;
    }
}
