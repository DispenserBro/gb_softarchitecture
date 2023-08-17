package Homework2.Iterator;

public class Numbers {
    int[] data;

    public Numbers(int[] data) {
        this.data = data;
    }

    public Numbers() {
        this(new int[] {1, 2, 3});
    }

    public NumbersIterator getIterator() {
        return new NumbersIterator();
    }

    private class NumbersIterator implements Iterable<Integer> {
        int index;

        @Override
        public boolean hasNext() {
            return index < data.length;
        }

        @Override
        public Integer next() {
            if(hasNext()) return data[index++];
            return null;
        }
    }
}
