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
        _array = (T[]) new Object[0];
    }

    public boolean add(final T item) {
        checkSize();
        _array[_size++] = item;
        return true;
    }

    public boolean remove(final T item) {
        var index = search(item);

        if (index < 0) {
            return false;
        }
        for (int i = index; i < _size; i++) {
            if (i + 1 < _size) {
                _array[i] = _array[i + 1];
            }
        }

        _array[_size - 1] = null;
        _size--;
        checkSize();
        return true;
    }

    public int search(final T item) {
        return search(item);
    }

    public int search(final T item, final int startIndex) {
        int result = -1;
        for (int i = startIndex; i < _size; i++) {
            if (item == _array[i]) {
                result = i;
                break;
            }
        }

        return result;
    }

    public boolean contains(final T item) {
        return search(item) > -1;
    }

    public boolean add(final T item, final int index) {
        if (index >= _size) {
            return false;
        }
        _size++;
        checkSize();
        for (int i = _size - 1; i >= index; i--) {
            if (i == index) {
                _array[i] = item;
            } else {
                _array[i] = _array[i - 1];
            }
        }
        return true;
    }

    public boolean replace(T oldItem, T newItem) {
        var result = false;
        var index = search(oldItem);
        if (index != -1) {
            result = true;
            _array[index] = newItem;
        }
        return result;
    }

    public boolean replace(T oldItem, T newItem, boolean replaceAll) {
        var result = false;
        // int lastIndex = -1;
        // while (lastIndex == -1) {
        //     lastIndex = search(oldItem);
        //     if (index != -1) {
        //         result = true;
        //         _array[index] = newItem;
        //     }
        // }
        return result;    
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
        } else if (_size <= _array.length - _baseSize) {
            _array = Arrays.copyOfRange(_array, 0, _array.length - _baseSize);
        }
    }
}