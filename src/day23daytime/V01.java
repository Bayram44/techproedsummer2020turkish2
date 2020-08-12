package day23daytime;

import java.util.Scanner;

public class V01 {

	public static void main(String[] args) {

		/*
		  Varargs : (Variable Arguments) Varargs normalde bir array'dir. Ama uzunlugu kullanicinin girdigi deger sayisina göre buyur.
		  
		  Not : Varargs ipsiz bir kuyu gibidir icine ne atarsaniz sonsuza kadar kabul eder.
		  1) Varargs dan sonra baska paramaetre kullanilamaz Varargs method parantezi icerisinde her zaman en zonda olmak zorundadir.
		  2) Varargs parantez icinde son parametre olduktan sonra Varargs öncesinde Varargs olmayan parametreler kullanilabilir.
		  3) bir method parantzinin icinde sadece 1 tane Varargs kullanilir.
		  
		 */

		
		add(3,5);//8
		add(3,5,7);//15
		add(3,5,7,9,11,13,15,17);//80
		
		product(1,2,3,4,5,6);
		
		karakter('b','a','y','r','a','m');
	}
	
	public static void add(int s1,int s2) {
		System.out.println("ilk "+ (s1+s2));
		
	}
	public static void add(int s1,int s2, int s3) {
		System.out.println(s1+s2+s3);
	}
	
	
	public static void add(int...x) {
		int sum=0;
		for (int w : x) {
			sum=sum+w;
		}
		System.out.println(sum);
	}
	
	public static void product (int...y) {
		int pro=1;
		for (int w : y) {
			pro=pro*w;
		}System.out.println(pro);
		
		/* homework
		 kelimenin harflerini alip onlari giris sirasina göre birlestirerek ekrana basan bir program yaziniz.Varargs kullanmak zorundasiniz.
		*/

	}
	public static void karakter(char...c) {
		for (char w : c) {
			System.out.print(w);
		}
	}

}
