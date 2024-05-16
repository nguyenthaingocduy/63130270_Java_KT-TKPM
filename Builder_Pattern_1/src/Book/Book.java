package Book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String tenSach;
    private  String tacGia;
    private int page;

    private List<String> chuong;

    public Book(Builder builder) {
        this.tenSach = builder.tenSach;
        this.tacGia = builder.tacGia;
        this.page = builder.page;
        this.chuong =builder.chuong;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tua de sach la: ").append(tenSach).append("\n").append("Tac gia la: ").append(tacGia).append("\n").append("So trang la: ").append(page).append("\n").append("So chuong la: ").append(chuong);
        return stringBuilder.toString();
    }

    public static class Builder{
        public String tenSach;
        public   String tacGia;
        public int page;

        public List<String> chuong = new ArrayList<>();

        public Builder setTenSach(String tenSach) {
            this.tenSach = tenSach;
            return this;
        }

        public Builder setTacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }

        public Builder setPage(int page) {
            this.page = page;
            return this;

        }

        public Builder setChuong(String chuongs) {
            this.chuong.add(chuongs);
            return this;
        }

        public Book build(){
            return new Book(this);
        }


    }
}
