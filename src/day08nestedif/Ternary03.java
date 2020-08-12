package day08nestedif;

import java.util.Scanner;

public class Ternary03 { 

	public static void main(String[] args) {
		/*Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
			Diğer durumlarda ekrana “Harf değil” yazdırın.
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen bir karakter giriniz");
		char ch=scan.next().charAt(0);
		
		boolean sonuc =(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z');
		
		String result= sonuc?"Harf":"Harf degil";
		System.out.println(result);
		scan.close();
	}

}
