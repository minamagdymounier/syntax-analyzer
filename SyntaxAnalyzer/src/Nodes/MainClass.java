package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class MainClass implements RootNode{

    private String CLASS;
    private String PUBLIC;
    private String STATIC;
    private String VOID;
    private String MAIN;
    private String STRING;
    private String LEFT_CURLY_B;
    private String LEFT_ROUND_B;
    private String LEFT_SQUARE_B;
    private String RIGHT_CURLY_B;
    private String RIGHT_ROUND_B;
    private String RIGHT_SQUARE_B;
    private Identifier identifier;
    private Statement statement;
    
    public MainClass() {
        CLASS = "CLASS";
        PUBLIC = "PUBLIC";
        STATIC = "STATIC";
        VOID = "VOID";
        MAIN = "MAIN";
        STRING = "STRING";
        LEFT_CURLY_B = "LEFT_CURLY_B";
        LEFT_ROUND_B = "LEFT_ROUND_B";
        LEFT_SQUARE_B= "LEFT_SQUARE_B";
        RIGHT_CURLY_B = "RIGHT_CURLY_B";
        RIGHT_ROUND_B = "RIGHT_ROUND_B";
        RIGHT_SQUARE_B= "RIGHT_SQUARE_B";        
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        identifier = new Identifier();
        statement = new Statement();
        if(tokens.size()>=17)
        {
            if(tokens.peek().getToken().equals(CLASS))
            {
                System.out.print(tokens.poll().getValue());
                if(identifier.print(tokens))
                {
                    if(tokens.peek().getToken().equals(LEFT_CURLY_B))
                         System.out.print(tokens.poll().getValue());
                         if(tokens.peek().getToken().equals(PUBLIC))
                            System.out.print(tokens.poll().getValue());
                                if(tokens.peek().getToken().equals(STATIC))
                                    System.out.print(tokens.poll().getValue());
                                        if(tokens.peek().getToken().equals(VOID))
                                            System.out.print(tokens.poll().getValue());
                                                if(tokens.peek().getToken().equals(MAIN))
                                                    System.out.print(tokens.poll().getValue());
                                                        if(tokens.peek().getToken().equals(LEFT_ROUND_B))
                                                             System.out.print(tokens.poll().getValue());
                                                                if(tokens.peek().getToken().equals(STRING))
                                                                       System.out.print(tokens.poll().getValue());
                                                                            if(tokens.peek().getToken().equals(LEFT_SQUARE_B))
                                                                                   System.out.print(tokens.poll().getValue());
                                                                                        if(tokens.peek().getToken().equals(RIGHT_SQUARE_B))
                                                                                            System.out.print(tokens.poll().getValue());
                                                                                            if(identifier.print(tokens))
                                                                                                if(tokens.peek().getToken().equals(RIGHT_ROUND_B))
                                                                                                        System.out.print(tokens.poll().getValue());
                                                                                                            if(tokens.peek().getToken().equals(LEFT_CURLY_B))
                                                                                                                System.out.print(tokens.poll().getValue());
                                                                                                                if(statement.print(tokens))
                                                                                                                    if(tokens.peek().getToken().equals(RIGHT_CURLY_B))
                                                                                                                        System.out.print(tokens.poll().getValue());
                                                                                                                            if(tokens.peek().getToken().equals(LEFT_CURLY_B))
                                                                                                                                System.out.print(tokens.poll().getValue());
                                                                                                                                return true;

                        
                }
            }
                
        }
        return false;
    }
    
}
