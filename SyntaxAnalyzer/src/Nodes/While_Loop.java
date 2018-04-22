package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class While_Loop implements RootNode{

    private String While;
    private String LEFT_ROUND_B;
    private Expression expression;
    private String RIGHT_ROUND_B;
    private Statement statement;

    public While_Loop() {
        While = "WHILE";
        LEFT_ROUND_B = "LEFT_ROUND_B";
        RIGHT_ROUND_B = "RIGHT_ROUND_B";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        expression = new Expression();
        statement = new Statement();
        if(tokens.size() >= 5)
        {
            if(tokens.peek().getToken().equals(While))
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
                            if(statement.print(tokens))
                            {
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
