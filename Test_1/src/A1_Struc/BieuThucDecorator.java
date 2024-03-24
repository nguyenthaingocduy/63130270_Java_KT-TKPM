package A1_Struc;

public abstract class BieuThucDecorator extends BieuThuc {
    float toanHang;
    protected BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public String bieuThuc() {
        return null;
    }
}
