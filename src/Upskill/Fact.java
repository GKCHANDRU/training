package Upskill;

public class Fact {
	
	public static void main(String[] args) {
		int fact=1;
		int n=3;
		int i=1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of given number:"+fact);
		
	}
}
	