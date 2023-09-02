package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedListinDecOrder {
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(12,23,45,56,78,89,10,25,30);
		System.out.println("List of numbers:");
		System.out.println(list);
		
		System.out.println("Sorted List in Dec order:"+list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
}
}
