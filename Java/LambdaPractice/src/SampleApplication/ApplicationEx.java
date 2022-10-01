package SampleApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ApplicationEx {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
				new Person("charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thoman","Rage",90),
				new Person("His", "Almighty", 76),
				new Person("Her","Almighty",76)
				); 
		List<Person> people2 = Arrays.asList(
				new Person("charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thoman","Cage",90),
				new Person("His", "Almighty", 76),
				new Person("Her","Almighty",76)
				);
		
		//Step 1 : Sort list by last name
		/*
		 * Implementation Based on Anonymous inner Class
		 */
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareToIgnoreCase(o2.getLastName());
			}
		});
		
		/*
		 * Implementation using Lambda with people2 object
		 */
		Collections.sort(people2,(o1,o2)-> o1.getLastName().compareTo(o2.getLastName()));
		
		
		//Step 2 : Print all elements
		System.out.println("**************\nSorted People object by Annonymous Inner Class");
		people.forEach(System.out::println);
		System.out.println("**************\nSorted People object by Lambda");
		people2.forEach(System.out::println);
		
		//Step 3 : Create a method to print all element and reusable to print all object with last name staring with c
		
		//1. Printing Name starting with c
		System.out.println("****************\nPrinting Last name starting with C : ");
		printConditionally(people2, (p) -> p.getLastName().startsWith("C"));
		
		//2 Print all
		System.out.println("***************\nPrinting all : ");
		printConditionally(people2, (p) -> true );
		
		
	}
	
	public static void printConditionally(List<Person> peoples, Condition condition) {
		for(Person people : peoples) {
			if(condition.check(people))
				System.out.println(people);
		}
	}
	
	@FunctionalInterface
	interface Condition{
		boolean check(Person p);
	}

}
