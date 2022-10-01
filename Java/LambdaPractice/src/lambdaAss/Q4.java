package lambdaAss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {
	public static void main(String[] args) {
		// create an ArrayList which going to
        // contains a list of Numbers
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
  
        // Add Number to list
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);
  
        // apply removeIf() method
        // we are going to remove numbers divisible by 3
        Numbers.removeIf(n -> (n % 3 == 0));
  
        // print list
        for (int i : Numbers) {
            System.out.println(i);
        }
		
		
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("dfdzdf");
		stringList.add("dfss");
		stringList.add("adfd");
		stringList.add("dfdasda");
		stringList.add("dfvadfd");
		
		ArrayList<Integer> listInt =new ArrayList<>();
		listInt.add(1);
		listInt.add(3);
		listInt.add(4);

		System.out.println("*********************\nPrinting whole list : ");
		for(String str : stringList)
			System.out.println(str);
		
		
		stringList.removeIf(str -> {
			if((int)str.length() % 2 !=0)
				return true;
			return false;
		});
		System.out.println("*********************\nRemoved odd length Item : ");
		for(String str : stringList)
			System.out.println(str);
		
	}
}
