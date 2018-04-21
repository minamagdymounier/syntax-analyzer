package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class ConditionalOperations implements RootNode{
    private String[] ops ;
    private String[] op_tokens;

    public ConditionalOperations() {
        op_tokens = new String[]{"AND","OR","NOT_EQUAL","GREATERTHAN","LESSTHAN","LESS_EQ","GREATER_EQ","PLUS","MINUS","MULTIPLY","DIV"};
//        ops = new String[]{"&&" , "||" , "==" , "!=" , ">" , "<" ,"<=" , ">=", "+" , "-" , "*" , "/"};
    }
    
    private boolean checkType(String type)
    {
        for(int i=0 ; i<this.op_tokens.length ; i++){
            if(type.equals(this.op_tokens[i])){
//                System.out.print(ops[i]+" ");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        if(tokens.size()>=1){
        if(checkType(tokens.peek().getToken()))
        {
            System.out.print(tokens.poll().getValue());
            return true;
        }
        return false;
    }
        return false;
    }
}
