package builderPattern.bt_a6;

public class SanPham {
    String maSP, tenSP;
    int soLuong, donGia;

    public SanPham(String maSP, String tenSP, int soLuong, int donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ma SP: ").append(maSP).append("\n");
        builder.append("Ten SP: ").append(tenSP).append("\n");
        builder.append("So luong: ").append(soLuong).append("\n");
        builder.append("Don gia: ").append(donGia).append("\n");
        return builder.toString();
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

}
