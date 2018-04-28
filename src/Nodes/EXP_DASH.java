package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class EXP_DASH implements RootNode{
    
    private X x;
    private EXP_DASH exp_dash;
    private EOL eol;
    
    public EXP_DASH() {
        
    } 

    @Override
    public boolean print(Queue<Token> tokens) {
        x = new X(); 
        eol = new EOL();
        exp_dash = new EXP_DASH();
        
        if(tokens.size()>=1)
        {
            eol.print(tokens);
            if(x.print(tokens))
            {
                eol.print(tokens);
                print(tokens);
                return true;
            }
        }
        return false;
    }
    
}
