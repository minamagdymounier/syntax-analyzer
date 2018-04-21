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
//           tokens.add(new Token("TRUE","true"));
//           tokens.add(new Token("EQUAL","="));
//           tokens.add(new Token("IDENTIFIER","3"));
//           tokens.add(new Token("THIS","3"));

          tokens.add(new Token("THIS","this"));
          tokens.add(new Token("LEFT_SQUARE_B","["));
          tokens.add(new Token("IDENTIFIER","3"));
          tokens.add(new Token("RIGHT_SQUARE_B","]"));
          
           
           
           Expression expression = new Expression();
           expression.print(tokens);
    }
    
}
