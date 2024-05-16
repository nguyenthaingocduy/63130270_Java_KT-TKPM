package observer.tigia;

public class NhaDauTuB implements TiGiaObsever{
    TIGia t;

    public NhaDauTuB(TIGia t) {
        this.t = t;
    }

    public void dangKy(){
        t.attack(this);
    }
    public void huyDangKy(){
        t.detach(this);
    }

    public  void update(float delta){
        if(delta >= 0 ){
            System.out.println("Nha dau tu B Ban ra");
        }
        System.out.println("Nha dau tu B mua vao");
    }
}
