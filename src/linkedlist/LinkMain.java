package linkedlist;

public class LinkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList  myListLink = new LinkedList();
		myListLink.insertFirst(10);
		myListLink.insertFirst(20);
		myListLink.insertFirst(30);
		
		//display the values 
		myListLink.displayList();
		
		while (!myListLink.isEmpty()) {
			Link temp = myListLink.deleteFirst();
			System.out.println("Deleted");
			temp.displayLink();
		}
	}

}
