package syntaxanalyzer;

import Nodes.DataType;
import Nodes.Expression;
import Nodes.Identifier;
import Nodes.Type;
import java.util.LinkedList;
import java.util.Queue;

public class SyntaxAnalyzer {

    public static void main(String[] args) {
           Queue<Token> tokens = new LinkedList<Token>();
           
//           tokens.add(new Token("FLOAT","float"));
//           tokens.add(new Token("LEFT_SQUARE_B","["));
//           tokens.add(new Token("RIGHT_SQUARE_B","]"));
//           
           tokens.add(new Token("INTEGRAL_LITERAL","3"));
           tokens.add(new Token("OR","||"));
           tokens.add(new Token("FLOAT_LITERAL","5"));
           
           Expression expression = new Expression();
           expression.print(tokens);
    }
    
}
