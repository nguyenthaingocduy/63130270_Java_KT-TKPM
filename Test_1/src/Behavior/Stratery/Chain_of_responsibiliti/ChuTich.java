package Behavior.Stratery.Chain_of_responsibiliti;

public class ChuTich extends NhanVienF88{
    public ChuTich(String ten, String chucVu, int hanMucXuLyVay) {
        super(ten, chucVu, hanMucXuLyVay);
    }

    @Override
    public NhanVienF88 capCaoHon(NhanVienF88 nv) {
        return null;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        return null;
    }
}
