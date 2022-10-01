package lambdaAss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Q6 {
	public static List<String> replaceUppertoLower(List<String> li, UnaryOperator<List<String>> behaviour){
		return behaviour.apply(li);
	}
	
	public static void main(String[] args) {
		List<String> li = Arrays.asList("dfsdfsfdg","dfdsafgad","dfsdfgsdrrTt","Assdfdfs","aDFdfdf");

		li = replaceUppertoLower(li, (liStr)-> {liStr.replaceAll(String::toUpperCase); return liStr;});

		li.forEach(System.out::println);
	}
}
