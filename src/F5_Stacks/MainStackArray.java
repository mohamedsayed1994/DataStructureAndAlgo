package F5_Stacks;

import F4_List.Employee;

public class MainStackArray {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(2);
        stack.push(new Employee(1, "Mariam", "Mohamed"));
        stack.push(new Employee(2, "Aly", "Mohamed"));
        stack.push(new Employee(3, "Omar", "Mohamed"));
        stack.push(new Employee(4, "Ahmed", "Mohamed"));
        stack.push(new Employee(5, "Sara", "Mohamed"));

        stack.print();
        System.out.println("peek ==> "+stack.peek());
        System.out.println("pop ==> "+stack.pop());
        System.out.println("-===================");
        stack.print();
    }
}
