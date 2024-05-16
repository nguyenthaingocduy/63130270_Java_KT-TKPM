//package behavioral.chain_of_respon.atm.bt_CA1;
//
//import java.util.*;
//
//public class Client implements MyStreamListener<List<MonHoc>> {
//    MyStreamListener<List<MonHoc>>{
//        MyStream stream;
//        public Client(MyStream stream){
//            this.stream = stream;
//            stream.addListener();
//        }
//    }
//
//    public Client(MyStream<List<MonHoc>> stream) {
//    }
//
//    @Override
//    public void listen(List<MonHoc> monHocList) {
//        for(MonHoc monHoc : monHocList){
//            System.out.println(monHoc.toString());
//        }
//    }
//}
