package behavioral.chain_of_respon.atm;

public class MenhGia extends ATM_TheoMenhGia{


    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m) {
        return m;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien/menhGia;
        int soDu = soTien%menhGia;
        if(soTo > 0)
            System.out.println(soTo + "Tờ" + menhGia);
        ATM_TheoMenhGia keTiep = null;
        if(soDu > 0)
            keTiep.rutTien(soDu);
    }
}
