package behavioral.chain_of_respon.atm.bt_CA1;


import java.util.*;

public class DataAccess {
    List<MonHoc> list = new ArrayList<>();
    MyStream<List<MonHoc>>
    stream;

    public DataAccess(MyStream<List<MonHoc>> stream) {
    }

    public void them(MonHoc m){
        list.add(m);
        stream.addEvent(list);
    }
}
