package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public class STMT_ID implements RootNode{

    private ID_EXP id_exp;
    private ID_EXP_EXP id_exp_exp;

    public STMT_ID() {
    }
    
    @Override
    public boolean print(Queue<Token> tokens) {
        id_exp = new ID_EXP();
        id_exp_exp = new ID_EXP_EXP();
        if(tokens.size()>=2)
        {
            if(id_exp.print(tokens)) return true;
            if(id_exp_exp.print(tokens)) return true;
        }
        return false;
    }
    
}
