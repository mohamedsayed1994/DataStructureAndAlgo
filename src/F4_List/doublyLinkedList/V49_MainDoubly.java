package F4_List.doublyLinkedList;

import F4_List.Employee;

public class V49_MainDoubly {
    public static void main(String[] args) {
        Employee aly = new Employee(1, "Aly", "mohamed");
        Employee mariam = new Employee(2, "mariam", "mohamed");
        Employee mustafa = new Employee(3, "mustafa", "mohamed");
        Employee reem = new Employee(4, "reem", "mohamed");

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(aly);
        list.addToFront(mariam);
        list.addToFront(mustafa);
        list.print();
        System.out.println("=============");
        list.addBefore(reem,mustafa);
        list.print();
//        list.addToEnd(reem);
//        System.out.println("=============");
//        list.print();
//        System.out.println(list.getSize());
//        System.out.println("=============");
//        list.removeFromFront();
//        list.print();
//        System.out.println(list.getSize());
//        System.out.println("======================>");
//        list.print();
//        list.removeFromEnd();
//        list.print();
//        System.out.println(list.getSize());

    }
}
