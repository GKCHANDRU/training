package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxValueofList {
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(12,23,45,56,78,89,10,25,30);
		System.out.println("List of numbers:");
		System.out.println(list);
		
		System.out.println("Max value:"+list.stream().max(Comparator.naturalOrder()).get());

}
}
