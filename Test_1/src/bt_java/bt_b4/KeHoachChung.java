package bt_java.bt_b4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{
    List<KeHoachHocTap> list = new ArrayList<>();


        public KeHoachChung(String ten) {
        super(ten);
    }

    @Override
    public void Add(KeHoachHocTap k) {
        list.add(k);
    }

    @Override
    public void Remove(KeHoachHocTap k) {
        list.remove(k);
    }

    @Override
    public int TongSoTinChi() {
        int stc = 0;
        for(var k: list)
            stc += k.TongSoTinChi();

        return 0;
    }

    @Override
    public int HocPhi() {
        int hp = 0;
        for(var k: list)
            hp += k.HocPhi();
        return 0;
    }

    @Override
    public String ThongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ten cua ki hoc: ").append(ten).append(",\t").append("Tong so tin chi la: ").append(TongSoTinChi()).append(",\t").append("Hoc Phi la: ").append(HocPhi());
        for(var k: list){
            k.p = this.p + "\t";
            builder.append("\n").append(k.p).append(k.ThongTin());
            k.p = "";
        }
        return builder.toString();
    }


}
