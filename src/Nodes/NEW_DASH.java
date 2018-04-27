package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class NEW_DASH implements RootNode{

    private NEW_DASH_PART_I new_dash_part_i;
    private NEW_DASH_PART_II new_dash_part_ii;
    
    public NEW_DASH() {
    }

    
    @Override
    public boolean print(Queue<Token> tokens) {
        new_dash_part_i = new NEW_DASH_PART_I();
        new_dash_part_ii = new NEW_DASH_PART_II();
        if(tokens.size()>=1)
        {
            if(new_dash_part_i.print(tokens)) return true;
            if(new_dash_part_ii.print(tokens)) return true;
        }
        return false;
    }
    
}
