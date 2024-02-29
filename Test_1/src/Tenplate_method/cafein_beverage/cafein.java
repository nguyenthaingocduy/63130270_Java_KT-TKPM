package Tenplate_method.cafein_beverage;

public class cafein extends caffeinBeverage {
    @Override
    protected void brew(){
        System.out.println("Cho bot cafe vao nuoc soi va khuay cho tan");
    }
    @Override
    protected void addCondiment(){
        System.out.println("Cho them mot it sua ong tho");
    }
}
