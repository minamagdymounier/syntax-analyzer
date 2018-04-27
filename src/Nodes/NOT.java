package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class NOT implements RootNode{
    private String type;
    private Expression expression;
    private EXP_DASH exp_dash;
    private EOL eol;
    
    public NOT() {
        type = "NOT";
        expression = new Expression();
        exp_dash = new EXP_DASH();
    }
    
    

    @Override
    public boolean print(Queue<Token> tokens) {
        eol = new EOL();
        if(tokens.size()>=2){
            if(tokens.peek().getToken().equals(type))
            {
                System.out.print(tokens.poll().getValue()+" ");
                eol.print(tokens);
                if(expression.print(tokens))
                eol.print(tokens);
                exp_dash.print(tokens); 
                return true;
            }
        }
        return false;
    }
}

