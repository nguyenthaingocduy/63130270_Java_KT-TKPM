package builderPattern.bt_a6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;
    List<SanPham> list = new ArrayList<>();
    private DataAccess(){

    }
    public static DataAccess getInstance(){
        if(instance==null)
            instance = new DataAccess();
        return instance;
    }
    public void addSP(SanPham s){
        list.add(s);
    }
    public void delete(String maSP){
        for(var s: list)
            if(s.getMaSP().equals(maSP)){
                list.remove(s);
                return;
            }
    }
    public void update(SanPham s){
        for(int i = 0; i<list.size();i++)
            if(s.getMaSP().equals(list.get(i).maSP)){
                list.set(i, s);
                return;
            }
    }
    public void printlist(){
        for(var s: list)
            System.out.println(s.toString());
    }
}
