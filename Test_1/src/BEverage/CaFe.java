package BEverage;

public class CaFe extends CondIlementFecorator {
    public CaFe(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public float coat() {
        return 3 + beverage.coat();
    }
}
