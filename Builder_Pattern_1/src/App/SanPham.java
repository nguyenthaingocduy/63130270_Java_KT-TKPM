package App;

public class SanPham {
    private String maSp;
    private String tenSp;
    private int soLuong;
    private double sonGia;

    public SanPham(String maSp, String tenSp, int soLuong, double sonGia) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.sonGia = sonGia;

    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getSonGia() {
        return sonGia;
    }

    public void setSonGia(double sonGia) {
        this.sonGia = sonGia;
    }
}
