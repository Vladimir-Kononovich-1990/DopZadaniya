package HomeWork1Dop;

import java.util.Scanner;

public class ChetNechetCifry {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int a = 0;
		int cifr;
		System.out.print(">>");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		while (x > 0) {
			cifr = x % 10;
			if (cifr % 2 == 0 ) {
				i++;}
			else j++;
			x /=10;
			a++;
		}
		if (i == a) {
			System.out.println("��� ����� ������");
			}
		if (j == a) {
			System.out.println("��� ����� ��������");	
		}
		if (i !=a && j !=a) {
	 System.out.println("���������� ������ ���� = "+i);
	 System.out.println("���������� �������� ���� = "+j);
	 //System.out.println(a);
		}
      }
	}
		
		
		
		
		

	


