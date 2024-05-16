package tiendien;

public abstract class TienDienBacThang {
    private String tenBac;
    int min, max, gia;
    public abstract TienDienBacThang bacKeTiep(TienDienBacThang b);
    public abstract int tinhTIenDien(int soKW);

    public TienDienBacThang(String tenBac, int min, int max, int gia) {
        this.tenBac = tenBac;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    public String getTenBac() {
        return tenBac;
    }

    public void setTenBac(String tenBac) {
        this.tenBac = tenBac;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }


}
