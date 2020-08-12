package day09nestedternary;

import java.util.Scanner;

public class Nestedternary02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		 Ucu birbirine esitse ucgenin cevresini kontrol edin
		 Cevre 30 dan buyuk ise "Ne buyuksun!" yazdirin degilse "Normal" yazdirin
		 Ucu birbirine esit degilse ucgenin cevresini kontrol edin
		 Cevre 20 den kucuk ise "Ne kucuksun!" yazdirin degilse "Normal" yazdirin
		*/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
		int k1=scan.nextInt();
		int k2=scan.nextInt();
		int k3=scan.nextInt();
		int cevre=k1+k2+k3;
		
		String result=k1==k2&&k2==k3?cevre>30?"Ne buyuksun":"Normal1":cevre<20?"Ne kucuksun":"Normal2";
		System.out.println(result);
		scan.close();

	}

}
