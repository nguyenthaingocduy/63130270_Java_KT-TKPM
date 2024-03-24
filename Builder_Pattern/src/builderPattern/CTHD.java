package builderPattern;

public class CTHD {
    String sanPham;
    int soLuong, donGia;
    float chietKhau;

    public CTHD(String sanPham, int soLuong, int donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }
    @Override
    public String toString(){
        return "Chi tiet hoa don" + "\n" + "Product: " + sanPham + "\n" +
                "So luong: " + soLuong + "\n" +
                "Don gia: " + donGia + "\n" +
                "Chiet khau: " + chietKhau;
    }
}
