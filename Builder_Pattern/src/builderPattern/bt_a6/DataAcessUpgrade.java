package builderPattern.bt_a6;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAcessUpgrade {
    private static Dictionary<String, DataAcessUpgrade> instance = new Hashtable<>();
    List<SanPham> list = new ArrayList<>();
    private DataAcessUpgrade(){

    }
    public static DataAcessUpgrade getInstance(String tag) {
        if (instance.get(tag) == null) {
            DataAcessUpgrade dataAcessUpgrade = new DataAcessUpgrade();
            instance.put(tag, dataAcessUpgrade);
        }
        return instance.get(tag);
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
