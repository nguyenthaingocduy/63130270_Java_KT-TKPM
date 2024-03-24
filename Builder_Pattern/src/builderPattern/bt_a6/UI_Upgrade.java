package builderPattern.bt_a6;

public class UI_Upgrade {
    String tag;

    public UI_Upgrade(String tag) {
        this.tag = tag;
    }

    public void add(String maSP, String tenSP, int soLuong, int donGia){
        DataAcessUpgrade.getInstance(tag)
                .addSP(new SanPham(maSP,tenSP,soLuong,donGia));
    }
    public void display(){
        DataAcessUpgrade.getInstance(tag).printlist();
    }
}
