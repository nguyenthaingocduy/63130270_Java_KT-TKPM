package App;

import java.util.ArrayList;
import java.util.List;

public class dataAccess {
    private final ArrayList<Object> listSp;
    private List<SanPham> ListSp;

    public dataAccess(List<SanPham> listSp) {
        this.listSp = new ArrayList<>();
    }

    public void add(SanPham sanPham){
        listSp.add(sanPham);
        
    }

    public void delete(String maSp){
        listSp.removeIf(sanPham -> sanPham.getMaSp().equals(maSp));
    }

}
