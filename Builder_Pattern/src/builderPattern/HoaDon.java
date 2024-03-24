package builderPattern;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader hoaDonHeader;
    private List<CTHD> cthds;
    private HoaDon(Builder b){
        this.hoaDonHeader = b.hoaDonHeader;
        this.cthds = b.cthds;
    }
    @Override
    public String toString(){
        String str = "";
        for (CTHD cthd: cthds) {
            str += cthd.toString();
        }
        return "Hoa Don" + "Chi tiet hoa don" + str + "\n" + "Hoa don Header" + hoaDonHeader;
    }
    public static class Builder{
        private HoaDonHeader hoaDonHeader;
        private List<CTHD> cthds = new ArrayList<CTHD>();
        public Builder setHoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang){
            this.hoaDonHeader = new HoaDonHeader(maHoaDon, ngayBan, tenKhachHang);
            return this;
        }


        public Builder addCTHD(String sanPham, int soLuong, int donGia, float chietKhau){
            this.cthds.add(new CTHD(sanPham,soLuong,donGia,chietKhau));
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
