package F6_Queues;

import F4_List.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        //check if array is full and resize it
        if (back == queue.length) {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back] = employee;
        back++;
    }

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        Employee emp = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            back = 0;
            front = 0;
        }
        return emp;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void print() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
