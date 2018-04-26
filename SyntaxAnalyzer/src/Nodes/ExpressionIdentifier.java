package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ExpressionIdentifier implements RootNode{
    private Identifier identifier;
    private EXP_DASH exp_dash;

    public ExpressionIdentifier() {

    }
    
    

    @Override
    public boolean print(Queue<Token> tokens) {
        identifier = new Identifier();
        exp_dash = new EXP_DASH();
        if(tokens.size()>=2){
            if(identifier.print(tokens))
            {
                exp_dash.print(tokens);
                return true;
            }
        }
        return false;
    }
}
