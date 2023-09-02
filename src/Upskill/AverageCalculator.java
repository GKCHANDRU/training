package Upskill;
import java.util.ArrayList;
import java.util.List;

public class AverageCalculator {
	public static void main (String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(15);
		numbers.add(25);
		numbers.add(35);
		numbers.add(45);
		numbers.add(55);
		
		double average =calculateAverage(numbers);
		System.out.println("Average:"+average);
	}
	public static double calculateAverage(List<Integer>numbers) {
		return numbers.stream()
				.mapToDouble(Integer::doubleValue)
				.average()
				.orElse(0.0);
	}
	

}
