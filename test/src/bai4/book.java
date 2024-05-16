package bai4;

import java.util.ArrayList;

public class book {
    String title;
    String author;
    String ISBN;

    private static  ArrayList<book> bookCollection = new ArrayList<book>();

    public book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public static  void add_book(book B){
        bookCollection.add(B);
    }

    public  static  void remove_book(book B){
        bookCollection.remove(B);
    }

    public static ArrayList<book> get_bookCollection(){
        return bookCollection;
    }

}
