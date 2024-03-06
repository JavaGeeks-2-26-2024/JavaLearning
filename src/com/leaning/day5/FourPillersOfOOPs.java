package com.leaning.day5;



public class FourPillersOfOOPs {

	public static void main(String[] args) {
	
//		1. Encapsulation
//		2. Inheritance 
//		3. Polymorphism
//		4. Abstraction
		
		
//		Encapsulation :
		
//		     Encapsulation, is to make sure that "sensitive" data is hidden from the users.
//		      1. declear class variables/attributes as private.
//		      2. we will create a set or get methods to access or update the values of private variables/attributes 
		Health myhealth = new Health();
	
		     myhealth.setName("xyz");
		     
         String nameOfApplicant = myhealth.getName();
         
         
// 		2. Inheritance      
         
//         it is possible to inherit attributes and methods from one class to another class 
//         1. sub class or child class -> class that inherits from [another class] <-(this will be the parent class or "super class" for this child or sub class)
//                                                                       ^
 //         2. super class or parent ------------------------------------|
         
         
         // using super key word we can access the parent methods or attributes.
//         To inherit from one class to another class , we will use keyword called "Extends"
//         for all the objects in java, parent class is Object class 

//         BankAccount  -> account, routingNumber, name
//         Checkings  - > 
//         Savings    ->

         
//         CheckingsAccount ca= new CheckingsAccount();
//         SavingsAccount  sa = new SavingsAccount();
         
         
//         1. Single Inheritance       A -> B
//         2. Multi-level  Inheritance     A->B -> C
//         3. Multiple Inheritance      A ->  B,C 
//              Classes does not support Multiple Inheritance

//         4. Hierarchical Inheritance                  
//         5. Hybrid Inheritance    -> This will alos not work.
         
         
//         3. Polymorphism
         
         
//              Polymorphism  -> Poly -> Many/ Multiple  Morphism => form 
//              Manyforms
         
             
             
             
//             animal   -> sound()   -> this animal makes a sound
//              cat    ->  sound()   -> this cat makes a sound of meow
//              dog    ->  sound()   -> this dog makes a sound of bow
             
             
                                               
         FourPillersOfOOPs oop = new FourPillersOfOOPs();
         oop.createAllAnimals();
         
         
         
//         Abstraction 
//          Abstraction is a process of hiding the certain details and showing only essentional infromation to the user 
//                Abstraction ->hiding the implementation
         
//              1. By using abstract classes 
//              2. Interfaces  
         
         
//         -> abstarct Class -> we will use keyword "abstract"
//               1. we can not create the Object by using of abstarct Class
//               2. Abstract methods can only be used inside a Abstract class  -> abstract methods will not have a body
//               3. Abstract Classes can have both regular methods and abstract methods.
//         4. whatever class that is extending from abstarct Class needs to provide the implementation for abstract methods
         
         Calculator clc = new Calculator();
         System.out.println(clc.getArea(10, 5, "square"));
         
         Triangle tri = new Triangle();
         tri.base=10;
         tri.side=5;
         System.out.println(tri.area());
        
         Plygon py = new Plygon();
         System.out.println(py.area());
         
         
         
	}
	
	
	public void createAllAnimals() {
		Parent p = new Parent();
		Child c = new Child();
		GrandChild gc = new GrandChild();
		p.style();
		c.style();
		gc.style();
		anotherMethod();
	}
	
	public void anotherMethod() {
		System.out.println("its another method");
	}

}
