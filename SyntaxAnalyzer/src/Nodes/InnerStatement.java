package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class InnerStatement implements RootNode{
    
    private String LEFT_CURLY_B;
    private Statement statement;
    private String RIGHT_CURLY_B;

    public InnerStatement() {
        LEFT_CURLY_B = "LEFT_CURLY_B";
        RIGHT_CURLY_B = "RIGHT_CURLY_B";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if(statement == null){
            statement = new Statement();
        }
        if(tokens.size()>=2)
        {
            if(tokens.peek().getToken().equals(LEFT_CURLY_B))
            {
                System.out.print(tokens.poll().getValue()+" ");
                statement.print(tokens);
                if(tokens.peek().getToken().equals(RIGHT_CURLY_B))
                {
                    System.out.print(tokens.poll().getValue()+" ");
                    return true;
                }
            }
        }
        return false;
    }
    
}
