package bt_java.bt_b4;

public class MonHoc extends KeHoachHocTap {

    int soTinChi;
    int hocPhiTC;

    public MonHoc(String ten, int soTinChi, int hocPhiTC) {
        super(ten);
        this.soTinChi = soTinChi;
        this.hocPhiTC = hocPhiTC;
    }

    @Override
    public void Add(KeHoachHocTap k) {

    }

    @Override
    public void Remove(KeHoachHocTap k) {

    }

    @Override
    public int TongSoTinChi() {

        return TongSoTinChi();
    }

    @Override
    public int HocPhi() {

        return TongSoTinChi() * HocPhi();
    }

    @Override
    public String ThongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append(ten).append(",\t").append("So tin chi: ").append(TongSoTinChi()).append(",\thoc phi: ").append(HocPhi());
        return builder.toString();
    }
}
