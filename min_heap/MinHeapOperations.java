package min_heap;

import java.util.ArrayList;

public class MinHeapOperations {

	ArrayList<Integer> heap=new ArrayList<>();
	
	int lastInsertedIndex=-1;
	
	
	void insertNumber(int data) {
		heap.add(++lastInsertedIndex, data);
		heapify();//to maintain the heap invariant
		displayHeap();
	}
	
	void displayHeap() {
		System.out.println();
		for(int element:heap) {
			System.out.print(element+" ");
		}
		
	}


	private void heapify() {
		
		if(lastInsertedIndex==0) {
			return;// heap invariant satisfied, root
		}else {
			
			
			int parentIndex=getParentIndexOfNode(lastInsertedIndex);
			int currentNodeIndex=lastInsertedIndex;
			
			while(heap.get(currentNodeIndex)<heap.get(parentIndex)&&currentNodeIndex!=0){//loop until heap invariant is not satisfied
				//swap
		
				swapNodeValueWithParent(currentNodeIndex,parentIndex);
				
				currentNodeIndex=parentIndex;
				parentIndex=getParentIndexOfNode(currentNodeIndex);
			}
			
		}
		
	}
	
	
	int getParentIndexOfNode(int indexOfNode) {
		
		int parentIndex;
		
		if(indexOfNode==1 || indexOfNode==0) {//special case
			return 0;
		}
		
		
		if(indexOfNode%2==0) {//right node
			parentIndex=(indexOfNode-2)/2;
		}else {//left node
			
			
			
			parentIndex=(indexOfNode-1)/2;
		}
		
		return parentIndex;
	}
	
	
	//swap child value with parent
	void swapNodeValueWithParent(int currentNodeIndex,int parentIndex){
		
		int currentNodeValue=heap.get(currentNodeIndex);
		int parentNodeValue=heap.get(parentIndex);
		
		
		
		heap.set(currentNodeIndex, parentNodeValue);
		heap.set(parentIndex, currentNodeValue);
		
		
	}
	
}
