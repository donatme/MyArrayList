public interface List<E>  {
    int size();

    void add(E element);

    void addByIndex(E element, int index) throws IllegalAccessException;

    /**
     *
     * @param index
     * @return
     * @throws IllegalArgumentException if index less than zero
     * @throws MyIndexOutBoundsException if index more than list.size-1
     */
    E getByIndex(int index);

    E removeByIndex(int index);

    void clear();
}