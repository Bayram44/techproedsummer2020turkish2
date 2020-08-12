package day09nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		   /*
        Kullanici ay ismini girince o ayin mevsimini ekrana yazdirin
       */
       
       //Not: Switch'lerde boolean, float, double, long kullanilmaz.
       //     char, byte, short, int, String kullanilir
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir ay ismi giriniz");
		String ay=scan.next().toLowerCase();
		
		switch (ay){
		case "aralik":
		case "ocak":
		case "subat":
			System.out.println("Kis");
			break;
		case "mart":
		case "nisan":
		case "mayis":
			System.out.println("Ilk bahar");
			break;
		case "haziran":
		case "temmuz":
		case "agustos":
			System.out.println("Yaz");
			break;
		case "eylul":
		case "ekim":
		case "kasim":
			System.out.println("Sonbahar");
			break;
			default:
				System.out.println("Gecerli bir ay ismi giriniz");
		}
		scan.close();
	}

}
