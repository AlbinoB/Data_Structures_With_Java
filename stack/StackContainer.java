package stack;

import java.util.ArrayList;
import java.util.List;

public class StackContainer<T>{
	
	

	private Node<T> top=null;
	
	
	public void push(T data) {
		
		Node<T> newNode=new Node<T>(data);
		
		if(top==null) {
			top=newNode;
		}else {
			newNode.next=top;
			top=newNode;
		}
	
	}
	
	public T pop() {
		
		if(top==null) {
			return null;//stack is empty
		}else {
			Node<T> temp=top;
			
			
			T data=(T) top.data;
			top=top.next;
			
			temp=null;//free memory
			
			return data;//return top element of stack after it has been popped
		}
	}
	
	
	public T peek() {
		if(top==null) {
			return null;//stack is empty
		}else {
			return (T) top.data;//return top element of stack 
		}
		
	}
	
	
	public void displayStack() {
		
		if(peek()==null) {
			System.out.println("stack is empty");
			return;
		}
		
		Node<T> temp=top;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
}
