package Behavior.Stratery.Chain_of_responsibiliti;

public class NhanVIen extends NhanVienF88{
    NhanVienF88 capTren;
    public NhanVIen(String ten, String chucVu, int hanMucXuLyVay) {
        super(ten, chucVu, hanMucXuLyVay);
    }
    NhanVienF88 capTen;

    @Override
    public NhanVienF88 capCaoHon(NhanVienF88 nv) {
        capTren=nv;
        return capTren;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        if(tienVay<=hanMucXuLyVay){
            StringBuilder builder = new StringBuilder();
            builder.append(chucVu).append(" ").append(ten).append("Xu ly khoan vay ").append(tienVay);
            return builder.toString();
        }
        return capTren.xuLyKhoanVay(tienVay);
    }
}
