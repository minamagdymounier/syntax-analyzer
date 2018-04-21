package Nodes;

import java.util.Queue;
import syntaxanalyzer.Token;

public interface RootNode {
    public boolean print(Queue<Token> tokens);
}
