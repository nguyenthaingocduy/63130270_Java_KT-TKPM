package tiendien;

public class BacSuDung extends TienDienBacThang{
    public BacSuDung(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang bacKeTiep(TienDienBacThang b) {
        return b;
    }

    @Override
    public int tinhTIenDien(int soKW) {
        int tienDien = (soKW - min) * gia;
        if(soKW <= max){
            return (soKW - min) * gia;
        }
        return (max + min) * gia + tienDien;
    }
}
