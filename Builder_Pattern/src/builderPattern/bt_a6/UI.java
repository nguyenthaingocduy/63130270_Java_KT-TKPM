package builderPattern.bt_a6;

public class UI {
    public void add(String maSP, String tenSP, int soLuong, int donGia){
        DataAccess.getInstance()
                .addSP(new SanPham(maSP,tenSP,soLuong,donGia));
    }
    public void display(){
        DataAccess.getInstance().printlist();
    }
}
