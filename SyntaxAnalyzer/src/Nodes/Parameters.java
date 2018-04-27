package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Parameters implements RootNode{

    private Identifier identifier;
    private String LEFT_ROUND_B;
    private Expression expression;
    private String COMMA;
    private String RIGHT_ROUND_B;
    private EOL eol;
    
    public Parameters() {
        LEFT_ROUND_B = "LEFT_ROUND_B";
        COMMA = "COMMA";
        RIGHT_ROUND_B = "RIGHT_ROUND_B";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        identifier = new Identifier();
        expression = new Expression();
        eol = new EOL();
        if(tokens.size()>=3)
        {
            if(identifier.print(tokens))
            {
                eol.print(tokens);
                if(tokens.peek().getToken().equals(LEFT_ROUND_B))
                {
                    
                    System.out.print(tokens.poll().getValue()+" ");
                    if(expression.print(tokens))
                    {
                        eol.print(tokens);
                        while(tokens.peek().getToken().equals(COMMA))
                        {
                            System.out.print(tokens.poll().getValue()+" ");
                            eol.print(tokens);
                            if(!expression.print(tokens))
                            {return false;}
                        }
                        eol.print(tokens);
                        if(tokens.peek().getToken().equals(RIGHT_ROUND_B))
                        {
                            System.out.print(tokens.poll().getValue()+" ");
                            return true;
                        }
                    }
                    eol.print(tokens);
                    if(tokens.peek().getToken().equals(RIGHT_ROUND_B))
                        {
                            System.out.print(tokens.poll().getValue()+" ");
                            return true;
                        }
                    
                }
            }
        }
        return false;
    }
    
}
