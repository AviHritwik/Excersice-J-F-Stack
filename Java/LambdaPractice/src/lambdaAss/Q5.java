package lambdaAss;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Q5 {
	public static StringBuilder generate(List<String> strList, Function<List<String>, StringBuilder> behave) {
		return behave.apply(strList);
	}
	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("zfdzdf");
		stringList.add("gfss");
		stringList.add("adfd");
		stringList.add("fdasda");
		stringList.add("dfvadfd");
		StringBuilder strB = new StringBuilder();
		StringBuilder strb =generate(stringList,(strList) -> {
			for(String str : strList)
				strB.append(str.charAt(0));
			return strB;
		});
		System.out.println(strb);
		
		StringBuilder strb2 = new StringBuilder();
		stringList.forEach((str)-> strb2.append(str.charAt(0)));
		System.out.println(strb2);
	}
}
