package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın 
		 Eğer üç kenar uzunluğu birbirine eşit ise ekrana “Eşkenar üçgen” yazdırın. 
		 Diğer durumlarda ekrana “Eşkenar değil” yazdırın.
		 Ternary ile cozun
		*/

		
		Scanner scan =new Scanner (System.in);
		System.out.println("Ucgenin kenar uzunluklarini giriniz ");
		byte k1=scan.nextByte();
		byte k2=scan.nextByte();
		byte k3=scan.nextByte();
		
		
		String sonuc =(k1==k2&&k1==k3)? "Eskenar ucgen":"Eskenar ucgen degil";
		System.out.println(sonuc);
		scan.close();
	}

}
