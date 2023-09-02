package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(12,23,45,56,78,89,10,25,30);
		System.out.println("List of numbers:");
		System.out.println(list);
		
		System.out.println("Sorted List:"+list.stream().sorted().collect(Collectors.toList()));

}
}
