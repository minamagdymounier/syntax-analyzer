package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ClassDeclaration implements RootNode{

    private String CLASS ;
    private String EXTENDS;
    private String LEFT_CURLY_B;
    private String RIGHT_CURLY_B;
    private Identifier identifier;
    private VarDeclaration varDeclaration;
    private ConstructorDeclaration constructorDeclaration;
    private MethodDeclaration methodDeclaration;
    
    public ClassDeclaration() {
        CLASS = "CLASS";
        EXTENDS = "EXTENDS";
        LEFT_CURLY_B = "LEFT_CURLY_B";
        RIGHT_CURLY_B = "RIGHT_CURLY_B";
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        identifier = new Identifier();
        varDeclaration = new VarDeclaration();
        constructorDeclaration = new ConstructorDeclaration();
        methodDeclaration = new MethodDeclaration();
        if(tokens.size()>=4)
        {
            if(tokens.peek().getToken().equals(CLASS))
            {
                System.out.print(tokens.poll().getValue());
                if(identifier.print(tokens))
                {
                    if(tokens.peek().getToken().equals(EXTENDS))
                    {
                        System.out.print(tokens.poll().getValue());
                        identifier.print(tokens);
                    }
                    
                    if(tokens.peek().getToken().equals(LEFT_CURLY_B))
                    {
                        System.out.print(tokens.poll().getValue());
                        while(varDeclaration.print(tokens));
                        while(constructorDeclaration.print(tokens));
                        while(methodDeclaration.print(tokens));
                        if(tokens.peek().getToken().equals(RIGHT_CURLY_B))
                        {
                            System.out.print(tokens.poll().getValue());
                            return true;
                        }
                    }
                }
            }
        }
        System.out.println("Syntax Error");
        System.exit(0);
        return false;
    }
    
}
