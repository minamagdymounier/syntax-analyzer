package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class DOT implements RootNode{
    private String type;
    private DOT_DASH dot_dash;
    private EOL eol;
    
    public DOT() {
        type = "DOT";
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        dot_dash = new DOT_DASH();
        eol = new EOL();
        if(tokens.size() >= 2)
        {
            eol.print(tokens);
            if(tokens.peek().getToken().equals(type))
            {
                System.out.print(tokens.poll().getValue()+" ");
                eol.print(tokens);
                if(dot_dash.print(tokens)) return true;
            }
        }
        
        return false;
    }
    
    
    
}
