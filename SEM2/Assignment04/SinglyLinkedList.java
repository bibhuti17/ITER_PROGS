package SEM2.Assignment04;

import java.util.Scanner;

public class SinglyLinkedList {
    static Scanner sc = new Scanner(System.in);
    public static int size = 0;

    Node create(Node start) {
        Node n = new Node();
        System.out.println("Enter details --------------->");
        n.setRegd_no(sc.nextInt());
        n.setMarks(sc.nextFloat());
        n.setNext(null);
        start = n;
        size++;

        System.out.print("If you want to enter more data (1) else (0) : ");
        int ch = sc.nextInt();

        while (ch == 1) {
            Node q = n;
            n = new Node();
            System.out.println("Enter details --------------->");
            n.setRegd_no(sc.nextInt());
            n.setMarks(sc.nextFloat());
            n.setNext(null);
            q.setNext(n);
            size++;
            System.out.println("If you want to enter more node (1) else (0)");
            ch = sc.nextInt();
        }

        return start;
    }


    Node addBeg(Node start){
        Node n = new Node();
        System.out.println("Enter details --------------->");
        n.setRegd_no(sc.nextInt());
        n.setMarks(sc.nextFloat());
        n.setNext(start);
        size++;
        System.out.println("Node inserted successfully...........");
        return n;
    }

    Node addLast(Node start) {
        Node n = new Node();
        System.out.println("Enter details --------------->");
        n.setRegd_no(sc.nextInt());
        n.setMarks(sc.nextFloat());
        n.setNext(null);

        if (start == null) {
            return n;
        }

        Node curr = start;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }

        curr.setNext(n);
        System.out.println("Node inserted successfully...........");
        return start;
    }

    Node addAny(Node start, int p) {
        System.out.println("#####Zero based indexing.");
        Node n = new Node();
        System.out.println("Enter details --------------->");
        n.setRegd_no(sc.nextInt());
        n.setMarks(sc.nextFloat());

        if (p == 0) {
            return addBeg(start);
        } else if (p == size) {
            return addLast(start);
        } else {
            Node curr = start;
            for (int i = 0; i < p-1; i++) {
                curr = curr.getNext();
            }
            n.setNext(curr.getNext());
            curr.setNext(n);
            System.out.println("Node inserted successfully...........");
            return start;
        }
    }

    Node delBeg(Node start) {
        if (start == null) {
            System.out.println("Nothing to delete.........");
            return null;
        }

        Node newStart = start.getNext();
        System.out.println("Node deleted successfully...........");
        return newStart;
    }


    Node delLast(Node start) {
        if (start == null) {
            System.out.println("Nothing to delete..........");
            return null;
        }

        if (start.getNext() == null) {
            return null;
        }

        Node secLast = start;
        while (secLast.getNext().getNext() != null) {
            secLast = secLast.getNext();
        }
        secLast.setNext(null);
        System.out.println("Node deleted successfully...........");
        return start;
    }

    Node delAny(Node start, int p) {
        if (start == null) {
            System.out.println("Nothing to delete........");
            return null;
        }

        if (p == 0) {
            return delBeg(start);
        }
        if (p == size) {
            return delLast(start);
        }

        Node curr = start;
        for (int i = 0; i < p-1; i++) {
            curr = curr.getNext();
        }
        curr.setNext(curr.getNext().getNext());
        System.out.println("Node deleted successfully...........");
        return start;
    }

    Node delByRegd(Node start, int r) {
        if (start == null) {
            System.out.println("List is empty.");
            return null;
        }

        if (start.getRegd_no() == r) {
            System.out.println("Node is Deleted according to the Registration Number.");
            return start.getNext();
        }

        Node currentNode = start;
        Node previousNode = null;
        while (currentNode != null && currentNode.getRegd_no() != r) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if (currentNode == null) {
            System.out.println("Node with the registration Number " + r + " has not been found.");
            return start;
        }

        previousNode.setNext(currentNode.getNext());
        currentNode.setNext(null);
        System.out.println("Node deleted according to the registration Number.");
        return start;
    }

    void search(Node start, int r) {
        if (start == null) {
            System.out.println("List is empty.............");
            return;
        }

        Node curr = start;
        Node search = null;
        while (curr != null) {
            if (curr.getRegd_no() == r) {
                search = curr;
                break;
            }
            curr = curr.getNext();
        }

        if (search != null) {
            System.out.println(search.getRegd_no() + " " + search.getMarks());
        } else {
            System.out.println("Node with the registration Number " + r + " has not been found.");
        }
    }

    Node reverse(Node start) {
        Node previousNode = null;
        Node currentNode = start;
        Node nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.getNext();
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }

        start = previousNode;
        return start;
    }

    Node sort(Node start) {
            if (start == null || start.getNext() == null) {
                return start; // No need to sort if the list is empty or has only one node
            }

            boolean swapped;
            Node curr;
            Node last = null;

            do {
                swapped = false;
                curr = start;

                while (curr.getNext() != last) {
                    if (curr.getMarks() > curr.getNext().getMarks()) {
                        // Swap the nodes
                        float tempMarks = curr.getMarks();
                        int tempRegd_no = curr.getRegd_no();

                        curr.setMarks(curr.getNext().getMarks());
                        curr.setRegd_no(curr.getNext().getRegd_no());

                        curr.getNext().setMarks(tempMarks);
                        curr.getNext().setRegd_no(tempRegd_no);

                        swapped = true;
                    }
                    curr = curr.getNext();
                }
                last = curr;
            } while (swapped);

            return start;


    }

    void display(Node start) {
        Node curr = start;
        if (start == null) {
            System.out.println("List is empty..........");
            return;
        }

        while (curr != null) {
            System.out.print("[ " + curr.getRegd_no() + " : " + curr.getMarks() + " ] -> ");
            curr = curr.getNext();
        }
        System.out.println("NULL");
    }

    Node findMaxVal(Node start) {
        if (start == null) {
            System.out.println("List is empty..........");
            return null;
        }

        Node maxNode = start;
        Node current = start.getNext();

        while (current != null) {
            if (current.getMarks() > maxNode.getMarks()) {
                maxNode = current;
            }
            current = current.getNext();
        }

        return maxNode;
    }

    
}
