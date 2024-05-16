package behavioral.chain_of_respon.atm.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayCollection63 array = new ArrayCollection63();
        iterator63 iterator = array.createIterator();
        while (iterator.IsDone()){
            System.out.println(iterator.next());
        }
    }
}
