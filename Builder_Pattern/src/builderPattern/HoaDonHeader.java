package builderPattern;

public class HoaDonHeader {
    String maHoaDon, ngayBan, tenKhachHang;

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        return "HoaDonHeader" + "\n" +
                "maHoaDon: " + maHoaDon + "\n" +
                "ngayBan: " + ngayBan + "\n" +
                "tenKhachHang:. " + tenKhachHang + "\n";
    }
}
