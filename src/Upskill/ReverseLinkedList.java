package Upskill;

import java.util.LinkedList;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Ganga");
		list.add("Yamuna");
		list.add("Narmada");
		
		System.out.println("Given List element : ");
		System.out.println(list);
		
		System.out.println("List element in Reversed Order: ");
		for(int i=list.size()-1; i>=0; i--) {
			System.out.println(list.get(i));
		}
	}

}
