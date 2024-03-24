package A1_Struc;

public class Nhan extends BieuThucDecorator{
    private int toanHang;

    public Nhan(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() * toanHang;
    }

    @Override
    public String bieuThuc() {
        return "("+bieuThuc.bieuThuc()+") * " + toanHang;
    }
}
