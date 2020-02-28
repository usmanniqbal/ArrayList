import java.util.Arrays;

/**
 * CustomArrayList
 */
public class CustomArrayList<T> {
    private T[] _array;
    private int _baseSize;
    private int _size;

    public CustomArrayList() {
        this(2);
    }

    public CustomArrayList(final int baseSize) {
        _baseSize = baseSize;
        _array = (T[]) new Object[_baseSize];
    }

    public boolean add(final T item) {
        checkSize();
        _array[_size++] = item;
        return true;
    }

    public int size() {
        return _size;
    }

    public boolean isEmpty() {
        return _size == 0;
    }

    private void checkSize() {
        if (_size >= _array.length) {
            _array = Arrays.copyOf(_array, _array.length + _baseSize);
        }
    }
}