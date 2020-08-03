package binary_search_tree;

import java.util.Scanner;

public class BinarySearchTreeApplication {

	
	
	public static void main(String[] args) {
		
		BinarySearchTreeOperations bst=new BinarySearchTreeOperations();
		
		Scanner scanner=new Scanner(System.in);
		int choice=-1;
		
		do {
			
			System.out.println("\n\n\n1. Insert");
			System.out.println("2. Find");
			System.out.println("3. Preorder");
			System.out.println("4. Inorder");
			System.out.println("5. Postorder");
			System.out.println("0. Exit");
			
			choice=scanner.nextInt();
			int data=-1;
			
			switch(choice) {
				case 0:{
					System.out.println("Exited!!");
					break;
				}
				case 1:{
					System.out.print("Enter number to be inserted:");
					data=scanner.nextInt();
					
					bst.insert(bst.root, data);
					
					break;
				}
				case 2:{
					System.out.print("Enter number to be inserted:");
					data=scanner.nextInt();
					
					if(bst.contains(bst.root, data)) {
						System.out.println(data+" is present");
					}else {
						System.out.println(data+" is not present");
					}
					break;
				}
				case 3:{
					bst.preorder(bst.root);
					break;
				}
				case 4:{
					bst.inorder(bst.root);
					break;
				}
				case 5:{
					bst.postorder(bst.root);
					break;
				}
				default:{
					System.out.println("Wrong input!");
					break;
				}
			}
			
			
		}while(choice!=0);
		
		
	}
	
}
