package Behavior.Stratery.CC2;

import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVien {
    List<SinhVien> sinhViens = new ArrayList<>();
    ISoSanh soSanh;
    List<SinhVien> list = new ArrayList<>();
    public void themSV(SinhVien sv){
        list.add(sv);
    }
    public void sapXep() {
        if (soSanh != null)
            list.sort((o1, o2) ->soSanh.soSanh(o1, o2));
    }
//    public void sapXep2(){
//        for(int i=0;i<list.size()-1;i++)
//            for(int j=i+1;j<list.size();j++);
//                if(soSanh.soSanh(list.get(i), list.get(j))>1){
//                    SinhVien s= list.get(i);
//                    list.set(i, list.get(j));
//                    list.set(j,s);
//                }
//    }
    public void inDS(){
       for(SinhVien c:list)
           System.out.println(c.toString());
    }
}

