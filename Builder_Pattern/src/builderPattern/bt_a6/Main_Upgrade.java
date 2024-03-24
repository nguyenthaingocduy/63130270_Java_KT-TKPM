package builderPattern.bt_a6;

public class Main_Upgrade {
    public static void main(String[] args) {
        UI_Upgrade ui1 = new UI_Upgrade("tag1");
        UI_Upgrade ui2 = new UI_Upgrade("tag1");
        UI_Upgrade ui3 = new UI_Upgrade("tag2");
        ui1.add("S01", "Mango", 150, 150000);
        ui2.add("SO2", "Apple", 11, 111000);
        ui2.display();
        ui3.add("SO3", "Apple", 11, 111000);
        System.out.println("UI3");
        ui3.display();
    }
}
