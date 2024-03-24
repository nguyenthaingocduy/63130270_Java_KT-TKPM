package bt_java.bt_b6;

import java.util.ArrayList;
import java.util.List;

public class Node extends Bnode{
    List<Bnode> child = new ArrayList<>();
    public Node(String value) {
        super(value);
    }

    @Override
    public void AddL(Bnode t) {
        child.add(t);
    }

    @Override
    public void AddR(Bnode t) {
        child.add(t);
    }

    @Override
    public void RemoveL(Bnode t) {
        child.remove(t);
    }

    @Override
    public void RemoveR(Bnode t) {
        child.remove(t);
    }

    @Override
    public String DuyetCay() {
        System.out.println(value);
        for (var child : child) {
            child.DuyetCay();
        }
        return DuyetCay();
    }
}
