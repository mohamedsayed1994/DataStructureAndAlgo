package F6_Queues;

import F4_List.Employee;

public class MainQueue {
    public static void main(String[] args) {
        Employee aly = new Employee(1, "Aly", "mohamed");
        Employee mariam = new Employee(2, "mariam", "mohamed");
        Employee mustafa = new Employee(3, "mustafa", "mohamed");
        Employee mohamed = new Employee(4, "mohamed", "mohamed");

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(aly);
        queue.add(mariam);
        queue.add(mustafa);
        System.out.println(queue.size());
        queue.print();
        System.out.println("First " + queue.peek());
        queue.remove();
        System.out.println("Size " + queue.size());
        System.out.println("First " + queue.peek());
        queue.remove();
        System.out.println("Size " + queue.size());
        System.out.println("First " + queue.peek());
        queue.add(mohamed);
        System.out.println("Size " + queue.size());
        System.out.println("First " + queue.peek());
        queue.remove();
        queue.remove();
        System.out.println("Size " + queue.size());
        queue.add(mustafa);
        queue.print();
    }

}
