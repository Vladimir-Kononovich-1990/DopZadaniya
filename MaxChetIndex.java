package HomeWork1Dop;

import java.util.Random;
import java.util.Scanner;

public class MaxChetIndex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("введи количество элементов массива");
		
		int kol = scanner.nextInt();
		
		int [] mass = new int [kol];
		Random rnd = new Random();
		int maxIndex = 0;
        
		for (int i = 0; i< kol; i++) {
			mass[i] = rnd.nextInt(100);
			System.out.print(mass[i]+" ,");
		if ((i % 2 == 0) && (mass[i] > maxIndex )) {
			maxIndex = mass [i];
			
			}
		
		}
		System.out.println();
		System.out.println(maxIndex);
	}
}
