package Tenplate_method.cafein_beverage;

public abstract class caffeinBeverage {
    protected abstract  void brew();
    protected abstract void addCondiment();
    private void boilWater(){
        System.out.println("Dun soi nuoc o 100 degree");
    }
    private void pourInCup(){
        System.out.println("Rot nuoc vao coc");
    }
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiment();

    }
}
