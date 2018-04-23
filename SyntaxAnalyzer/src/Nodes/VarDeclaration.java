package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class VarDeclaration implements RootNode{
    private Type type;
    private Identifier identifier;
    private String SEMICOLON;

    public VarDeclaration() {
        SEMICOLON = "SEMICOLON";
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        type = new Type();
        identifier = new Identifier();
        if(tokens.size()>=3)
        {
            if(type.print(tokens))
            {
                if(identifier.print(tokens))
                {
                    if(tokens.peek().getToken().equals(SEMICOLON))
                    {
                        System.out.println(tokens.poll().getValue());
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    
}
