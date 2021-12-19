package HomeWork1Dop;

import java.util.Scanner;

public class DiapazonAB {

	public static void main(String[] args) {
		
		System.out.println("Введи диапазоны А и В , а также шаг");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		for( int i = a; i<=b; i=i+c) {
			System.out.println(i);
		}
		
	}

}
