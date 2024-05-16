package behavioral.chain_of_respon.atm;

public class Main {
    public static void main(String[] args) {
        ATM_TheoMenhGia t = new MenhGia(500);
        ATM_TheoMenhGia t1 = new MenhGia(200);
        ATM_TheoMenhGia t2 = new MenhGia(100);
        ATM_TheoMenhGia t3 = new MenhGia(10);
        ATM_TheoMenhGia t4 = new MenhGia(50);
        ATM_TheoMenhGia t5 = new MenhGia(20);
        ATM_TheoMenhGia t6 = new MenhGia(5);
        ATM_TheoMenhGia t7 = new MenhGia(2);
        ATM_TheoMenhGia t8 = new MenhGia(1);
//        t.keTiep(t1).keTiep(t2).keTiep(t4).keTiep(t5).keTiep(t3).keTiep(t6).keTiep(t7).keTiep(t8);
        t.rutTien(1500);
    }
}
