package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class Expression implements RootNode{

    private INTEGER_LITERAL integer_literal;
    private FLOAT_LITERAL float_literal;
    private TRUE True ;
    private FALSE False ;
    private ExpressionIdentifier identifier;
    private THIS This;
    private NEW New;
    private NOT not;
    private ParameterizedExpression parameterizedExpression;
    private STRING_LITERAL string_literal;
    
    
    
    public Expression() {
       
    }

    @Override
    public boolean print(Queue<Token> tokens) {
        integer_literal = new INTEGER_LITERAL();
        float_literal = new FLOAT_LITERAL();
        string_literal = new STRING_LITERAL();
        True = new TRUE();
        False = new FALSE();
        identifier = new ExpressionIdentifier();
        This = new THIS();
        New = new NEW();
        not = new NOT();
        parameterizedExpression = new ParameterizedExpression();
        if(tokens.size()>=1)
        {
            if(string_literal.print(tokens)) return true;
            if(integer_literal.print(tokens)) return true;
            if(float_literal.print(tokens)) return true;
            if(True.print(tokens)) return true;
            if(False.print(tokens)) return true;
            if(identifier.print(tokens)) return true;
            if(This.print(tokens)) return true;
            if(New.print(tokens)) return true;
            if(not.print(tokens)) return true;
            if(parameterizedExpression.print(tokens)) return true;
        }
        return false;
    }
    
}
