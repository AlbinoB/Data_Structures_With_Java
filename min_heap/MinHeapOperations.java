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
	
	int getIndexOf(int data) {
		
		for(int i=0; i<lastInsertedIndex; i++) {
			
			if(data==heap.get(i)) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	
	void deleteElement(int data) {
		
		
		int indexOfElement=getIndexOf(data);
		if(indexOfElement==-1) {
			System.out.println("Element not found!");
			return; 
		}
		
		if(indexOfElement==0) {//root element then poll
			poll();
			
			System.out.println("Element deleted:"+data);
			
			displayHeap();
			
			return;
		}
		
		swapNodeValues(indexOfElement, lastInsertedIndex);//swap
		
		//delete last node
		heap.remove(lastInsertedIndex--);
		
		bubbleUpFrom(indexOfElement);
		
		System.out.println("Element deleted:"+data);
		
		displayHeap();
		
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
							swapNodeValues(bubbleIndex,leftChildNodeIndex);
							bubbleDownFrom(leftChildNodeIndex);
						}else {
							swapNodeValues(bubbleIndex,rightChildNodeIndex);
							bubbleDownFrom(rightChildNodeIndex);
						}
					}catch(Exception e){
						swapNodeValues(bubbleIndex,leftChildNodeIndex);
						
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
		
				swapNodeValues(currentNodeIndex,parentIndex);
				
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
	
	
	//swap node values
	void swapNodeValues(int currentNodeIndex,int withNodeIndex){
		
		int currentNodeValue=heap.get(currentNodeIndex);
		int nextNodeValue=heap.get(withNodeIndex);
		
		
		
		heap.set(currentNodeIndex, nextNodeValue);
		heap.set(withNodeIndex, currentNodeValue);
		
		
	}
	
}
