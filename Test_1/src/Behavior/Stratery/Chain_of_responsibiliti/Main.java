package Behavior.Stratery.Chain_of_responsibiliti;

import A1_Struc.Nhan;

public class Main {
    public static void main(String[] args) {
        NhanVienF88 nv1 = new NhanVIen("Lom", "Bao ve", 100000);
        NhanVienF88 nv2 = new NhanVIen("Hung", "Nhan vien", 100000);
        NhanVienF88 nv3 = new NhanVIen("Lo", "Jobless", 2000000);
        NhanVienF88 nv4= new NhanVIen("Lom", "HomeLess", 150000);
        NhanVienF88 nv5 = new NhanVIen("Heo", "Truong phong", 400000);
        NhanVienF88 nv6 = new NhanVIen("Chu", "Giam doc", 100000000);
        NhanVienF88 nv7 = new NhanVIen("Beo", "Chu tich", 10000000);
//        nv1.capCaoHon(HomeLess).capCaoHon(nhanvien).capCaoHon(Jobless).capCaoHon(TruongPhong).capCaoHon(GiamDoc).capCaoHon(chuTich);
        System.out.println(nv1.xuLyKhoanVay(150000));








    }
}
