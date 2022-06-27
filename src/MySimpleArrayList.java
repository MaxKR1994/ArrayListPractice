import java.util.Iterator;

public class MySimpleArrayList<E> implements MainMethod<E> {

    private E[] values;

    public MySimpleArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E element) {
        try{
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(
                    temp,0, //src
                    values,0,//target
                    temp.length);//amount
            values[values.length-1] = element;
            return true;
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountOfElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(
                    temp, index + 1, //src
                    values, index,//target
                    amountOfElementsAfterIndex);//amount
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }
    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E element) {
        values[index] = element;
    }

    @Override
    public boolean isEmpty() {
        if(values.length == 0) {
            System.out.println("Yes, your ArrayList is empty");
            return true;
        } else {
            System.out.println("No, your ArrayList is not empty");
            return false;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}
