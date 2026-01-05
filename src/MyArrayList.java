

public class MyArrayList<E> implements List<E> {
    private int size = 0;
    private Object[] items = new Object[10];

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E element) {
        if (size < items.length) {
            items[size] = element;
            size++;
        } else {
            Object[] temp = new Object[items.length + items.length / 2];
            for (int i = 0; i < size; i++) {
                temp[i] = items[i];
            }
            items = temp;
            items[size] = element;
            size++;
        }
    }

    @Override
    public void addByIndex(E element, int index) {

        if (element == null) {
            throw new NullPointerException();
        } else if (index < 0) {
            throw new IllegalArgumentException();
        } else if (index > size() - 1) {
            throw new MyIndexOutBoundsException();
        }
        if (size == items.length) {
            Object[] temp = new Object[items.length + items.length / 2];
            for (int i = 0; i < size; i++) {
                temp[i] = items[i];
            }
            items = temp;
        }
        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = element;
        size++;

    }

    @Override
    public E getByIndex(int i) {
        if (i >= 0 && i < size) {
            return (E) items[i];
        } else throw new MyIndexOutBoundsException();
    }

    @Override
    public E removeByIndex(int i) {
        if (i > size - 1 || i < 0) {
            throw new MyIndexOutBoundsException();
        } else {
            Object removed = items[i];
            for (int j = i; j < size - 1; j++) {
                items[j] = items[j + 1];
            }
            size--;
            items[size] = null;
            return (E) removed;
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
        size = 0;
    }
}