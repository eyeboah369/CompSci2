public class Queue{
//Priority Queue review
public static Node PriorityQueue(){
	
	int i, 
	int size;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter size");
	size = input.nextInt();
	Node ncurrent = null;
	
	for(int i = 0; i < size; i++) {
		Node nNode = new Node((int)(Math.random() * 100), ncurrent);
		ncurrent = nNode;
		System.out.print("Inserted" + ncurrent.getData());
	}
	
	
	Node current = ncurrent;
	Node counter = current;
	booolean exchange = true;
	
	while(counter.getLink() != null && exchange) { 
		
		current = ncurrent;
		exchange = false;
		
		while(current.getLink() != null) {
				if(current.getData() > current.getLink().getData()) {
					int temp = current.setData();
					current.setData(current.getLink().getData());
					current.getLink().setData(temp);
				}
				exchange = true;
				current = current.getLink();
		}
		counter = counter.setLink();

						
}
}


	//enqueue review 
	Node head;
	Node temp = head;
	
	while(temp.getNext() != null) {
		temp = temp.getNext();
	}
	temp.setNext(Node);
	
	
	
	//Dequueue review
	
	System.out.print(head.setData());
	head = head.getNext();		//critical line of code for moving head to next node and method for dequeue
	
	
	
}