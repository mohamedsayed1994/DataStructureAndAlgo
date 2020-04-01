package F4_List;

public class V47_SingleLinkedList {
    public static void main(String[] args) {
        Employee aly = new Employee(1, "Aly", "mohamed");
        Employee mariam = new Employee(2, "mariam", "mohamed");
        Employee mustafa = new Employee(3, "mustafa", "mohamed");
        Employee reem = new Employee(4, "reem", "mohamed");

        EmployeeSingleLinkedList linkedList = new EmployeeSingleLinkedList();
        System.out.println(linkedList.isEmpty());
        linkedList.addToFront(aly);
        linkedList.addToFront(mariam);
        linkedList.addToFront(mustafa);
        linkedList.addToFront(reem);
        //linkedList.addToFront(aly);
        linkedList.print();
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.isEmpty());
        System.out.println("remove "+linkedList.removeFromFront());
        System.out.println(linkedList.getSize());
        linkedList.print();
    }
}
