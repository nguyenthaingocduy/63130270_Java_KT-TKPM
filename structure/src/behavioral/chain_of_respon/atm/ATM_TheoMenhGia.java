package behavioral.chain_of_respon.atm;

public abstract class ATM_TheoMenhGia {
    protected int menhGia;

    public ATM_TheoMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }
    public abstract  ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m);
    public abstract void rutTien(int soTIen);
}
