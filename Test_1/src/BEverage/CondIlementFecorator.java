package BEverage;

public abstract class CondIlementFecorator extends Beverage {
    Beverage beverage;

    public CondIlementFecorator(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ";" + super.getDescription();
    }
}
