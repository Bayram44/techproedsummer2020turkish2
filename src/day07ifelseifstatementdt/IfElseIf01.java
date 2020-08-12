package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf01 {
	
	public static void main (String [] args) {
		/*Kullanicidan sayi alin
		 Sayi sifirdan buyuk ise ekrana "Pozitif" yazdirin
		 Sayi sifir ise ekrana "Notr" yazdirin
		 Sayi sifirdan kucuk ise ekrana "Negatif" yazdirin
		*/
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double num=scan.nextDouble();
		
		if (num>0) {
			System.out.println("Pozitif");
		}else if (num==0) {
			System.out.println("Nötr");
		}else {
			System.out.println("Negatif");
		}
		scan.close();
	}

}
