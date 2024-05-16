package observer.tigia.ATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan t1 = new TaiKhoan("Hoang", 1000, atm);
        TaiKhoan t2 = new TaiKhoan("Chu", 6000, atm);
        t1.duaTheVaoATM();
        System.out.println("lan 1");
        atm.rutTien(300);
        System.out.println("lan 2");
        atm.rutTien(900);
        System.out.println("lan 3");
        t2.duaTheVaoATM();
        System.out.println("lan1");
        atm.rutTien(1500);
        System.out.println("lan2");
        atm.rutTien(1200);

    }
}
