package find_lottery_ticket;

import java.util.List;

public class GiaiUt extends GiaiThuong{
    public GiaiUt(List<String> boSoTrungThuong, String tenGiai) {
        super(boSoTrungThuong, tenGiai);
    }

    @Override
    public void DoVeSo(String veSo) {
        for(String s: boSoTrungThuong){
            if(veSo.endsWith(s)){
                System.out.println("Ban da trung giai!!!");
                return;
            }
        }
        System.out.println("Chuc ban may man lan sau!!!");
    }

    @Override
    public GiaiThuong GiaiKeTiep(GiaiThuong gt) {
        return gt;
    }
}
