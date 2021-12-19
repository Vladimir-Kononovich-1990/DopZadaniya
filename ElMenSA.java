package HomeWork1Dop;

import java.util.Random;
import java.util.Scanner;

public class ElMenSA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("введи количество элементов массива");
		
		int kol = scanner.nextInt();
		
		int [] mass = new int [kol];
		Random rnd = new Random();
		double sredA = 0;
        
		for (int i = 0; i< kol; i++) {
			mass[i] = rnd.nextInt(10);
			System.out.print(mass[i]+" ");
			sredA = sredA + mass[i];
		}
		sredA = sredA/kol;
		System.out.println();
		System.out.println(sredA);
		for (int j = 0; j < kol; j++) {
			if (mass[j] < sredA) {
				System.out.print(mass[j]+" ");
			}
		}
			
	}

}
