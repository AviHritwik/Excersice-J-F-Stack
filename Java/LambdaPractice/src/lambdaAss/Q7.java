package lambdaAss;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Q7 {
	public static StringBuilder generate(Map<Integer,String> map, Function<Map<Integer,String>, StringBuilder> behaviour) {
		return behaviour.apply(map);
	}
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(2, "Name");
		map.put(1, "first");
		map.put(3, "last");
		map.put(4, "age");
		
		StringBuilder strb1 = generate(map, (map2)-> {
			StringBuilder strB = new StringBuilder();
			for(Map.Entry<Integer, String> entry : map2.entrySet()) {
				strB.append(entry.getKey()+" : "+entry.getValue()+"\n");
			}
			return strB;
		});
		System.out.println(strb1);
	}
}
