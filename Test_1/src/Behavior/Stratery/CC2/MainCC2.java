package Behavior.Stratery.CC2;


public class MainCC2 {
    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        qlsv.themSV(new SinhVien("Nguyen Ngoc Duy", "11/03/2003", 7));
        qlsv.themSV(new SinhVien("Nguyen Ngoc Hieu", "11/02/2003", 8));
        qlsv.themSV(new SinhVien("Nguyen Ngoc Huynh", "11/01/2003", 9));
        qlsv.inDS();

    }
}
