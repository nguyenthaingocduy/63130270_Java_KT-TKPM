package A1_Struc;

public class Chia extends BieuThucDecorator{
    private int toanHang;

    public Chia(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc()+") / " + toanHang;
    }
}
