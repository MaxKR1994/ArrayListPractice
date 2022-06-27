public interface MainMethod<E> extends Iterable<E>{
    boolean add(E element);
    void remove(int index);
    E get(int index);
    int size();
    void update(int index, E e);
    boolean isEmpty();
}
