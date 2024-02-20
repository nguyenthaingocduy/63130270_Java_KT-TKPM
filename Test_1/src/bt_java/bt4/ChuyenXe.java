package bt_java.bt4;


public abstract class ChuyenXe {
    String maSoChuyen, taiXe, soXe;
    int doanhThu;

    public ChuyenXe(String maSoChuyen, String taiXe, String soXe, int doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.taiXe = taiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "Ma so chuyen: " + maSoChuyen +"\n" +
                "Tai xe: " + taiXe +"\n" +
                "So xe: " + soXe +"\n" +
                "Doanh thu: " + doanhThu +"\n";


    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public String getTaiXe() {
        return taiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public void setTaiXe(String taiXe) {
        this.taiXe = taiXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }
}
