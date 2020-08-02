package queue;

import java.util.Scanner;

public class QueueApplication {
	
public static void main(String[] args) {
		
	QueueOperations<Integer> queue=new QueueOperations<Integer>();//<Specifiy the data type of the stack >
		Scanner scanner=new Scanner(System.in);
		int choice=-1;
		//String data=new String("");//data type must match the stack data type
		Integer data=new Integer(0);//eg 1.
		//Float data=new Float(0.0);//eg 2.
		
		do {
			
			
			System.out.println("\n\n\n0.Exit");
			System.out.println("1.Peek");
			System.out.println("2.Dequeue");
			System.out.println("3.Enqueue");
			System.out.println("4.Remove Element :");
			System.out.println("5.Check Queue is empty :");
			System.out.println("6.Display full queue \n:");
			
			choice=scanner.nextInt();
			
			switch(choice) {
				case 1:{
					data=queue.peek();
					if(data==null)//queue is empty
						System.out.println("Queue is empty");
					else
						System.out.println("Head element is: "+data);
					break;
				}
				case 2:{
					data=queue.dequeue();
					if(data==null)//queue is empty
						System.out.println("Queue is empty");
					else
					System.out.println("Element dequeued: "+data);
					break;
				}
				case 3:{
					System.out.print("Enter element to be enqueued:");
					//data=scanner.next();//change this depending on the type accepted for the queue type
					//data=scanner.next(); //->String
					//data=scanner.nextInt();// ->Integer
					//data=scanner.nextFloat(); //->Float
					
					
					data=scanner.nextInt();
					queue.enqueue(data);
					break;
				}
				
				case 4:{
					System.out.print("Enter element to be removed:");
					data=scanner.nextInt();
					
					if(queue.remove(data)==null)
						System.out.print(data+" not found!!!");
					else 
						System.out.print(data+" removed");
					
					break;
				}
				case 5:{
					if(queue.isEmpty()) {
						System.out.println("Queue is empty");
					}else {
						System.out.println("Queue is not empty");
					}
					break;
				}
				
				case 6:{
					queue.displayQueue();
					break;
				}
				
				
				default:{
					System.out.println("Invalid choice!");
				}
			}
			
		}while(choice!=0);
		
		
		
	}
	
}
