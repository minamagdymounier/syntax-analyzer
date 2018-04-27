package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class FLOAT_LITERAL implements RootNode{
    
    private String float_literal;
    private EXP_DASH exp_dash;
    private EOL eol;
    
    public FLOAT_LITERAL() {
        float_literal = "FLOAT_LITERAL";
        exp_dash = new EXP_DASH();
    }
    
    
    @Override
    public boolean print(Queue<Token> tokens) {
        eol = new EOL();
        if(tokens.size()>=1){
            if(tokens.peek().getToken().equals(float_literal)){
                System.out.print(tokens.poll().getValue()+" ");
                eol.print(tokens);
                exp_dash.print(tokens); 
                return true;
            }   
        }
        return false;
    }
    
}
