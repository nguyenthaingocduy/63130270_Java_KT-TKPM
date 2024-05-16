package find_lottery_ticket;

import java.util.List;

public class GiaiKhuyenKhich extends GiaiThuong{
    public GiaiKhuyenKhich(List<String> boSoTrungThuong, String tenGiai) {
        super(boSoTrungThuong, tenGiai);
    }

    @Override
    public void DoVeSo(String veSo) {
        for(String s: boSoTrungThuong){
            if(veSo.endsWith(s)){
                System.out.println("Ban da trung giai!!!" + tenGiai);
                return;
            }
            System.out.println("Khong trung giai" + tenGiai + "Tiep tuc do so.");
        }
    }

    @Override
    public GiaiThuong GiaiKeTiep(GiaiThuong gt) {
        return gt;
    }
}
