package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class DOT_DASH implements RootNode{

    private Length length ;
    private Parameters parameters;

    public DOT_DASH() {
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        length = new Length();
        parameters = new Parameters();
        if(tokens.size()>=1)
        {
            if(length.print(tokens)) return true;
            if (parameters.print(tokens)) return true;
        }
        return false;
    }
    
}
