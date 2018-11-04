public class Tester {

public static void main(String[] args) {
	
	Node node = new Node(7);
	LinkedList list = new LinkedList();
	list.addFront(3);
	list.addFront(4);
	list.addFront(5);
	list.addFront(6);
	list.addFront(7);
	list.addEnd(-1);
	list.addEnd(-2);
	list.addEnd(-3);
	list.delete(3);
	list.reverse(node);
	
	list.printList();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



}