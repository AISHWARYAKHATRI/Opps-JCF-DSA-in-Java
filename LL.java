
public class LL {
	Node head;
	private int size;
	
	LL(){
		this.size = 0;
	}
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
//add -first, last
	public void addFirst(String data) {
		Node  newNode = new Node(data);
		if(head==null) {
			 head = newNode;
			 return;
		}
		newNode.next = head;
		head = newNode;
	}

//add - last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			 head = newNode;
			 return;
		}
		
		Node currNode = head;
		
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
//print
	public void printList() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + "-> ");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}

//delete first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		head = head.next;
	}

//delete last
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
		}
		
		size--;
		
		if(head.next == null) { //when only one element is present in the list
			head = null;
			return;
		}
		
		Node currNode = head;
		Node prevNode = currNode;
		while(currNode.next != null) {
		    prevNode = currNode;
			currNode  = currNode.next;
		}
		prevNode.next = null;
	}
	
//get list size
	public int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
	  LL list  = new LL();
	  list.addFirst("Linked");
	  list.addLast("List");
	  list.printList();
      list.deleteLast();
      list.printList();
      list.deleteLast();
      list.printList();
      list.addLast("Data");
      list.addLast("Structure");
      list.printList();
      System.out.println(list.getSize());
	}

}
