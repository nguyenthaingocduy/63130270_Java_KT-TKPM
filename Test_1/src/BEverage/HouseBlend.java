package BEverage;

public class HouseBlend extends Beverage {
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public float coat() {
        return 10;
    }
}
