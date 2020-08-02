package queue;

import queue.Node;

public class QueueOperations<T>{
	

	private Node<T> head=null;
	private Node<T> tail=null;
	
	
	public void enqueue(T data) {
		
		Node<T> newNode=new Node<T>(data);
		
		if(head==null) {
			head=newNode;
			tail=head;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public T dequeue() {
		
		if(head==null) {
			return null;//queue is empty
		}else {
			
			T data=head.data;
			head=head.next;
			
			return data;//return first element of queue after it has been dequeue
		}
	}
	
	
	public T peek() {
		if(head==null) {
			return null;//queue is empty
		}else {
			return (T) head.data;//return head element of queue 
		}
		
	}
	

	
	public T remove(T data) {
		
		if(peek()==null) {
			System.out.println("Queue is empty, cant remove "+data);
			return null;
		}
		
		Node<T> temp=head;
		Node<T> tempPrevious=null;
		
		
		while(temp!=null)//loop until temp is not null or value is found
		{
		
			if(temp.data.equals(data)) {
				
				if(head==temp) {//first element to be removed
					head=head.next;
					return data;
				}
				
				tempPrevious.next=temp.next;
				return data;
				
				
			}else {
				tempPrevious=temp;
				temp=temp.next;//move to next node
			}
		}
		
		return null;//not found
		
	}
	
	public boolean isEmpty() {
			return head==null;
		}
	
	public void displayQueue() {
		
		if(peek()==null) {
			System.out.println("Queue is empty");
			return;
		}
		
		Node<T> temp=head;
		
		while(temp!=null)//loop until temp is not null
		{
			System.out.println(temp.data);
			temp=temp.next;//move to next node
		}
		
	}
	
}
