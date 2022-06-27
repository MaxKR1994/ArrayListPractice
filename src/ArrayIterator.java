import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {

    private E[] elements;
    private int index = 0;

    public ArrayIterator(E[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return index < elements.length;
    }

    @Override
    public E next() {
        return elements[index++];
    }
    // WORK CHECK
    /*public static void main(String[] args) {
        Integer[] integers = new Integer[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        ArrayIterator<Integer> obj = new ArrayIterator<>(integers);

        while(obj.hasNext()){
            Integer i = obj.next();
            System.out.println(i);
        }
    }*/

}
