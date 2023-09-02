package Upskill;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> integer = Arrays.asList(1,3,5,8,3,12,5);
		integer.stream()
			.collect(Collectors.toSet())
			.forEach(System.out::println);
	}

}
