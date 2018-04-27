package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Identifier_ID implements RootNode{

    private Identifier identifier;
    private STMT_ID id;

    public Identifier_ID() {
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        identifier = new Identifier();
        id = new STMT_ID();
        if(tokens.size()>=2)
        {
            if(identifier.print(tokens))
            {
                if (id.print(tokens)) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
