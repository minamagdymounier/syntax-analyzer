
package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class EOL implements RootNode{

    private String EOL = "EOL";

    public EOL() {
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        if (!tokens.isEmpty() && tokens.peek().getToken().equals(EOL)){
            System.out.println();
            tokens.poll();
            return true;
        }
        return false;
    }
    
}
