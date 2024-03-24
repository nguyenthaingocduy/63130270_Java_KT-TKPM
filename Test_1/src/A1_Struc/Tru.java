package A1_Struc;

public abstract class Tru extends BieuThucDecorator{
    private float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() - toanHang;
    }
}
