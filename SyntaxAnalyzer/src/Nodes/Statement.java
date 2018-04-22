package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Statement implements RootNode{

    private InnerStatement innerStatement;
    private IF_STMT if_stmt;
    private While_Loop while_Loop;
    private Print print;
    private Identifier_ID identifier_ID;

    public Statement() {
    }
    
  
    @Override
    public boolean print(Queue<Token> tokens) {
        innerStatement = new InnerStatement();
        if_stmt = new IF_STMT();
        while_Loop = new While_Loop();
        print = new Print();
        identifier_ID = new Identifier_ID();
        if(tokens.size()>=1)
        {
            if(innerStatement.print(tokens)) return true;
            if(if_stmt.print(tokens)) return true;
            if(while_Loop.print(tokens)) return true;
            if(print.print(tokens)) return true;
            if(identifier_ID.print(tokens)) return true;
        }
        return false;
    }
    
}
