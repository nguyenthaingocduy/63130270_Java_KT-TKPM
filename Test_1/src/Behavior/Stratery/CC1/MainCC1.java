package Behavior.Stratery.CC1;

public class MainCC1 {
    public static void main(String[] args) {
        Context c = new Context();
        c.setTinhToan(new Cong());
        System.out.println(c.tinh(3, 5));

    }
}
