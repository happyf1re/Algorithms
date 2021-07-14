package lesson4;

public class MyLinkedStack<E> {
    private int capacity;
    
    private MyLinkedList<E> list1 = new MyLinkedList<>();
    
    public int size() {
        return list1.size();
    }

    public boolean isEmpty() {
        return list1.isEmpty();
    }

    public boolean isFull() {
        return list1.size() == capacity;
    }

    public void push(E item) {
        list1.insertLast(item);
    }

    public E pop() {
       return list1.removeFirst();
    }

    public E peek() {
        return list1.getFirst();
    }
}
