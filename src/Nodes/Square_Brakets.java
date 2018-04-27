package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Square_Brakets implements RootNode{
    private String LEFT_SQUARE_B;
    private String RIGHT_SQUARE_B;
    private EOL eol;
    
    public Square_Brakets() {
        this.LEFT_SQUARE_B = "LEFT_SQUARE_B";
        this.RIGHT_SQUARE_B = "RIGHT_SQUARE_B";   
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        eol = new EOL();
        if(tokens.size()>=2){
        eol.print(tokens);
        if(tokens.peek().getToken().equals(LEFT_SQUARE_B)){
            System.out.print(tokens.poll().getValue()+" ");
            eol.print(tokens);
            if(tokens.peek().getToken().equals(RIGHT_SQUARE_B)){
                System.out.print(tokens.poll().getValue()+" ");
                return true;
            }
            System.out.println();
            System.out.println("syntax error");
            return false;
        }
        return false;
    }
        System.out.println();
        System.out.println("syntax error");
        return false;
    }
}
