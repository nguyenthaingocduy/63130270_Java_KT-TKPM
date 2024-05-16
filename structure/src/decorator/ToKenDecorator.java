package decorator;

public abstract class ToKenDecorator implements Tokenize {
    Tokenize tokens;

    public ToKenDecorator(Tokenize tokens) {
        this.tokens = tokens;
    }
}
