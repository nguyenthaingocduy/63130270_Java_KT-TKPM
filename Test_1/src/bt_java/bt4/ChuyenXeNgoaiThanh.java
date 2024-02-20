package bt_java.bt4;

public  class ChuyenXeNgoaiThanh extends  ChuyenXe {
    String noiDen;
    int soNgayDi;

    public ChuyenXeNgoaiThanh(String maSoChuyen, String taiXe, String soXe, int doanhThu, String noiDen, int soNgayDi) {
        super(maSoChuyen, taiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }
    @Override
    public String toString(){
        return  super.toString() +
                "Noi den: " + "\n" +
                "So ngay di: " + "\n";
    }
    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }
}
