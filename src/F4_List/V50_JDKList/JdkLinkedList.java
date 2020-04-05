package F4_List.V50_JDKList;

import F4_List.Employee;

import java.util.LinkedList;

public class JdkLinkedList {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        //List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Mariam", "Mohamed"));
        employees.add(new Employee(2, "Aly", "Mohamed"));
        employees.add(new Employee(3, "Mustafa", "Mohamed"));
        employees.add(new Employee(4, "Abduallah", "Mohamed"));
        employees.addFirst(new Employee(4, "Abduallah", "Mohamed"));
        employees.addLast(new Employee(4, "Abduallah", "Mohamed"));
        employees.removeLast();
        employees.removeFirst();
    }
}
