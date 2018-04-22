package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class IF_STMT implements RootNode{

    private String IF;
    private String LEFT_ROUND_B;
    private Expression expression;
    private String RIGHT_ROUND_B;
    private Statement statement;
    private ELSE_PART else_part;

    public IF_STMT() {
        IF = "IF";
        LEFT_ROUND_B = "LEFT_ROUND_B";
        RIGHT_ROUND_B = "RIGHT_ROUND_B";
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        expression = new Expression();
        statement = new Statement();
        else_part = new ELSE_PART();
        if(tokens.size()>=5)
        {
            if(tokens.peek().getToken().equals(IF))
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
                                    else_part.print(tokens);
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
