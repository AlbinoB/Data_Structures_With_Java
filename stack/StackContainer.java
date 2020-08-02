package stack;

import java.util.ArrayList;
import java.util.List;

public class StackContainer{
	
	
	private List<Node> stack=new ArrayList<Node>();
	private Node top=null;
	
	
	public void push(int data) {
		
		Node newNode=new Node(data);
		
		if(top==null) {
			top=newNode;
		}else {
			newNode.next=top;
			top=newNode;
		}
	
	}
	
	public int pop() {
		
		if(top==null) {
			return -1;//stack is empty
		}else {
			Node temp=top;
			
			
			int data=top.data;
			top=top.next;
			
			temp=null;//free memory
			
			return data;//return top element of stack after it has been popped
		}
	}
	
	
	public int peek() {
		if(top==null) {
			return -1;//stack is empty
		}else {
			return top.data;//return top element of stack 
		}
		
	}
	
	
	public void displayStack() {
		
		if(peek()==-1) {
			System.out.println("stack is empty");
			return;
		}
		
		Node temp=top;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
}
