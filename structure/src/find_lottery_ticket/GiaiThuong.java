package find_lottery_ticket;

import java.util.List;

public abstract class GiaiThuong {
    List<String> boSoTrungThuong;
    String tenGiai;

    public abstract void DoVeSo(String veSo);
    public abstract GiaiThuong GiaiKeTiep(GiaiThuong gt);

    public GiaiThuong(List<String> boSoTrungThuong, String tenGiai) {
        this.boSoTrungThuong = boSoTrungThuong;
        this.tenGiai = tenGiai;
    }

    public List<String> getBoSoTrungThuong() {
        return boSoTrungThuong;
    }

    public void setBoSoTrungThuong(List<String> boSoTrungThuong) {
        this.boSoTrungThuong = boSoTrungThuong;
    }

    public String getTenGiai() {
        return tenGiai;
    }

    public void setTenGiai(String tenGiai) {
        this.tenGiai = tenGiai;
    }
}
