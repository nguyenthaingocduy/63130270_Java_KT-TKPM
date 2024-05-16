package behavioral.chain_of_respon.atm.bt_CA1;

public class MonHoc {
    String ten, id;
    int soTC;

    public MonHoc(String ten, String id, int soTC) {
        this.ten = ten;
        this.id = id;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "ten='" + ten + '\'' +
                ", id='" + id + '\'' +
                ", soTC=" + soTC +
                '}';
    }
}
