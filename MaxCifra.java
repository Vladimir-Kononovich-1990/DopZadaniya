package HomeWork1Dop;

import java.util.Scanner;

public class MaxCifra {

	
	public static void main(String[] args) {
	    
		System.out.println(">>");
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		final int y = x;
		int max; 
		int i = 0;
		
		while( x > 0) {
			max = x % 10;
			if (max > i) {
				i = max;	
			}
				
			x /=10;
		}
	 System.out.println("Максимальная цифра числа " +y+ " = "+ i);		
	}

}
