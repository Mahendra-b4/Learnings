package DesignPatterns.iteratorDP;

import java.util.List;

public class MyIteratorImplementor implements MyIterator {

    private List<User> list;
    private int length;
    private int position = 0;

    public MyIteratorImplementor(List<User> list) {
        this.list = list;
        this.length = list.size();
    }

    @Override
    public boolean hasNext() {
        return position < length;
    }

    @Override
    public Object next() throws ArrayIndexOutOfBoundsException{
        Object obj = list.get(position);
        position++;
        return obj;
    }
}
