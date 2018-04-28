package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class INTEGER_LITERAL  implements RootNode{

    private String int_literal;
    private EXP_DASH exp_dash;
    private EOL eol;
    
    public INTEGER_LITERAL() {
        int_literal = "INTEGRAL_LITERAL";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        exp_dash = new EXP_DASH();
        eol = new EOL();
        if(tokens.size()>=1){
            eol.print(tokens);
            if(tokens.peek().getToken().equals(int_literal)){
                System.out.print(tokens.poll().getValue()+" ");
                exp_dash.print(tokens); 
                return true;
            }   
        }
        return false;
    }
    
}
