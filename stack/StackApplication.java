package stack;

import java.util.Scanner;


/*
 * 
 * The stack is implemented to be as generic as possible
 * One can create the stack to be of any type.
 * Follow the examples given below to match your use case.
 * 
 * */

public class StackApplication {
	

	public static void main(String[] args) {
		
		StackContainer<String> s=new StackContainer<String>();//<Specifiy the data type of the stack >
		Scanner scanner=new Scanner(System.in);
		int choice=-1;
		String data=new String("");//data type must match the stack data type
		//Integer data=new Integer(0);//eg 1.
		//Float data=new Float(0.0);//eg 2.
		
		do {
			
			System.out.println("\n\n\n1.Peek");
			System.out.println("2.Pop");
			System.out.println("3.Push");
			System.out.println("4.Display full stack \n:");
			
			choice=scanner.nextInt();
			
			switch(choice) {
				case 1:{
					data=s.peek();
					if(data==null)//stack is empty
						System.out.println("Stack is empty");
					else
						System.out.println("Top element is: "+data);
					break;
				}
				case 2:{
					data=s.pop();
					if(data==null)//stack is empty
						System.out.println("Stack is empty");
					else
					System.out.println("Element popped: "+data);
					break;
				}
				case 3:{
					System.out.print("Enter element to be pushed:");
					data=scanner.next();//change this depending on the type accepted for the stack type
					//data=scanner.next() ->String
					//data=scanner.nextInt() ->Integer
					//data=scanner.nextFloat() ->Float
					s.push(data);
					break;
				}
				case 4:{
					s.displayStack();
					break;
				}
				
				
				default:{
					System.out.println("Invalid choice!");
				}
			}
			
		}while(choice!=0);
		
		
		
	}
	
	
	

}
