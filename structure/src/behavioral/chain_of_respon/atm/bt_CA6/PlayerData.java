package behavioral.chain_of_respon.atm.bt_CA6;

import java.util.*;
import java.util.ArrayList;

public class PlayerData {
    int thoiGian, soLuotChoi, diem;
    private PlayerDataListener listener;

    public PlayerData(PlayerDataListener listener) {
        this.listener = listener;
    }

    public PlayerDataListener getListener() {
        return listener;
    }

    public void setListener(PlayerDataListener listener) {
        this.listener = listener;
        notyfyListener();
    }

    public PlayerData(int thoiGian, int soLuotChoi, int diem) {
        this.thoiGian = thoiGian;
        this.soLuotChoi = soLuotChoi;
        this.diem = diem;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        notyfyListener();
    }

    public int getSoLuotChoi() {
        return soLuotChoi;
    }

    public void setSoLuotChoi(int soLuotChoi) {
        this.soLuotChoi = soLuotChoi;
        notyfyListener();
    }

    public int getDiem() {
        return diem;

    }

    public void setDiem(int diem) {
        this.diem = diem;
        notyfyListener();
    }
    public void addListener(PlayerDataListener listeners){
        this.listener = listeners;
    }
    private void notyfyListener(){
        if(listener != null){
            listener.listen(this);
        }
    }

}
