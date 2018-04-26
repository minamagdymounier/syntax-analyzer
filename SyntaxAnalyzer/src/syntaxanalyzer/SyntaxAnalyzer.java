package syntaxanalyzer;

import Nodes.DataType;
import Nodes.Expression;
import Nodes.Goal;
import Nodes.Identifier;
import Nodes.Statement;
import Nodes.Type;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SyntaxAnalyzer {

    static Queue<Token> tokens = new LinkedList<Token>();

    public static Token subcut(String line){
        Token token = new Token();
        for(int i=0; i <line.length();i++)
            if (line.charAt(i) == ' ' && line.charAt(i+1) == '>')
                token.token = line.substring(2, i+1);
            else if (line.charAt(i) == ':' && line.charAt(i+1) == ' ')
                token.value = line.substring(i+2, line.length());
        return token;
    }
    
    public static void readTokens(String tokensfilename) throws FileNotFoundException{
        Scanner sc = new Scanner(new FileReader(tokensfilename));
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            Token token = subcut(line);
            tokens.add(token);
        }
        sc.close();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        readTokens("tokens.txt");
        Goal goal = new Goal();
        if(!goal.print(tokens)){
            System.out.println("Syntax Error");
        }
    }
}
