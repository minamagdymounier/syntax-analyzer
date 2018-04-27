package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class DOT_DASH implements RootNode{

    private Length length ;
    private Parameters parameters;
    private EOL eol;
    
    public DOT_DASH() {
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        length = new Length();
        parameters = new Parameters();
        eol = new EOL();
        if(tokens.size()>=1)
        {
            eol.print(tokens);
            if(length.print(tokens)) return true;
            eol.print(tokens);
            if (parameters.print(tokens)) return true;
        }
        return false;
    }
    
}
