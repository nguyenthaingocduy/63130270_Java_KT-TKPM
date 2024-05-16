package decorator;

import java.util.List;

public class RemovePunctuation extends ToKenDecorator{
    public RemovePunctuation(Tokenize tokens) {
        super(tokens);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = tokens.tokenize();
        list.replaceAll(s -> {
            return s.replaceAll("\\p{Punct}","");
        });
        return list;
    }
}
