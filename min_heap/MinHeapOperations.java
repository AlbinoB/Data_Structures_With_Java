package min_heap;

import java.util.ArrayList;

public class MinHeapOperations {

	ArrayList<Integer> heap=new ArrayList<>();
	
	int lastInsertedIndex=-1;
	
	
	void insertNumber(int data) {
		heap.add(++lastInsertedIndex, data);
		bubbleUpFrom(lastInsertedIndex);//to maintain the heap invariant
		displayHeap();
	}
	
	void displayHeap() {
		System.out.println();
		for(int element:heap) {
			System.out.print(element+" ");
		}
		
	}
	
	int findValue(int data) {
		
		
		
		return -1;
		
	}
	
	int poll() {
		
		if(lastInsertedIndex==-1)
			return -1;
		
		int elementRemoved=heap.get(0);
		
		heap.set(0, heap.get(lastInsertedIndex));
		
		heap.remove(lastInsertedIndex--);
		
		bubbleDownFrom(0);
		
		return elementRemoved;
		
	}
	
	
	private void bubbleDownFrom(int bubbleIndex) {
		
		if(bubbleIndex==lastInsertedIndex) {
			return;// heap invariant satisfied
		}
			
			
			int leftChildNodeIndex=2*bubbleIndex+1;
			int rightChildNodeIndex=2*bubbleIndex+2;
			
			try {
				
				
				if(heap.get(bubbleIndex)>heap.get(leftChildNodeIndex)||heap.get(bubbleIndex)>heap.get(rightChildNodeIndex)) {
					
					try {
						if(heap.get(leftChildNodeIndex)<=heap.get(rightChildNodeIndex)) {
							swapNodeValueWithParent(bubbleIndex,leftChildNodeIndex);
							bubbleDownFrom(leftChildNodeIndex);
						}else {
							swapNodeValueWithParent(bubbleIndex,rightChildNodeIndex);
							bubbleDownFrom(rightChildNodeIndex);
						}
					}catch(Exception e){
						swapNodeValueWithParent(bubbleIndex,leftChildNodeIndex);
						
					}
					
				}
				
				
				
			}catch(Exception e) {
				
			}
	
	}


	private void bubbleUpFrom(int bubbleIndex) {
		
		if(bubbleIndex==0) {
			return;// heap invariant satisfied, root
		}else {
			
			
			int parentIndex=getParentIndexOfNode(bubbleIndex);
			int currentNodeIndex=bubbleIndex;
			
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
