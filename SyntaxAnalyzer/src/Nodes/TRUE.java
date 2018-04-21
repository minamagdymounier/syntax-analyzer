package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class TRUE implements RootNode{
    private String True;
    private EXP_DASH exp_dash;

    public TRUE() {
        True = "true";
        exp_dash = new EXP_DASH();
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        if(tokens.size()>=2){
            if(tokens.peek().getToken().equals(True)){
                System.out.print(tokens.poll().getValue()+" ");
                exp_dash.print(tokens); 
                return true;
            }   
        }
        return false;
    }
    
}
