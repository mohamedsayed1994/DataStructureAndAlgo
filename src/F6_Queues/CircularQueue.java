package F6_Queues;

import F4_List.Employee;

import java.util.NoSuchElementException;

public class CircularQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public CircularQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        //check if array is full and resize it
        if (size() == queue.length - 1) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];
            //System.arraycopy(queue, 0, newArray, 0, queue.length);
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);
            queue = newArray;
            front = 0;
            back = numItems;
        }
        queue[back] = employee;
        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }
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
        } else if (front == queue.length) {
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
        if (front <= back) {
            return back - front;
        } else {
            return back - front + queue.length;
        }
    }

    public void print() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
