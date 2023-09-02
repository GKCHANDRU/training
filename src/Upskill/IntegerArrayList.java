package Upskill;

import java.util.ArrayList;

public class IntegerArrayList {
	
	int sum(ArrayList<Integer> list) {
		int result =0;
		for(int i=0; i<list.size(); i++){
			result = result+list.get(i);
		}
		return result;
	}
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		
		System.out.println("List elements : ");
		System.out.println(list);
		
		IntegerArrayList arr = new IntegerArrayList();
		System.out.println("Sum of integer :" +arr.sum(list));
		
	}

}
