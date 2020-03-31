package F4_List;

import java.util.List;
import java.util.Vector;

public class V44_ArrayListVector {
    public static void main(String[] args) {
        List<Employee> employees = new Vector<>();
        //List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Mariam", "Mohamed"));
        employees.add(new Employee(2, "Aly", "Mohamed"));
        employees.add(new Employee(3, "Mustafa", "Mohamed"));
        employees.add(new Employee(4, "Abduallah", "Mohamed"));
        employees.forEach(emp -> System.out.println(emp));
        System.out.println("--> " + employees.get(0));
        System.out.println(employees.isEmpty());
        employees.set(1, new Employee(8, "Ahmed", "Mohamed"));
        employees.forEach(emp -> System.out.println("-> " + emp));
        System.out.println(employees.size());
        System.out.println("========Array==============");
        Employee[] emps = employees.toArray(new Employee[employees.size()]);
        for (Employee emp : emps) {
            System.out.println(emp);
        }
        System.out.println("=================");
        System.out.println(employees.contains(new Employee(4, "Abduallah", "Mohamed")));
        employees.remove(3);
        employees.forEach(emp -> System.out.println("--> " + emp));
    }
}
