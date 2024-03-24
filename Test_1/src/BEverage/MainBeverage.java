package BEverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("CaFe Trung Nguyen");
        b = new Milk("Sua co gai Ha Lan", b);
        b = new Milk("Sua Ong Tho", b);
        b = new CaFe("CaFe Trung Nguyen",b);
        System.out.println(b.getDescription());
        System.out.println(b.coat());
    }
}
