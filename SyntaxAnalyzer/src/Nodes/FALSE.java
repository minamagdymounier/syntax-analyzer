package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class FALSE implements RootNode{
    private String False;
    private EXP_DASH exp_dash;

    public FALSE() {
        False = "FALSE";
        exp_dash = new EXP_DASH();
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        if(tokens.size()>=2){
            if(tokens.peek().getToken().equals(False)){
                System.out.print(tokens.poll().getValue()+" ");
                exp_dash.print(tokens); 
                return true;
            }   
        }
        return false;
    }
}
