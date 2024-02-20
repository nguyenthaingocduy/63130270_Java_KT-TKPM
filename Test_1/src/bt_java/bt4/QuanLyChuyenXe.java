package bt_java.bt4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> chuyenXes = new ArrayList<>();
    public boolean them(ChuyenXe cx){
        for(ChuyenXe c:chuyenXes)
            if(c.maSoChuyen == cx.maSoChuyen)
                return false;
        chuyenXes.add(cx);
        return true;
    }
    public void inDSCX(){
        for(ChuyenXe c:chuyenXes)
            System.out.println(c.toString());
    }
    public int tongDoanhThuNgoaiThanh(){
        int tong = 0;
        for (ChuyenXe c:chuyenXes)
            if(c instanceof ChuyenXeNgoaiThanh)
                tong += c.getDoanhThu();
        return tong;
    }
    public  int tongDoanhThuNoiThanh(){
        int tong = 0;
        for(ChuyenXe c:chuyenXes)
            if(c instanceof  ChuyenXeNoiThanh)
                tong += c.getDoanhThu();
        return tong;
    }
}
