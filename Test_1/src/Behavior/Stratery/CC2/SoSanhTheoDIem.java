package Behavior.Stratery.CC2;

public class SoSanhTheoDIem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2){
        if (o1.diemTB>o2.diemTB)
            return 1;
        if (o1.diemTB<o2.diemTB)
            return -1;
        return 0;
    }
}
