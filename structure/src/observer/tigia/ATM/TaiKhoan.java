package observer.tigia.ATM;

public class TaiKhoan implements ATM.TaiKhoanATM {
    String ten;
    int soDu;
    ATM atm;

    public TaiKhoan(String ten, int soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaTheVaoATM(){
        atm.nhanThe(this);

    }

    public void rutTheRaATM(){
        atm.traThe(this);
    }

    @Override
    public boolean kiemTraSoDu(int soTien) {
        return soDu - soTien >= 50;

    }

    @Override
    public void nhanThongBao(int soienRut, boolean thanhCong) {
        if(thanhCong){
            System.out.println("Tai khoan: "+ ten);
            System.out.println("So du: "+ soDu);
            System.out.println("SO tien rut: " + soienRut);
            soDu = soDu - soienRut;
            System.out.println("So du cuoi: "+ soDu);
        }else{
            System.out.println("Tai khoan: "+ ten);
            System.out.println("So du: "+ soDu);
            System.out.println("SO tien rut: " + soienRut);
            System.out.println("Khong du tien rut.");
        }
    }
}
