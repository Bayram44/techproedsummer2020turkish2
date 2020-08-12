package day15constructors;

import java.util.Scanner;

public class Araba {
	
	int yil=2019;
	String marka="Toyota";
	String model="Rav4";
	int fiyat=20000;
	
	Araba (String marka,String model,int yil,int fiyat){
		this.fiyat=fiyat;
		this.marka=marka;
		this.model=model;
		this.yil=yil;
	}
	
	Araba(String model,int fiyat){
		this.model=model;
		this.fiyat=fiyat;
	}
	Araba(){
		
	}

	public static void main(String[] args) {
		
		Araba a1=new Araba();
		System.out.println("Fiyat = "+a1.fiyat);//20000
		System.out.println("Marka = "+a1.marka);//Toyota
		System.out.println("Model = "+a1.model);//Rav4
		System.out.println("Model yili = "+a1.yil);//2019
		a1.hizlanma();
		a1.tuketim();
		
		System.out.println("=========================");
		Araba a2=new Araba("Corolla",12000);
			
		System.out.println("Fiyat = "+a2.fiyat);//12000
		System.out.println("Marka = "+a2.marka);//Toyota
		System.out.println("Model = "+a2.model);//Corolla
		System.out.println("Model yili = "+a2.yil);//2019
		a1.hizlanma();
		a1.tuketim();
		System.out.println("=========================");
		Araba a3=new Araba("Skoda","Kodiac",2019,24000);
		System.out.println("Fiyat = "+a3.fiyat);
		System.out.println("Marka = "+a3.marka);
		System.out.println("Model = "+a3.model);
		System.out.println("Model yili = "+a3.yil);
		a1.hizlanma();
		a1.tuketim();
	}
	public void hizlanma() {
		System.out.println("7sn'de 100km/saat'e ulasir");
	}
	
	public void tuketim() {
		System.out.println("Km'de 0.1 dolar yakar");
	}

}
