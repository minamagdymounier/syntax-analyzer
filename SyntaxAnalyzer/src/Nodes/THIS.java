package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class THIS implements RootNode{
    private String type;
    private EXP_DASH exp_dash;

    public THIS() {
        type = "THIS";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
         if(tokens.size()>=1){
            if(tokens.peek().getToken().equals(type)){
                System.out.print(tokens.poll().getValue()+" ");
                exp_dash = new EXP_DASH();
                exp_dash.print(tokens);
                return true;
            }   
        }
        return false;
    }
}
