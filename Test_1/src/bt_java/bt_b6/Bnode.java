package bt_java.bt_b6;

public abstract class Bnode {
    String value;

    public Bnode(String value) {
        this.value = value;
    }
    public abstract void AddL(Bnode t);
    public abstract void AddR(Bnode t);

    public abstract void RemoveL(Bnode t);
    public abstract void RemoveR(Bnode t);

    public abstract String DuyetCay();

}
