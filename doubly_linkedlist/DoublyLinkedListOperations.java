package doubly_linkedlist;

public class DoublyLinkedListOperations<T> {
	
	Node<T> head = null;
	
	
	T peek() {
		if(head==null) 
			return null;
		
		return head.data;
	}
	
	
	void insertAtPostion(T data,int position) {
		
		if(head==null) {
			head = new Node<T>(data);
			return;
		}else {
			Node<T> newNode=new Node<T>(data);
			
			
			if(position==0) {
				newNode.next=head;
				newNode.prev=null;
				head.prev=newNode;
				head=newNode;
				return;
			}
			
			int startIndex=0;
			
			Node<T> temp=head;
			
			while(startIndex<position-1) {
				if(temp.next==null) {
					System.out.println("Out of bound");
					break;
				}		
				temp=temp.next;
				startIndex++;
			}
			
			newNode.next=temp.next;
			newNode.prev=temp;
			
			temp.next.prev=newNode;
			temp.next=newNode;
			
		}
		
	}
	
	
	
	void insert(T data) {
		
		
		if(head==null) {
			head = new Node<T>(data);
			return;
		}else {
			
			Node<T> temp=head;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			
			Node<T> newNode=new Node<T>(data);
			temp.next=newNode;
			newNode.prev=temp;
			
		}
		
	}
	
	boolean isEmpty() {
		return head==null;
	}
	
	
	T removeWithValue(T data) {
		
		if(head==null) {
			printEmpty();
			return null;
		}else {
			
			
			
			if(data.equals(head.data)) {
				
				if(head.next!=null) {
				
					head=head.next;
					head.prev=null;
					
				}else {
				
					head.prev=null;
					head.next=null;
					head=null;
				}
				return data;
				
			}
			
			
			
			Node<T> temp=head;
			
			while(temp.next!=null) {
				if(temp.next.data.equals(data)) {
					temp.next=temp.next.next;
					temp.next.prev=temp;
					return data;
				}
				
				temp=temp.next;
			}
			
			return null;//not found
		}
		
	}
	
	

	
	
	void displayDoublyLinkedList() {
		
		if(head==null) {
			printEmpty();
			return;
		}else {
			
			Node<T> temp=head;
			
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			
		}
		
		
	}
	
	
void displayDoublyLinkedListReverse() {
		
		if(head==null) {
			printEmpty();
			return;
		}else {
			
			Node<T> temp=head;
			
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			
			
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.prev;
			}
			
			
		}
		
		
	}
	
	
	void printEmpty() {
		System.out.println("DoublyLinkedList empty!!");
	}
	
	
	
}
