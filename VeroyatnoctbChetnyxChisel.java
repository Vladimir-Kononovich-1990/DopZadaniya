package HomeWork1Dop;

import java.util.Random;
import java.util.Scanner;

public class VeroyatnoctbChetnyxChisel {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int a = 1;
		
		System.out.print("¬веди количество случайных чисел");
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		Random rnd = new Random();
	
		while (a <= k) {
		int x= rnd.nextInt(100);
		//System.out.println(x);
		if (x % 2 == 0) { 
			i++;}
	    if (x % 2 != 0) {
				j++;}
		a++;
		}
		//System.out.println("chet " +i);
		//System.out.println("nechet "+j);
		
		System.out.println("¬еро€тность выпадение четных чисел составл€ет " +i+ " из "+ k+ " вариантов");
		
	}

}
