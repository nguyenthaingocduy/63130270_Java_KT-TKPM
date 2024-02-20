package bt_java.bt4;

public class ChuyenXeNoiThanh extends ChuyenXe {
    int soTuyen, soKm;

    public ChuyenXeNoiThanh(String maSoChuyen, String taiXe, String soXe, int doanhThu, int soTuyen, int soKm) {
        super(maSoChuyen, taiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    @Override
    public  String toString(){
        return super.toString() +
                "So tuyen: " + soTuyen + "\n" +
                "So Km: " + soKm + "\n";
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

}
