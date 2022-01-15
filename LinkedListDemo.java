package com.ankita.javaprogram;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		
		// adding elements to linked list
		
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		ll.add("five");
		ll.add("three");
		ll.add("seven");
		ll.add("four");
		ll.add("nine");
		ll.add("ten");
		
		System.out.println("\n Elements in linked list: "+ ll);
		Iterator it= ll.iterator();
		// printing elementa from linked list
		System.out.println("\n printing each element from linked list");
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		// printing elements in reverse order
		it=ll.descendingIterator();
		System.out.println("\n Printing each element in reverse order from linked list");
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		//remove first element from the linked list
		System.out.println("\n elements in linked list: "+ ll);
		ll.removeFirst();
		System.out.println("After removing first element: "+ ll);
		
		// remove last element from linked list
		System.out.println("\n elements in linked list: "+ll);
		ll.removeLast();
		System.out.println("After removing last element: "+ ll);
		
		//remove first occurance of element in linked list
		System.out.println("\n elements in linked list: "+ll);
		ll.removeFirstOccurrence("four");
		System.out.println("After removing first occurance of element in linked list : "+ ll);
		
		//remove last  occurance of element in linked list
				System.out.println("\n elements in linked list: "+ll);
				ll.removeLastOccurrence("three");
				System.out.println("After removing last occurance of element in linked list : "+ ll);
				//copy of linked list
				ll.clone();
				System.out.println(ll);
		
		//clearing linked list
				ll.clear();
				System.out.println("\n element in linked list: "+ll);
				
				
	}

}
