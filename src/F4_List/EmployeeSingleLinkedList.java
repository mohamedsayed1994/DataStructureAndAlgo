package F4_List;

public class EmployeeSingleLinkedList {
    private EmployeeNode head;
    private int size;//use to get how many element in the linked

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        // we add new node to the head
        node.setNext(head);//set current head to be next
        head = node;// set new node to be the head
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);//to be sure it is remove
        return removeNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        EmployeeNode current = head;
        System.out.println("Head -> ");
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public int getSize() {
        return size;
    }
}
