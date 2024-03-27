package com.leaning.day8and9;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetIntro {

	public static void main(String[] args) {
	  
		
//		Set 
//		   1. Hashset         uses => 1D array
//		   2. LinkedHashSet   uses => HashFunction
//		   3. TreeSet         uses => Red black trees
		
//		 => venn - diagrams
		
//		 => union , intersection
		
//		   Set<Datatype>   variableName = new HashSet<Datatype>();

//		    all the items are unique
		
		
		
//		1. Hashset
		Set<String>   set1 = new HashSet<String>();
		set1.add("adam");
		set1.add("joe");
		set1.add("roy");
		System.out.println(set1);
		Set<String>   set2 = new HashSet<String>();
		
		set2.add("kim");
		set2.add("jack");
		set2.add("roy");
		System.out.println(set2);
		
//		set1.retainAll(set2); // intersection of set1 and set2 and its stores in set1
//		
//		
//		
//		System.out.println( set1);
		
		set1.removeAll(set2); // intersection of set1 and set2 and its remove from set1
		
		System.out.println(set1);
		
		// hashset does not follow the insertion order
		
		// ------------------------------------------------------------------------------------------------------
		
		// LinkedHashSet
		
		// LinkedHashSet maintains the insertion order
		
		//  it needs more memory then hashset
		
		// ------------------------------------------------------------------------------------------------------
		
//		3. TreeSet - class , sorted set is a interface
		
//		 Balanced Binary Tree
		
//		 time complexity - O(log(n))
		
		
//		SortedSet<datatype> variableName = new TreeSet<datatype>();
		
		
		SortedSet<Integer> set5 = new TreeSet<Integer>();

		set5.add(40);
		set5.add(50);
		set5.add(100);
		set5.add(10);
		set5.add(20);
		set5.add(30);
		
		
		Set<Integer> subset = set5.subSet(20, 40);
		
		
		System.out.println(set5);
		
		System.out.println(subset);
		
		System.out.println(set5.tailSet(40));
		
		
		System.out.println(set5.headSet(40));
		
		System.out.println(set5.first() );
		
		
		System.out.println(set5.last());
		
//		hashSet                                 LinkedHashSet                        treeSet
//		uses arrays                             linkedList                    balancedBinary trees
//		we can achive O(1)                         O(1)                             O(log(n))
//		worst case run time is  O(log(n))         O(log(n))                         O(log(n))
//		can store null values                  can store null values            can not store null values
//		dowsnot follow insertion order        follows insertion order             follows sorting order
		
		
	}

}
