package StreamApi;

import java.util.Arrays;
import java.util.List;

public class CubeofElements {
public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(12,23,45,56,78,89,10,25,30);
		System.out.println("List of numbers:");
		System.out.println(list);
		
		list.stream().forEach(a-> System.out.print((a*a*a)+","));

}
}