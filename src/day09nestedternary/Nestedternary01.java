package day09nestedternary;

import java.util.Scanner;

public class Nestedternary01 {

	public static void main(String[] args) {
		/*	Kullanicidan bir sayi alin
		 Sayi pozitif ise 9 dan buyukmu diye kontrol edin
		 9 dan buyuk ise "Sayi" degilse "Rakam" yazdirin
		 Sayi pozitif degilse 0 mi diye kontrol edin
		 o ise "Rakam" degilse "Negatif sayi" yazdirin
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int num=scan.nextInt();
		
		String result=num>0?num>9?"Sayi":"Rakam":num==0?"Rakam":"Negatif Sayi";
		System.out.println(result);
		scan.close();
		
	}

}
