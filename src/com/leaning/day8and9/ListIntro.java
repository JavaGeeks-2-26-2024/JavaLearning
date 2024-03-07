package com.leaning.day8and9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListIntro {

	public static void main(String[] args) {
//	   ArrayList 
//	   LinkedList
//	   vector
//	   stack 
		
		// ArrayList
		
		
//		ArrayList<Datatype> variableName = new ArrayList<Datatype>();
		
//   1. add elements at the end of array -> O(1)
//		Array list are fast , as we can manipulate the last item.
		
		
//		 1. search based on index  -> O(1)
//		 2. search for arbitary item without index   -> O(n)
//		 3. insert at the end    -> O(1)
//		 4. insert item to arbitary position -> O(n)
//		 5. remove last item -> O(1)
//		 6. remove item to arbitary position -> O(n)
		
	// its  used for retriving data	
		ArrayList<String>   names = new ArrayList<String>();
		
		names.add("joy");
		names.add("ana");
		names.add("kim");
		names.add("jack");
		
		
		System.out.println(names);
		
		System.out.println(names.size());
		
		System.out.println(names.remove(3));
		names.add("jim");
		System.out.println(names);
		
		names.add(1, "roy");
		System.out.println(names);
		
		System.out.println(names.contains("ana"));
		
		System.out.println(names.contains("ana2"));
		
		// we have to shift alot whenever we are updating the items in arraylist
		// ------------------------------------------------------------------------------------------------------
		// Linked List 
		
		// startNode -> headNode 
		
        // node -> data and next 
		
		// all the node can be accessable through head node only
		
		
//		LinkedList<datatype> variableName  = new  LinkedList<datatype>();
		
         LinkedList<Integer> intLinkedlist = new LinkedList<Integer>();
         
         intLinkedlist.add(10);
         intLinkedlist.add(20);
         intLinkedlist.add(30);
         intLinkedlist.add(40);
         
         System.out.println(intLinkedlist);
         intLinkedlist.addFirst(5);
         intLinkedlist.addLast(50);
         System.out.println(intLinkedlist);
         System.out.println(intLinkedlist.getFirst());
         System.out.println(intLinkedlist.getLast());
         
         
		System.out.println(intLinkedlist.remove(2));
		   System.out.println(intLinkedlist);
		   
		   System.out.println(intLinkedlist.isEmpty());
		   
		   // items are not stored next to eachother , so its not a random indexing
		   
//			 1. search first item -> O(1)
//			 2. search for arbitary item   -> O(n)
//			 3. insert at the end    -> O(1)
//			 4. insert item to arbitary position -> O(n)
//			 5. remove last item -> O(1)
//			 6. remove item to arbitary position -> O(n) 
		   
		  // Linked list is used when there are more updations. 
		   
		  // ------------------------------------------------------------------------------------------------------
		   
//		   Vector 
		   
//		   its smilier to arrayList
//		   its a synchronized -> every operation we need to lock the resource and unlock after the opration
//		   its expensive 
		   
		   // ------------------------------------------------------------------------------------------------------
		   
//		    Stacks
//		   its a synchronized   uses vector
//		    LIFO structure => Last in first out
//		    pop()   -> remove the top element
//		    push()  -> add the element at top of DS
//		    peek()   -> value of top element
		   
//		   stack memory is special location RAM.
		   
		   
//		   Stack<Datatype>  variableName  = new Stack<Datatype>();
		   
		   Stack<String>   students = new Stack<String>();
		   
		   
		   students.push("adam");
		   students.push("Joe");
		   students.push("ana");
		   
		   
		   System.out.println(students);
		   
		   System.out.println(students.peek());
		   
		   
		   System.out.println(students.pop() );
		   System.out.println(students);
	}

}
