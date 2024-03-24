package BEverage;

public class Milk extends CondIlementFecorator{
    public Milk(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public float coat() {
        return 2 + beverage.coat();
    }
}
