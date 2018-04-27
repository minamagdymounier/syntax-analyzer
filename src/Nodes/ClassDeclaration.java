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
    private EOL eol;
    
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
        eol = new EOL();
        if(tokens.size()>=4)
        {
            eol.print(tokens);
            if(tokens.peek().getToken().equals(CLASS))
            {
                System.out.print(tokens.poll().getValue()+" ");
                eol.print(tokens);
                if(identifier.print(tokens))
                {
                    eol.print(tokens);
                    if(tokens.peek().getToken().equals(EXTENDS))
                    {
                        System.out.print(tokens.poll().getValue()+" ");
                        identifier.print(tokens);
                    }
                    eol.print(tokens);
                    if(tokens.peek().getToken().equals(LEFT_CURLY_B))
                    {
                        System.out.print(tokens.poll().getValue()+" ");
                        while(varDeclaration.print(tokens));
                        while(constructorDeclaration.print(tokens));
                        while(methodDeclaration.print(tokens));
                        
                        eol.print(tokens);
                        if(tokens.peek().getToken().equals(RIGHT_CURLY_B))
                        {
                            System.out.print(tokens.poll().getValue()+" ");
                            eol.print(tokens);
                            return true;
                        }
                        else       System.out.println("Syntax Error");
                    }
                }
            }
        }
        return false;
    }
    
}
