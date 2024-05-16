package behavioral.chain_of_respon.atm.iterator;

public class ArrayIterator63 implements iterator63{
    ArrayCollection63 collection63;
    int index = -1;
    public ArrayIterator63(ArrayCollection63 collection63) {
        this.collection63 = collection63;

    }

    @Override
    public Object first() {
        if (!IsDone()) {
            index = 0;
            return collection63.getItem(index);
        }
        return null;
    }

    @Override
    public Object next() {
        if(!IsDone())
            return collection63.getItem(++index);
        return null;
    }

    @Override
    public Object current() {
        if(index >= 0)
            return collection63.getItem(index);
        return null;
    }

    @Override
    public boolean IsDone() {
        return index==collection63.count() - 1;
    }
}
