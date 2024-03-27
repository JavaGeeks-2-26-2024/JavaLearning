package com.learning.java.AdvancedJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.management.RuntimeErrorException;

public class StreamsExamples {

	public static void main(String[] args) {
		List<String> mylist = Arrays.asList("Affenpinscher", "Affenpinscher","Afghan Hound", "Aidi", "Alano Español",
				"Alaskan Klee Kai", "Alaskan Malamute", "Bullenbeisser", "Bullmastiff", "Bully Kutta", "Burgos Pointer",
				"Cairn Terrier", "Canaan Dog", "Canadian Eskimo Dog", "Cane Corso", "Caucasian Shepherd Dog",
				"Istrian Shorthaired Hound","Istrian Shorthaired Hound", "Italian Greyhound", "Jack Russell Terrier", "Jagdterrier", "Jämthund",
				"Kai Ken", 	"Kai Ken",  "Kaikadi","Kaikadi", "Tweed Water Spaniel", "Tyrolean Hound", "Vizsla", "Volpino Italiano",
				"Weimaraner", "Welsh Sheepdog", "Welsh Springer Spaniel", "Welsh Terrier");
        // to create a straem
		Stream<String> myStream = mylist.stream();
		
		// without :: 
		// list to be take only animals that starts with "A" and make it uppercase 
		 mylist.stream()
			   .filter(animal-> animal.startsWith("A"))
			   .map(s -> s.toUpperCase())
			   .forEach(s -> System.out.println(s));
		System.out.println("-------------------------------");
		// :: this is known as the java reference operator. 
		// with ::
		 mylist.stream()
		 .filter(animal-> animal.startsWith("A"))
		   .map(String::toUpperCase)
		   .forEach(System.out::println);
	
		 // intermediate operations
		 // Filter 
         //	Map 
		 // sorted 
		 // distinct
		 
		 
		 // Terminal Operations
		 // forEach
		 mylist.stream()
		 .filter(animal-> animal.startsWith("A"))
		   .map(String::toUpperCase)
		   .forEach(System.out::println);
		 // collect
		 List<String> animalsStartsWithA = 	 mylist.stream()
				 .filter(animal-> animal.startsWith("A"))
				   .map(String::toUpperCase)
				   .collect(Collectors.toList());
		 System.out.println(animalsStartsWithA);
		 // reduce 
		String statement = 	 mylist.stream()
				 .filter(animal-> animal.startsWith("A"))
				   .map(String::toUpperCase)
				   .reduce("this is mylist of Animals as ", (a, b)-> a+","+b);
	    //  count
		long animalCount = 	 mylist.stream()
				 .filter(animal-> {return animal.startsWith("A");})
				   .map(String::toUpperCase)
				   .count();
		System.out.println(animalCount);
		
		System.out.println(statement);
		
		
//		Exception Handling 
		
		 List<String> animalsStartsWithB = 	 mylist.stream()
				 .filter((animal)-> {
					 try {
						return animal.startsWith("B") ;
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				 })
				   .map(String::toUpperCase)
				   .collect(Collectors.toList());
		 System.out.println(animalsStartsWithA);
		
	}

}
