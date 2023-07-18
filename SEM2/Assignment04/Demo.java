package SEM2.Assignment04;

import java.util.LinkedList;

public class Demo {
    static Node head;
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Node start = null;

        // Example usage of the modified methods
        start = list.create(head);
        list.display(start);

        start = list.addBeg(start);
        list.display(start);

        start = list.addLast(start);
        list.display(start);

        start = list.addAny(start, 2);
        list.display(start);

        start = list.delBeg(start);
        list.display(start);

        start = list.delLast(start);
        list.display(start);

        start = list.delAny(start, 1);
        list.display(start);

        start = list.delByRegd(start, 123);
        list.display(start);

        list.search(start, 456);

        start = list.reverse(start);
        list.display(start);

        start = list.sort(start);
        list.display(start);

        Node maxNode = list.findMaxVal(start);
        if (maxNode != null) {
            System.out.println("Max Value: " + maxNode.getRegd_no() + " : " + maxNode.getMarks());
        }
    }}
