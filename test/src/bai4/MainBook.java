package bai4;

import java.util.ArrayList;
import java.util.List;

public class MainBook {
    public static void main(String[] args) {
        book B1 = new book("Nganh IT co gi?", ", Top CV", ", 123456");
        book B2 = new book("Ky luat tu giac.", ", Brian Tracy", ", 789456");
        book.add_book(B1);
        book.add_book(B2);
        ArrayList<book> bookCollection = book.get_bookCollection();
        System.out.println("List of book: ");
        for (book b: bookCollection){
            System.out.println(b.getTitle() + " by "+ b.getAuthor()+ " by " + b.getISBN());
        }
        book.remove_book(B1);
        System.out.println("\n After remove "+ B1.getTitle()+ ":");
        System.out.println("List of book: ");
        for(book b: bookCollection){
            System.out.println(b.getTitle()+" by "+ b.getAuthor()+ " ISBN " + b.getISBN());
        }


    }
}
