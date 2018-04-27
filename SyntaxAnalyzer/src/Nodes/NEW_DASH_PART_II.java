package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class NEW_DASH_PART_II implements RootNode{

    private String types[];
    private String LEFT_SQUARE_B;
    private String RIGHT_SQUARE_B;
    private Expression expression;
    private EOL eol;
    
    public NEW_DASH_PART_II() {
        types = new String[]{"INT" , "FLOAT" , "CHAR" , "BOOLEAN" , "STRING"};
        LEFT_SQUARE_B = "LEFT_SQUARE_B";
        RIGHT_SQUARE_B = "RIGHT_SQUARE_B";
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
        expression = new Expression();
        eol = new EOL();
        if(tokens.size()>=4)
        {
            eol.print(tokens);
            if(checkType(tokens.peek().getToken()))
            {
                System.out.print(tokens.poll().getValue()+" ");
                eol.print(tokens);
                if(tokens.peek().getToken().equals(LEFT_SQUARE_B))
                {
                    System.out.print(tokens.poll().getValue()+" ");
                    if(expression.print(tokens))
                    {
                        eol.print(tokens);
                        if(tokens.peek().getToken().equals(RIGHT_SQUARE_B)){
                            System.out.print(tokens.poll().getValue()+" ");
                            return true;}
                    }
                }
            }
        }
        return false;
    }
    
}
