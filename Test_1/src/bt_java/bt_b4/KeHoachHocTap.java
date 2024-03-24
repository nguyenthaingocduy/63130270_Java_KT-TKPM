package bt_java.bt_b4;

public abstract class KeHoachHocTap {
    String ten;
    String p ="";

    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }

    public abstract void Add(KeHoachHocTap k);
    public abstract void Remove(KeHoachHocTap k);

    public abstract int TongSoTinChi();
    public abstract int HocPhi();
    public abstract String ThongTin();


}
