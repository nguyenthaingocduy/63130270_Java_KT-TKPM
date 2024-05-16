package observer.tigia;

public class Main {
    public static void main(String[] args) {
        TIGia t = new TIGia();
        NhaDauTuA a = new NhaDauTuA(t);
        a.dangKy();
        System.out.println("Lan 1");
        t.capNhatTiGia(1);
    }
}
