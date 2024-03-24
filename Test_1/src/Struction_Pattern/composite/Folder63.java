package Struction_Pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder63 extends AbstracFile63{
    List<AbstracFile63> child = new ArrayList<>();

    public Folder63(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public void add(AbstracFile63 f) {
        child.add(f);
        f.duongDan += this.duongDan+"\\"+f.ten;
    }

    @Override
    public void remove(AbstracFile63 f) {
        child.remove(f);

    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten);
        for(AbstracFile63 f:child);
            builder.append("\n").append(getStringTreeFolder());
        return builder.toString();
    }
}
