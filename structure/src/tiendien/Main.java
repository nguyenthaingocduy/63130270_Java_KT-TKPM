package tiendien;

public class Main {
    public static void main(String[] args) {
        TienDienBacThang bacCaoNhat = new BacCaoNhat("Bac cao nhat", 0, 50, 1000);
        TienDienBacThang bacSuDung = new BacSuDung("Bac su dung", 50, 100, 1200);
        System.out.println("Tinh tien dien cho 40KW: "+ bacCaoNhat.tinhTIenDien(40));
        System.out.println("Tinh tien dien cho 70KW: " + bacSuDung.tinhTIenDien(70));
        System.out.println("TInh tien dien cho 120KW: "+ bacSuDung.tinhTIenDien(120));
    }
}
