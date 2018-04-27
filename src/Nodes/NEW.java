package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class NEW implements RootNode{
    private String type;
    private NEW_DASH new_dash;
    private EXP_DASH exp_dash;
    private EOL eol;
    
    public NEW() {
        type = "NEW";
        new_dash = new NEW_DASH();
        exp_dash = new EXP_DASH();
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        eol = new EOL(); 
        if(tokens.size()>=2){
            if(tokens.peek().getToken().equals(type)){
                System.out.print(tokens.poll().getValue()+" ");
                eol.print(tokens);
                if(new_dash.print(tokens)){
                    eol.print(tokens);
                    exp_dash.print(tokens);
                    return true;
                }
            }   
        }
        return false;
    }
}
