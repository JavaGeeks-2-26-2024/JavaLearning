package com.leaning.day8and9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class IteratorIntro {

	public static void main(String[] args) {
	
		
	// it is used to read data from all the collection implementation classes.
		
//		 we can read and remove the data using iterator.
//   hasNext()
//   next();
//	 remove();
		
		
	ArrayList<String>   names = new ArrayList<String>();
		
		names.add("joy");
		names.add("ana");
		names.add("kim");
		names.add("jack");
		
        Iterator<String> itr = names.iterator();
		      
		   System.out.println(itr.hasNext());   // it will check weather it has next element or not
		   System.out.println(itr.next());    // value of next element
		   
		   while(itr.hasNext()) {
			   
			   System.out.println(itr.next());
			   
		   }
		   
		 
		   
		   HashMap<String, Integer> personsAgeMap = new HashMap<String, Integer>();
			
			
			personsAgeMap.put("adam", 24);
			
			personsAgeMap.put("ana", 21);
			personsAgeMap.put("joy", 32);
			personsAgeMap.put("roy", 43);
			personsAgeMap.put(null, 55);
			
			
			Iterator<String>  itr2 =   personsAgeMap.keySet().iterator();
			
			while(itr2.hasNext()) {
				System.out.println(personsAgeMap.get(itr2.next()));
			}
			
			Iterator<Map.Entry<String, Integer>> entryItr = personsAgeMap.entrySet().iterator();
			
			while(entryItr.hasNext()) {
				
				
				System.out.println(entryItr.next());
			}
			

	}

}
