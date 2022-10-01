package lambdaAss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Q2 {
	public static List<Data> filter(List<Data> listData,Function<List<Data>, List<Data>> behaviour){
		return behaviour.apply(listData);
	}
	public static void printList(List<Data> listObj) {
		for(Object obj : listObj ) {
			System.out.println(obj);
		}
	}
	
	public static void main(String[] args) {
		List<Data> listData = Arrays.asList(
				new Data(100000,"REJECTED"),
				new Data(2000,"ACCEPTED"),
				new Data(30000,"ACCEPTED"),
				new Data(5000,"PENDING"),
				new Data(2015662, "ACCEPTED")
				);
		System.out.println("Printing whole List : ");
		
		printList(listData);
		
		List<Data> filtered = filter(listData, (li)->{
			List<Data> filteredList = new ArrayList<>();
			li.forEach((data)->{
				if(data.totalPrice>10000 && data.status.equals("ACCEPTED"))
					filteredList.add(data);
			});
			return filteredList;
		});
		
		System.out.println("***************\nFiltered Data : ");
		printList(filtered);
	}
}

class Data {
	public int totalPrice;
	public String status;
	public Data(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Data [totalPrice=" + totalPrice + ", status=" + status + "]";
	}
	
}