package observer.tigia.ATM;

public class ATM {
    TaiKhoanATM theATM;
    public void nhanThe(TaiKhoanATM theATM){
        this.theATM = theATM;
    }
    public void traThe(TaiKhoanATM theATM){
        this.theATM = null;
    }

    public void rutTien(int soTien){
        if(theATM != null){
            if(theATM.kiemTraSoDu(soTien)== true)
                theATM.nhanThongBao(soTien,true);
        }else{
            theATM.nhanThongBao(soTien,false);
        }
    }
    public static interface TaiKhoanATM{
        boolean kiemTraSoDu(int soTien);
        void nhanThongBao(int soienRut, boolean thanhCong);
    }
}
