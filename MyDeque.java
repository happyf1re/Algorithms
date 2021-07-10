package lesson3.hw;

import java.util.Deque;


//2. Создать класс для реализации дека.
public class MyDeque {
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;
    private int[] array;
    private int capacity;

    public MyDeque(int size) {
        this.size = size;
        array = new int[size];
        capacity = 0;
        begin = 0;
        end = -1;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private int nextIndex(int index) {
        return (index + 1) % array.length;
    }

    public void insertRight(int i) {
        if (isFull()) {
            throw new RuntimeException("deque is full");
        }
            if (++end > size) {
                end = 0;
            }
            array[end - 1] = i;
            capacity++;
        }

    public int removeRight() {
        if (--end < 0) end = size - 1;
        capacity--;
        return array[end];
    }

    public void insertLeft(int i) {
        if (isFull()) {
            throw new RuntimeException("deque is full");
        }
        if (--begin < 0) {
            begin = size - 1;
        }
        array[begin] = i;
        capacity++;
    }

    public int removeLeft() {
        if (++begin > size - 1)
            begin = 0;
        capacity--;
        return array[begin - 1];
    }


}
