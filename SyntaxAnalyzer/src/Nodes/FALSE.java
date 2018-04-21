package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class FALSE implements RootNode{
    private String False;
    private EXP_DASH exp_dash;

    public FALSE() {
        False = "FALSE";
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        exp_dash = new EXP_DASH();
        if(tokens.size()>=1){
            if(tokens.peek().getToken().equals(False)){
                System.out.print(tokens.poll().getValue()+" ");
                exp_dash.print(tokens); 
                return true;
            }   
        }
        return false;
    }
}
