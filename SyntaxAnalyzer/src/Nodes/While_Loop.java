package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class While_Loop implements RootNode{

    private String While;
    private String LEFT_ROUND_B;
    private Expression expression;
    private String RIGHT_ROUND_B;
    private Statement statement;
    private EOL eol;
    
    public While_Loop() {
        While = "WHILE";
        LEFT_ROUND_B = "LEFT_ROUND_B";
        RIGHT_ROUND_B = "RIGHT_ROUND_B";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        expression = new Expression();
        statement = new Statement();
        eol = new EOL();
        if(tokens.size() >= 5)
        {
            eol.print(tokens);
            if(tokens.peek().getToken().equals(While))
            {
                System.out.print(tokens.poll().getValue()+" ");
                eol.print(tokens);
                if(tokens.peek().getToken().equals(LEFT_ROUND_B))
                {
                   System.out.print(tokens.poll().getValue()+" ");
                   if(expression.print(tokens))
                   {
                       eol.print(tokens);
                       if(tokens.peek().getToken().equals(RIGHT_ROUND_B))
                        {
                            System.out.print(tokens.poll().getValue()+" ");
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
