package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class EXP_DASH implements RootNode{
    
    private X x;
    private EXP_DASH exp_dash;

    public EXP_DASH() {
        
    } 

    @Override
    public boolean print(Queue<Token> tokens) {
        x = new X(); 
        exp_dash = new EXP_DASH();
        if(tokens.size()>=1)
        {
            if(x.print(tokens))
            {
                if(exp_dash.print(tokens))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
}
