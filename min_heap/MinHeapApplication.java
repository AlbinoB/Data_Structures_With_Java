package min_heap;

public class MinHeapApplication {

	public static void main(String[] args) {

		MinHeapOperations heapObj=new MinHeapOperations();
		
		heapObj.insertNumber(1);
		heapObj.insertNumber(5);
		heapObj.insertNumber(1);
		heapObj.insertNumber(8);
		heapObj.insertNumber(6);
		heapObj.insertNumber(2);
		heapObj.insertNumber(2);
		heapObj.insertNumber(13);
		heapObj.insertNumber(12);
		heapObj.insertNumber(11);
		heapObj.insertNumber(7);
		heapObj.insertNumber(2);
		heapObj.insertNumber(15);
		heapObj.insertNumber(3);
		heapObj.insertNumber(10);
		
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		
		
		heapObj.insertNumber(1);
		
		heapObj.insertNumber(12);
		heapObj.insertNumber(11);
		heapObj.insertNumber(0);
		
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		System.out.println("\n Element polled:"+heapObj.poll());
		
		
		heapObj.insertNumber(0);
		heapObj.insertNumber(5);
		heapObj.insertNumber(1);
		heapObj.insertNumber(8);
		heapObj.insertNumber(6);
		
		System.out.println("\n Element present at:"+heapObj.getIndexOf(8));
		
		heapObj.deleteElement(0);
		
		
		
		
		
	}

}
