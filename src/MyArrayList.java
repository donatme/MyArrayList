
public class MyArrayList<E> {

    int size = 0;
    Object[] arrays = new Object[10];

    static void main() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("b");
        list.add("C");
        for (int i = 0; i < list.size; i++) {
            System.out.println(list.get(i));
        }
    }

    void add(E o) {
        if (size < arrays.length) {
            arrays[size] = o;
            size++;
        } else {
            Object[] temp = new Object[arrays.length + arrays.length / 2];
            for (int i = 0; i < size; i++) {
                temp[i] = arrays[i];
            }
            arrays = temp;
            arrays[size] = o;
            size++;
        }
    }

    E get(int i) {
        if (i >= 0 && i < size) {
            return (E) arrays[i];
        } else throw new IndexOutOfBoundsException();
    }

    E remove(int i) {
        if (i > size - 1 || i < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            Object removed = arrays[i];
            for (int j = i; j < size - 1; j++) {
                arrays[j] = arrays[j + 1];
            }
            size--;
            arrays[size] = null;
            return (E) removed;
        }
    }
}