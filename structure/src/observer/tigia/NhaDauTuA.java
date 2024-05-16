package observer.tigia;

public class NhaDauTuA  implements  TiGiaObsever{
    TIGia t;

    public NhaDauTuA(TIGia t) {
        this.t = t;
    }

    public void dangKy(){
        t.attack(this);
    }
    public void huyDangKy(){
        t.detach(this);
    }

    @Override
    public  void update(float delta){
        if(delta >= 0 ){
            System.out.println("Nha dau tu A Ban ra");
        }
        System.out.println("Nha dau tu A mua vao");
    }}