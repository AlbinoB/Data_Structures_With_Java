package stack;

import java.util.Scanner;

public class StackApplication {
	

	public static void main(String[] args) {
		
		StackContainer s=new StackContainer();
		Scanner scanner=new Scanner(System.in);
		int choice=-1;
		int data=-1;
		
		do {
			
			System.out.println("1.Peek");
			System.out.println("2.Pop");
			System.out.println("3.Push");
			System.out.println("4.Display full stack \n:");
			
			choice=scanner.nextInt();
			
			switch(choice) {
				case 1:{
					data=s.peek();
					if(data==-1)
						System.out.println("Stack is empty");
					else
						System.out.println("Top element is: "+data);
					break;
				}
				case 2:{
					data=s.pop();
					if(data==-1)
						System.out.println("Stack is empty");
					else
					System.out.println("Element popped: "+data);
					break;
				}
				case 3:{
					System.out.print("Enter element to be pushed:");
					data=scanner.nextInt();
					s.push(data);
					break;
				}
				case 4:{
					s.displayStack();
					break;
				}
				
				
				default:{
					System.out.println("invalid choice!");
				}
			}
			
		}while(choice!=0);
		
		
		
	}
	
	
	

}
