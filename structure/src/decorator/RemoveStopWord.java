package decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopWord extends ToKenDecorator {

    List<String> stopwords;
    public RemoveStopWord(Tokenize tokens) {

        super(tokens);
        stopwords = new ArrayList<String>(Arrays.asList("thì", "mà", "và", "nhưng", "bởi", "bị","cái", "được"));
    }

    @Override
    public List<String> tokenize() {
        List<String> result = tokens.tokenize();
        result.removeAll(stopwords);
        return result;
    }
}
