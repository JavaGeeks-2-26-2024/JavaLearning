package com.leaning.day8and9;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsIntro {

	public static void main(String[] args) {
	 
		
//		Maps    => key and value pairs  => pair is know as entry
//		   1. HashMap 
//		   2. Linked Hash Map
//		   3. Tree Map
		
//		 aim to reach O(1) 
		
//		                                                            balanced Binary Trees 
//		 arrays      >        Binary Trees           >            Avl Trees and Red black Trees     >          hash functions to reach
//		  O(n)                 O(log(n)) -> not 100%                      O(log(n))                                O(1)
		
		
//	 we want all the operations to be O(1)	
		
	
// Hash function => it defines the releationship between keys and the memory index.
	
		
//		Collisions is inserting multiples key values into single memeory index.
	

		
//		                             avg case                   worst case
		//      search                 O(N)                       O(N)
//		        insertion              O(1)                       O(N)
//		         deletion              O(1)                       O(N)
		
		
		
		
		// HashMap :
		
//		HashMap<keyDatatype, ValueDatatype>    variableName = new HashMap<keyDatatype, ValueDatatype>();
		
		HashMap<String, Integer> personsAgeMap = new HashMap<String, Integer>();
		
		
		personsAgeMap.put("adam", 24);
		
		personsAgeMap.put("ana", 21);
		personsAgeMap.put("joy", 32);
		personsAgeMap.put("roy", 43);
		personsAgeMap.put(null, 55);
		
		System.out.println(personsAgeMap);
		
		System.out.println(personsAgeMap.get("roy"));
		
		for(String key : personsAgeMap.keySet()) {
			
			System.out.println(key);
			System.out.println(personsAgeMap.get(key));
		}
		
		
		for(Map.Entry<String, Integer> entry : personsAgeMap.entrySet()) {
			
			System.out.println(entry.getKey() + "  "+ entry.getValue());
			
		}
		
		
		// Hashmap will accept null as keys 
		// hashmap does not follow the insertion order.
		
		//---------------------------------------------------------------------------------------------
		// LinkedHashMap
		// uses double linked list 
		// needs more memory 
		// Hashmap will accept null as keys 
		// LinkedHashMap follow the insertion order.
		
//		LinkedHashMap<keyDatatype, ValueDatatype>    variableName = new LinkedHashMap<keyDatatype, ValueDatatype>();
		
		//---------------------------------------------------------------------------------------------		
		
		
		// TreeMap -> class => sortedMap interface  => time complexity => O(log(n))
		
		// Balanced Binary trees => AVL trees or Red black trees 
		
//		TreeMap<keyDatatype, ValueDatatype>    variableName = new TreeMap<keyDatatype, ValueDatatype>();
		
		
		TreeMap<Double, String>   prices = new TreeMap<Double, String>();
		// we can store the items in sorted order based on keys
		prices.put( 525.5, "dell");
		prices.put( 112.52, "hp");
		prices.put( 999.99, "mac");
		prices.put(658.26, "asus");

		System.out.println(prices);
		
		System.out.println(prices.firstKey());
		
		System.out.println(prices.lastKey());
		
//		                   hashMap                                   LinkedHashMap                                TreeMap
		
//		                  uses Arrays                               doubleLinkedList                       Balanced binary tree                 
		
// 	best case             can achive O(1)                           can achive O(1)                         O(log(n))   => 100%
		
// 	worst case	            O(log(n))                                    O(log(n))                               O(log(n)) 
		
//		                we can store null values                    we can store null values                we can not store null values
		
//                      does not follow insertion order            does follow insertion order               does follow sorting order
	}

}
