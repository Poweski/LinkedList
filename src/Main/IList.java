public interface IList<E> {

    boolean add(E value);

    boolean add(int index, E value);

    void clear();

    boolean contains(E value);

    E get(int index);

    E set(int index, E value);

    int	indexOf(E value);

    boolean	isEmpty();

    E remove(int index);

    boolean	remove(E value);

    int size();
}
