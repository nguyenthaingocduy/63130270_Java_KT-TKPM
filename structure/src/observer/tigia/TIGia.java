package observer.tigia;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// this's a subject
public class TIGia {
    List<TiGiaObsever> obseverList = new ArrayList<TiGiaObsever>();
    public void attack(TiGiaObsever obsever){
        obseverList.add(obsever);
    }
    public void detach(TiGiaObsever obsever){
        obseverList.remove(obsever);
    }

    public  void capNhatTiGia(float delta){
        for(TiGiaObsever obsever: obseverList){
            obsever.update(delta);
        }
    }

}
