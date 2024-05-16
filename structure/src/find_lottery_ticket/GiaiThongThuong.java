package find_lottery_ticket;

import java.util.List;

public class GiaiThongThuong extends GiaiThuong{

    GiaiThuong giaiKeTiep;
    public GiaiThongThuong(List<String> boSoTrungThuong, String tenGiai) {
        super(boSoTrungThuong, tenGiai);
    }
    @Override
    public GiaiThuong GiaiKeTiep(GiaiThuong gt) {
        return gt;
    }
    @Override
    public void DoVeSo(String veSo) {
        for(String s: boSoTrungThuong){
            if(veSo.endsWith(s)){
                System.out.println("Ban da trung giai!!!" + tenGiai);
                return;
            }
            giaiKeTiep.DoVeSo(veSo);
        }

    }


}
