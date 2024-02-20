package Behavior.Stratery.CC2;

import java.util.Date;

public class SinhVien {
    String hoTen, ngaySinh;

    float diemTB;

    public SinhVien(String hoTen, String ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    @Override
    public String toString() {
        return "Ho va Ten: " + hoTen + "\n" +
                "Ngay Sinh: " +ngaySinh+ "\n" +
                "Diem TB: " +diemTB+ "\n";
    }
}
