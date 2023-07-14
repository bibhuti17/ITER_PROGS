package SEM2.Assignment04;

public class Node {
    int regd_no;
    float marks;
    Node next;

    void setRegd_no(int regd_no) {
        this.regd_no = regd_no;
    }
    void setMarks(float marks) {
        this.marks = marks;
    }
    void setNext(Node n) {

        this.next = n;
    }
    public int getRegd_no() {
        return regd_no;
    }
    public float getMarks() {
        return marks;
    }

    public Node getNext() {
        return next;
    }
}
