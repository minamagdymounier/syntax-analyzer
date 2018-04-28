package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ConditionalOperations implements RootNode{
    private String[] op_tokens;
    private Expression expression;
    private EOL eol;
    
    public ConditionalOperations() {
        op_tokens = new String[]{"AND","OR","EQUAL","NOT_EQUAL","GREATERTHAN","LESSTHAN","LESS_EQ","GREATER_EQ","PLUS","MINUS","MULTIPLY","DIV","ASSIGNMENT"};
    }
   
    private boolean checkType(String type)
    {
        for(int i=0 ; i<this.op_tokens.length ; i++){
            if(type.equals(this.op_tokens[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        expression = new Expression();
        eol = new EOL();
        if(tokens.size()>=2){
            eol.print(tokens);
            if(checkType(tokens.peek().getToken()))
            {
                System.out.print(tokens.poll().getValue()+" "); 
                if(expression.print(tokens))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
