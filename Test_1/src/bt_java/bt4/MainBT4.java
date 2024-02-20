package bt_java.bt4;

public class MainBT4 {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.them(new ChuyenXeNoiThanh("006", "Ngoc Trinh",  "79D-1234", 10000,  2,  38));
        qlcx.them(new ChuyenXeNoiThanh( "007",  "Ngoc Duy",  "79D-5678",  10000,  3,  37));
        qlcx.them(new ChuyenXeNoiThanh( "009", "Ngoc",  "79D-9012", 10000,  4,  36));

        qlcx.inDSCX();
        System.out.println("Doanh thu xe ngoai thanh: " + qlcx.tongDoanhThuNgoaiThanh());
        System.out.println("Doanh thu xe noi thanh: " + qlcx.tongDoanhThuNoiThanh());
        System.out.println("Doanh thu cua ca hai loai xe: " + (qlcx.tongDoanhThuNgoaiThanh() + qlcx.tongDoanhThuNoiThanh()));



    }
}
