package Struction_Pattern.composite;

public abstract class AbstracFile63 {
    String ten, ngayTao, duongDan;
    String preStr;

    public AbstracFile63(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.duongDan = ten;
    }

    public abstract void add(AbstracFile63 f);
    public abstract void remove(AbstracFile63 f);
    public abstract String getStringTreeFolder();
    public String getPath(){
        return duongDan;
    }



}
