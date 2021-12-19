package HomeWork1Dop;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DvaNaim {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("введи количество элементов массива");
		
		int kol = scanner.nextInt();
		
		int [] mass = new int [kol];
		Random rnd = new Random();
		int min = 0 ;
		int j = 0;
        
		for (int i = 0; i< kol; i++) {
			min = mass[0] ;
			mass[i] = rnd.nextInt(100);
			System.out.print(mass[i]+" ");}
			
			for (int i = 0; i < kol; i++) {
				if (mass[i] < min ) {
			
				min = mass[i];
				j = i;
			}
			}

			System.out.println();
			System.out.println(min+" s indexom "+ j);
			int []mass1 = new int [kol];
			
			
			
			
			/*min= mass[0];
		    min = Math.min(min,mass[i]);*/
			
				
	  
}
}