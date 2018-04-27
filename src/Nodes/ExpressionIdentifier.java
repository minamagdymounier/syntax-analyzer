package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ExpressionIdentifier implements RootNode{
    private Identifier identifier;
    private EXP_DASH exp_dash;
    private EOL eol;
    
    public ExpressionIdentifier() {

    }
    
    

    @Override
    public boolean print(Queue<Token> tokens) {
        identifier = new Identifier();
        exp_dash = new EXP_DASH();
        eol = new EOL();
        if(tokens.size()>=2){
            eol.print(tokens);
            if(identifier.print(tokens))
            {
                eol.print(tokens);
                exp_dash.print(tokens);
                return true;
            }
        }
        return false;
    }
}
