package HomeWork1Dop;

import java.util.Scanner;

public class PerevorotChisla {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		while (x > 0) {
		int a = x % 10 ;
		System.out.print(a);
		x= x / 10;
		
		}
	
	}}


