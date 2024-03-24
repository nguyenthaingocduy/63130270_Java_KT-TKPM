package builderPattern;

public class Main {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .setHoaDonHeader("Abc","11","Mi")
                .addCTHD("DCM",1, 20000,0.02f)
                .build();
        System.out.println(hoaDon.toString());
    }
}
