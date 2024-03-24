package A1_Struc;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc b1 = new BieuThucDonGian(5);
        BieuThuc b2 = new BieuThucDonGian(5);
        BieuThuc b3 = new BieuThucDonGian(5);
        BieuThuc b4 = new BieuThucDonGian(5);
        System.out.println(b1.bieuThuc() + "=" + b1.giaTri());

    }
}
