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

          tokens.add(new Token("LEFT_ROUND_B","("));
          tokens.add(new Token("IDENTIFIER","3"));
          tokens.add(new Token("EQUAL","="));
          tokens.add(new Token("LEFT_ROUND_B","("));
          tokens.add(new Token("IDENTIFIER","3"));
          tokens.add(new Token("PLUS","+"));
          tokens.add(new Token("FLOAT_LITERAL","3.6"));
          
          tokens.add(new Token("LEFT_SQUARE_B","["));
          tokens.add(new Token("INTEGRAL_LITERAL","3.6"));
          tokens.add(new Token("RIGHT_SQUARE_B","]"));
          
          tokens.add(new Token("LEFT_SQUARE_B","["));
          tokens.add(new Token("INTEGRAL_LITERAL","3.6"));
          tokens.add(new Token("RIGHT_SQUARE_B","]"));
       
          tokens.add(new Token("DOT","dot"));
          tokens.add(new Token("IDENTIFIER","IDENTIFIER"));          
          tokens.add(new Token("LEFT_ROUND_B","("));
          tokens.add(new Token("IDENTIFIER","IDENTIFIER"));
          tokens.add(new Token("COMMA",","));
          tokens.add(new Token("IDENTIFIER","IDENTIFIER"));
          tokens.add(new Token("RIGHT_ROUND_B",")"));
          
          tokens.add(new Token("PLUS","+"));
          tokens.add(new Token("FLOAT_LITERAL","3.6"));
          
          tokens.add(new Token("DOT","dot"));
          tokens.add(new Token("IDENTIFIER","IDENTIFIER"));          
          tokens.add(new Token("LEFT_ROUND_B","("));
          tokens.add(new Token("IDENTIFIER","IDENTIFIER"));
          tokens.add(new Token("COMMA",","));
          tokens.add(new Token("IDENTIFIER","IDENTIFIER"));
          tokens.add(new Token("RIGHT_ROUND_B",")"));
          
          tokens.add(new Token("RIGHT_ROUND_B",")"));
          tokens.add(new Token("RIGHT_ROUND_B",")"));

          
           
           
           Expression expression = new Expression();
           expression.print(tokens);
    }
    
}
