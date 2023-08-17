package Homework2.Iterator;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Numbers numbers2 = new Numbers(new int[] {4, 6, 7, 8});

        Iterable<Integer> iterator = numbers.getIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        Iterable<Integer> iterator2 = numbers2.getIterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
    }
}
