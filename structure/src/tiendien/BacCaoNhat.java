package tiendien;

public class BacCaoNhat extends TienDienBacThang {
    public BacCaoNhat(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang bacKeTiep(TienDienBacThang b) {
        return b;
    }

    @Override
    public int tinhTIenDien(int soKW) {
        return (soKW - min) * gia;
    }
}
