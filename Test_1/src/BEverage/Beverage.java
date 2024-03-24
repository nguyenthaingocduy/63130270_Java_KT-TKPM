package BEverage;

public abstract class Beverage {
    String description;
    public Beverage(String description){
        this.description = description;
    }
    public abstract float coat();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
