package StreamApi;

import java.util.Arrays;
import java.util.List;

public class StartWithOne {
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(12,23,45,56,78,89,10,25,30);
		System.out.println("List of numbers:");
		System.out.println(list);
		
		System.out.println();
		System.out.println("Numbers Starts with 1:");
		list.stream().map(s -> s+"").filter(s->s.startsWith("1")).forEach(a-> System.out.print(a+" "));
	}

}
