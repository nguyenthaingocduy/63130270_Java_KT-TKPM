package behavioral.chain_of_respon.atm.bt_CA2;

import java.lang.reflect.AccessFlag;
import java.util.*;
import java.util.ArrayList;

public class MyButton {
    private List<MyActivity> listeners = new ArrayList<>();
    void addListener(MyActivity activity){
        listeners.add(activity);
    }
    void Click(){
        for(MyActivity activity: listeners){
            activity.handleButtonClick();
        }
    }

}
