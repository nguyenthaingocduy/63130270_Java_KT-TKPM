package Book;

import Book.Book;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book.Builder().setTenSach("Khong Hoi han").setPage(1000).setTacGia("DiDi").setChuong("C3?").setChuong("C2?").setChuong("C1").build();
        System.out.println(book.toString());

    }
}
