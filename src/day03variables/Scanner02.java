package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		/*Kullanicidan tam ismini alin ekrana yazin
		  Kullanicidan yasini alin ekrana yazin
		  Kullanicidan isminin ilk harfini alin ve ekrana yazin
		  kullanicinin cocuk sayyisini byte ile aliniz
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen tam isminizi giriniz");
		String name=scan.nextLine();
		System.out.println(name);
		
		System.out.println("Lutfen yasiniz giriniz");
		byte age=scan.nextByte();
		System.out.println(age);
		
		System.out.println("Lutfen isminiziz ilk harfini giriniz");
		char ilkHarf=scan.next().charAt(0);
		System.out.println(ilkHarf);
		
		System.out.println("Lutfen cocuk sayisini giriniz");
		byte cocukSayisi=scan.nextByte();
		System.out.println(cocukSayisi);
		
		scan.close();
	}

}
