package day05incrementdecrement;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/* sayilari kullanicidan alarak 
		 * iki tane int variable olusturun a=5 b=3 gibi
		 * onra bu integerlerin degerlerinin yerlerini ddegistirin.
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen degistirilecek ilk sayiyi giriniz");
		int num1=scan.nextInt();
		System.out.println("Lutfen degistitilecek ikinci sayiyi giriniz");
		int num2=scan.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		int gecici =num1;
		num1=num2;
		num2=gecici;
		System.out.println();
		System.out.println(num1);
		System.out.println(num2);

			scan.close();
	}

}
