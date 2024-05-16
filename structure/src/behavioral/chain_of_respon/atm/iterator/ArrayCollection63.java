package behavioral.chain_of_respon.atm.iterator;

public class ArrayCollection63 implements Collection63 {

    int[] arr = {1,2,3,4,5,6,7,8,9,0};
    public int getItem(int i){
        return 0;
    }
    public int count(){
        return arr.length;
    }
    public iterator63 createIterator(){
        return new ArrayIterator63(this);
    }

}
