package HomeWork1Dop;

import java.util.Scanner;

public class Fibonachichi {

	public static void main(String[] args) {
	int n0 = 0;
	int n1 = 1;
	int n2;
	
	System.out.print("Сколько элементов необходимо вывести на экран?");
	Scanner scanner = new Scanner(System.in);
	int  k = scanner.nextInt();
	
	for(int i = 0; i < k; i++){
		n2=n0+n1;
		System.out.print(n2+" ");
		n0=n1;
		n1=n2;
		}
	}
}
	