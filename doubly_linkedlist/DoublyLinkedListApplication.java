package doubly_linkedlist;

import java.util.Scanner;

import queue.QueueOperations;

public class DoublyLinkedListApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedListOperations<Integer> doublyLinkedList=new DoublyLinkedListOperations<Integer>();//<Specifiy the data type of the stack >
		Scanner scanner=new Scanner(System.in);
		int choice=-1;
		Integer data=new Integer(0);
		
		do {
			
			
			System.out.println("\n\n\n0.Exit");
			System.out.println("1.Peek");
			System.out.println("2.Insert At Postion");
			System.out.println("3.Insert");
			System.out.println("4.Delete by value:");
			System.out.println("5.Is Empty:");
			System.out.println("6.Display full List \n:");
			System.out.println("7.Display full List reverse order \n:");
			
			choice=scanner.nextInt();
			
			switch(choice) {
				case 0:{
					break;
				}
				case 1:{
					data=doublyLinkedList.peek();
					if(data==null)//queue is empty
						System.out.println("DoublyLinkedList is empty");
					else
						System.out.println("Head element is: "+data);
					break;
				}
				case 2:{
					
					System.out.print("Enter element to be inserted:");
					
					data=scanner.nextInt();
					
					System.out.print("Enter position to be inserted:");
					
					int position=scanner.nextInt();
					
					doublyLinkedList.insertAtPostion(data,position);
					
					break;
				}
				case 3:{
					System.out.print("Enter element to be inserted:");
			
					data=scanner.nextInt();
					doublyLinkedList.insert(data);
					break;
				}
				
				case 4:{
					System.out.print("Enter element to be removed:");
					data=scanner.nextInt();
					
					if(doublyLinkedList.removeWithValue(data)==null)
						System.out.print(data+" not found!!!");
					else 
						System.out.print(data+" removed");
					
					break;
				}
				case 5:{
					if(doublyLinkedList.isEmpty()) {
						System.out.println("DoublyLinkedList is empty");
					}else {
						System.out.println("DdoublyLinkedList is not empty");
					}
					break;
				}
				
				case 6:{
					doublyLinkedList.displayDoublyLinkedList();
					break;
				}
				
				case 7:{
					doublyLinkedList.displayDoublyLinkedListReverse();
					break;
				}
				
				default:{
					System.out.println("Invalid choice!");
				}
			}
			
		}while(choice!=0);
		
	
	}

}
