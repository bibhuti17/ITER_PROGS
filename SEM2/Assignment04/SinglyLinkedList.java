package SEM2.Assignment04;

public class SinglyLinkedList {
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	static Node head = null;
	static Node tail = null;
	public static class Node {
		private int regd_no; 
		private float mark;
		private Node next;

		Node() {
			this.next = null;
		}

		void setRegd_no(int r) {
			this.regd_no = r;
		}
		void setMark (float m) {
			this.mark = m;
		}
		void setNext (Node n) {
			this.next = n;
		}
		
		int getRegd_no () {
			return regd_no;
		}
		float getMark () {
			return mark;
		}
		Node getNext () {
			return next;
		}
	}
	
	public static Node create(Node start) {
		char choice;
		do {
			Node n = new Node();
			System.out.println("Enter the registration no and mark -------------->");
			n.setRegd_no(sc.nextInt());
			n.setMark(sc.nextFloat());

			if (head == null) {
				head = n;
				tail = n;
			}
			else {
				tail.next = n;
				tail = n;
			}
			System.out.println("If you want to enter again (enter y) : ");
			choice = sc.next().charAt(0);
		}
		while(choice == 'y');
		return head;
	}

	public static void display(Node start) {
		if (start == null) {
			System.out.println("List is empty!");
		}

		else {
			Node currNode = head;
			while (currNode != null) {
				System.out.print(currNode.getRegd_no()+" : "+currNode.getMark() +"  ->  ");
				currNode = currNode.next;
			}
			System.out.print("NULL");

		}
	
	}

	public static Node addBeg(Node start) {
		Node n2 = new Node();
		System.out.println("Enter registration number and name ---------->");
		n2.setRegd_no(sc.nextInt());n2.setMark(sc.nextFloat());
		if (start == null) {
			head = n2;
		}
		else {
			head = n2;
			n2 = head.next;
		}
		return head;
	}

	public static void main(String[] args) {
		create(head);
		display(head);
		addBeg(head);
		addLast(head);
	}
}