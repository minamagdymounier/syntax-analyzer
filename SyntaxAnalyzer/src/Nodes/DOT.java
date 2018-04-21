package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class DOT implements RootNode{
    private String type;
    private DOT_DASH dot_dash;

    public DOT() {
        type = "DOT";
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        dot_dash = new DOT_DASH();
        if(tokens.size() >= 2)
        {
            if(tokens.peek().getToken().equals(type))
            {
                System.out.print(tokens.poll().getValue());
                if(dot_dash.print(tokens)) return true;
            }
        }
        
        return false;
    }
    
    
    
}
