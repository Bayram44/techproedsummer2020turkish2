package day05incrementdecrement;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		// kullanicidan aldiginiz  3 basamakli sayinin rakamlari toplamini ekrana yazdiriniz.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int num =scan.nextInt();
		
		int birBa=num%10;
		int a=num/10;
		int onBa=a%10;
		int yuzBa=num/100;
		
		System.out.println("Girdiginiz sayinin rakamlari toplami ="+(birBa+onBa+yuzBa));
		scan.close();

	}

}
  