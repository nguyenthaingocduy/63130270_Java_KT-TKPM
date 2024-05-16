package behavioral.chain_of_respon.atm.bt_CA2;

public class Main {
    public static void main(String[] args) {
        MyButton button = new MyButton();
        MyActivity activity = new MyActivity();
        button.addListener(activity);

        button.Click();
        button.Click();
        button.Click();
        button.Click();
        button.Click();
        button.Click();
        button.Click();
        button.Click();


    }
}
