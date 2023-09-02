package Upskill;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringConverter {
	public static void main(String[] args) {
		List<String> words= new ArrayList<>();
		words.add("Hello");
		words.add("WoRLd");
		words.add("Java");
		words.add("StreAms");
		
		List<String> lowercaseWords = convertToLowerCase(words);
		
		List<String> uppercaseWords = convertToUpperCase(words);
		
		System.out.println("Orginal List:"  +words);
		System.out.println("Lowercase List:" +lowercaseWords);
		System.out.println("Uppercase List:" +uppercaseWords);
	}
	public static List<String> convertToLowerCase(List<String>inputList){
		return inputList.stream().map(String::toLowerCase).collect(Collectors.toList());
	}
	
	public static List<String> convertToUpperCase(List<String>inputList){
		return inputList.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
}
