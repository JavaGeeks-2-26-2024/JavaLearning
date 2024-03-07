package com.leaning.day8and9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueuesIntro {

	public static void main(String[] args) {

//		Queues
		
//		FIFO - > First In First Out    -> O(1)
		
//		array list and linkedList
		
	
//		enqueue() -> insert an item
//		dequeue() -> delete an item 
//		peek()  -> return the value 
		
//		 -- throws expections                        	//----- return a values 
//		 add()                                                    offer()
//       remove()                                                  poll()
//		 element()                                                 peek()
		
//		 queues are useful when a resource is shared with several consumers
		
		
//		queues are very imp in CPU schedules 
//	
//		threads are stored in queues
		  
//		Queue<datatype> variableName = new LinkedList<datatype>();
//		Queue<datatype> variableName = new ArrayList<datatype> ();
		
		
		Queue<String> names = new LinkedList<String>();
		
		names.add("adam");
		names.add("joy");
		names.add("ana");
		names.add("kim");
		names.offer("jack");
		
		System.out.println(names);
		
		System.out.println(names.remove());
		System.out.println(names.poll());
		System.out.println(names);
		
		System.out.println(names.element());
		System.out.println(names.peek());
		
	// ------------------------------------------------------------------------------------------------------
		
//		Priority Queue 
//		 it will sort the queue based on priority 
//		 we will assign a priority value to evey single item.
//		 elements with high priority will server before low priority elements
		
		
		
	// ------------------------------------------------------------------------------------------------------	
		
//		DoubleEndedQueue- Deque
		
        Deque<Integer> queue = new ArrayDeque<Integer>();
        
//        addFirst();
//        addLast();
//        removeFirst();
//        removeLAst();
		
        
    // ------------------------------------------------------------------------------------------------------
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
//		stack (arrayDeque) is faster then normal stack data structure
//		because stack is a synchronized as its extends vectore, that hwy arrayDque is faster than normal stack DS.
		
		
        
        
	}
;
}
