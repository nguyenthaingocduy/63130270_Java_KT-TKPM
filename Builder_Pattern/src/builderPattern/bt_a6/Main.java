package builderPattern.bt_a6;

public class Main {
    public static void main(String[] args) {
        UI ui1 = new UI();
        ui1.add("S01", "Mango", 150, 150000);
        UI ui2 = new UI();
        ui2.add("SO2", "Apple", 11, 111000);
        ui1.display();
    }
}
