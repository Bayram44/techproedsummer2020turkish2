package day23daytime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		// anlik tarih nasil alinir.
		LocalDate ld=LocalDate.now();// bu method suan ki tarihi ureten bir methoddur.
		
		System.out.println(ld);
		
		//ileri tarihler ekrana nasil yazdiririz.
		
		System.out.println(ld.plusDays(275));//gun
		System.out.println(ld.plusMonths(3));//ay
		System.out.println(ld.plusYears(3));//yil
		//Geri tarihler ekrana nasil yazdiririz.
		System.out.println(ld.minusDays(34));//gun
		System.out.println(ld.minusMonths(6));// ay
		System.out.println(ld.minusYears(4));// yil 
		
		// tarihi nasil farkli formatta yazdirabiliriz.
		//MM ==> kacinci ay     MMM==> Ayin ilk u harfi 		MMMM==> ayin isminin tamami
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(dtf1.format(ld.plusMonths(1)));
		
		// d ==> 10 dan kucuk gunler icin tek rakam 10 ve ustu gunler icin 2 rakam basamak yazar.
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM.d.yyyy");
		System.out.println(dtf2.format(ld));
		
		
	}

}
