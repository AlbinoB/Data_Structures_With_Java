package binary_search_tree;

public class BinarySearchTreeOperations{
	
	Node root=null;
	
	public void insert(Node root,int data) {
		
		if(root==null){
			this.root=new Node(data);
			return;
		}
		
		if(data<root.data) {//less than root
			
			if(root.left==null) {//root is a leaf node
				root.left=new Node(data);
				return;
			}
			
			insert(root.left,data);
		}else {//greater than root
			
			if(root.right==null) {//root is a leaf node
				root.right=new Node(data);
				return;
			}
			
			insert(root.right,data);
		}
		
	}
	
	
	public boolean contains(Node root,int data) {
		
		if(root==null){
			return false;
		}
		
		if(root.data==data) {
			return true;
		}
		
		if(root.data>data) {//less than root
			if(root.left!=null)
				return contains(root.left,data);
			else
				return false;
		}else {//greater than root
			if(root.right!=null)
				return contains(root.right,data);
			else
				return false;
		}
		
	}
	
	
	public void preorder(Node root) {
		
		//root left right 
		
		if(root==null){
			return;
		}
		
		System.out.print(" "+root.data);
		
		if(root.left!=null) {
			preorder(root.left);
		}
		
		if(root.right!=null) {
			preorder(root.right);
		}
		
		
	}
	
	public void inorder(Node root) {
		
		//left root right
		
		if(root==null){
			return;
		}
		
		if(root.left!=null) {
			inorder(root.left);
		}
		
		System.out.print(" "+root.data);
		
		if(root.right!=null) {
			inorder(root.right);
		}
		
		
	}
	
	
	public void postorder(Node root) {
		
		//left right root
		
		if(root==null){
			return;
		}
		
		if(root.left!=null) {
			postorder(root.left);
		}
		
		if(root.right!=null) {
			postorder(root.right);
		}
		
		System.out.print(" "+root.data);
		
		
	}
	
	
	
	
	
}
