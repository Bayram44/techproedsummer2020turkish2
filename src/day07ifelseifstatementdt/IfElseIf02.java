package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/* Kullanicidan bir harf alin 
		   Bu harf 'a' veya 'A' ise ekrana ilk harf
		   Bu harf 'b' veya 'B' ise ekrana ikinci harf
		   Bu harf 'c' veya 'C' ise ekrana Ucuncu harf
		   Diger harfler icin sirasini bilmiyorum yazdirin.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir harf giriniz");
		char harf =scan.next().charAt(0);
		
		if (harf=='a'||harf=='A'){
			System.out.println("Ilk harf");
		}else if (harf=='b'||harf=='B') {
			System.out.println("Ikinci harf");
		}else if (harf=='c'||harf=='C') {
			System.out.println("Ucuncu harf");
		}else {
			System.out.println("Sirasini bilmiyorum");
		}
		scan.close();
	}

}
