package behavioral.chain_of_respon.atm.bt_CA2;

public class MyActivity {
    private int clickCount = 0;

    void handleButtonClick(){
        clickCount++;
        System.out.println("Ban click lan thu: " + clickCount);
    }

}
