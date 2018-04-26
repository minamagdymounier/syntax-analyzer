package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class MethodDeclaration implements RootNode{

    private String[] types;
    private String LEFT_CURLY_B;
    private String RIGHT_CURLY_B;
    private String LEFT_ROUND_B;
    private String RIGHT_ROUND_B;
    private String COMMA;
    private String SEMICOLON;
    private String RETURN;
    private Type type;
    private Identifier identifier;
    private VarDeclaration varDeclaration;
    private Statement statement;
    private Expression expression;

    public MethodDeclaration() {
        types = new String[]{"PUBLIC","PRIVATE","PROTECTED"};
        LEFT_CURLY_B = "LEFT_CURLY_B";
        RIGHT_CURLY_B = "RIGHT_CURLY_B";
        LEFT_ROUND_B = "LEFT_ROUND_B";
        RIGHT_ROUND_B = "RIGHT_ROUND_B";
        SEMICOLON = "SEMICOLON";
        RETURN = "RETURN";
        COMMA = "COMMA";
    }
    
    private boolean checkType(String type)
    {
        for(int i=0 ; i<this.types.length ; i++){
            if(type.equals(this.types[i])){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        type = new Type();
        identifier = new Identifier();
        varDeclaration = new VarDeclaration();
        statement = new Statement();
        expression = new Expression();
        if(tokens.size()>=10)
        {
            if(checkType(tokens.peek().getToken()))
            {
                System.out.print(tokens.poll().getValue()+" ");
                if(type.print(tokens)){
                    if(identifier.print(tokens)){
                        if(tokens.peek().getToken().equals(LEFT_ROUND_B))
                        {
                            System.out.print(tokens.poll().getValue()+" ");
                            if(type.print(tokens)){
                                if(identifier.print(tokens)){
                                    while(tokens.peek().getToken().equals(COMMA))
                                    {
                                        System.out.print(tokens.poll().getValue()+" ");
                                        if(type.print(tokens))
                                            identifier.print(tokens);
                                    }
                                }
                            }
                            if(tokens.peek().getToken().equals(RIGHT_ROUND_B))
                            {
                                System.out.print(tokens.poll().getValue()+" ");
                                if(tokens.peek().getToken().equals(LEFT_CURLY_B))
                                {
                                    System.out.print(tokens.poll().getValue()+" ");
                                    while(varDeclaration.print(tokens));
                                    while(statement.print(tokens));
                                    if(tokens.peek().getToken().equals(RETURN))
                                    {
                                        System.out.print(tokens.poll().getValue()+" ");
                                        if(expression.print(tokens))
                                        {
                                            if(tokens.peek().getToken().equals(SEMICOLON))
                                            {
                                                System.out.print(tokens.poll().getValue()+" ");
                                                if(tokens.peek().getToken().equals(RIGHT_CURLY_B))
                                                    System.out.print(tokens.poll().getValue()+" ");
                                                    return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }
        return false;
    }
    
}
