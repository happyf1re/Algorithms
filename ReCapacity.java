package lesson3.hw;


//3. Реализовать расширение массива в стеке при заполнении стека.
public class ReCapacity<T> {
    private T[] list;
    private int size;

    private void reCapacity(int newCapacity) {
        T[] tempArr = (T[]) new Object[newCapacity];
        System.arraycopy(list, 0, tempArr, 0, size);
        list = tempArr;
    }

    public void push(T item) {
        if (isFull()) {
            reCapacity(size *2);//условный размер, можно что угодно написать
        }
        list[size] = item;
        size++;
    }

    public boolean isFull() {
        return size == list.length;
    }
}
