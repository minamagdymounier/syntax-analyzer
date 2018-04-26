package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ConstructorDeclaration implements RootNode{

    private Identifier identifier;
    private String LEFT_ROUND_B;
    private String RIGHT_ROUND_B;
    private String COMMA;
    private String LEFT_CURLY_B;
    private String RIGHT_CURLY_B;
    private Type type;
    private VarDeclaration varDeclaration;
    private Statement statement;

    public ConstructorDeclaration() {
        LEFT_ROUND_B = "LEFT_ROUND_B";
        RIGHT_ROUND_B = "RIGHT_ROUND_B";
        COMMA = "COMMA";
        LEFT_CURLY_B = "LEFT_CURLY_B";
        RIGHT_CURLY_B = "RIGHT_CURLY_B";
    }
    
    
    @Override
    public boolean print(Queue<Token> tokens) {
        type = new Type();
        varDeclaration = new VarDeclaration();
        statement = new Statement();
        identifier = new Identifier();
        if(tokens.size()>=5)
        {
            if(identifier.print(tokens))
                if(tokens.peek().getToken().equals(LEFT_ROUND_B))
                {
                    System.out.print(tokens.poll().getValue());
                    if(type.print(tokens))
                        if(identifier.print(tokens))
                            while(tokens.peek().getToken().equals(COMMA))
                            {
                                if(type.print(tokens))
                                    identifier.print(tokens);
                            }
                    if(tokens.peek().getToken().equals(RIGHT_ROUND_B))
                    {
                        System.out.print(tokens.poll().getValue());
                        if(tokens.peek().getToken().equals(LEFT_CURLY_B))
                        {
                            System.out.print(tokens.poll().getValue());
                            while(varDeclaration.print(tokens));
                            while(statement.print(tokens));
                            if(tokens.peek().getToken().equals(RIGHT_CURLY_B))
                                System.out.print(tokens.poll().getValue());
                                return true;
                        }
                    }
                }
        }
        return false;
    }
    
}
