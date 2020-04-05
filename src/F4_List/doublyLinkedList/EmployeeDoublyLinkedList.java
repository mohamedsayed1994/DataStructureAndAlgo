package F4_List.doublyLinkedList;

import F4_List.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    private int size;//use to get how many element in the linked

    public void addToFront(Employee employee) {
        //the previous field always be null for new node
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        // if list is empty will set the Node to the Tail also
        if (head == null) {
            tail = node;
        } else {// if not set previous of head to new node
            head.setPrevious(node);
            node.setNext(head);//set current head to be next
        }
        head = node;// set new node to be the head
        size++;
    }

    public void addToEnd(Employee employee) {
        //the next field always be null for the new node
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        // if list is empty will set the Node to the Tail and head
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);//set current tail to be the next for the new node
            node.setPrevious(tail);// set new node to be previous to the old tail
        }
        tail = node;// set new node to be the tail
        size++;
    }

    public EmployeeDoublyNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeDoublyNode removeNode = head;
        // check if remove only node in the list
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }


        head = head.getNext();
        size--;
        removeNode.setNext(null);//to be sure it is remove
        return removeNode;
    }

    public EmployeeDoublyNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        EmployeeDoublyNode removeNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removeNode.setPrevious(null);//to be sure it is remove
        return removeNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        EmployeeDoublyNode current = head;
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
