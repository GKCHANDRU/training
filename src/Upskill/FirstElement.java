package Upskill;

import java.util.Arrays;
import java.util.List;

public class FirstElement {
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(12,23,45,56,78,89,10,25,30);
		System.out.println("List of numbers:");
		System.out.println(list);
		
		System.out.println();
		System.out.println("First Element of List:");
		System.out.println(list.stream().findFirst().orElse(null));

}
}
