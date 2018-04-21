package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class DOT_DASH implements RootNode{

    private Length length;
    private Parameters parameters;

    public DOT_DASH() {
        length = new Length();
        parameters = new Parameters();
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        
        if(tokens.size()>=1)
        {
            if(!length.print(tokens)){
                if (parameters.print(tokens)) {
                    return true;
                }else
                {
                    System.out.println("Syntax Error");
                }
            }else
            {
                return true;
            }
        }
        System.out.println();
        System.out.println("Syntax Error");
        return false;
    }
    
}
