package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	public static void main(String[] args) {
	
	List<Integer>list=Arrays.asList(12,23,45,56,78,89,10,25,30);
	System.out.println("List of numbers:");
	System.out.println(list);
	
	System.out.println("Even numbers from list:");
	
	System.out.println(list.stream().filter(n->n%2==0).collect(Collectors.toList()));
	System.out.println();
	System.out.println("Count of even numbers:" +list.stream().filter(n->n%2==0).count());
	System.out.println("Count of odd numbers:" +list.stream().filter(n->n%2!=0).count());

}
}
