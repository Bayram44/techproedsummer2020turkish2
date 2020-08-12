package day31abstraction;
/*
	Soru 1) Abstract nedir?
	Cevap 1) "abstract" soyut demektir, zit anlamlisi "concrete" dir. "concrete" somut demektir.
	Soru 2) Abstract class'lardan object uretilir mi?
	Cevap 2) "abstract" class'lardan object uretilemez. Cunku object concrete(somut)'tir ama "abstract" class abstract(soyut)'tur.
	Soru 3) Abstract class olusturmamizin en buyuk sebebi nedir?
	Cevap 3) abstract class olusturarak child class'lari bazi seyleri yapmaya mecbur kilariz. abstract class icerisinde olusturdugunuz 
			 abstract methodlar child class'lar tarafindan uygulanmak zorundadir. yani abstract class icinde olusturcagimiz abstract bir
			 method tum classlar tarafindan (override etmek) kullanilmak zorundadir, Aksi takdirde Compile Time Error olusur.concrete class icine abstract method yazamayiz.
	Soru 4) Abstract class'lar icine abstract olmayan (concrete) method'lar yazilabilir mi?
	Cevap 4) Abstract class'lar icine abstract olmayan (concrete) method'lar yazabiliriz. Bu methodlar child class'lar tarafindan
	 		 istege bagli olarak kullanilabilirler (override etmek zorunda degildirler).
	Soru 5) Abstract method ile Concrete method arasindaki fark nedir?
	Cevap 5) a) Abstract method'un body'si olmaz cunku abstract method soyuttur bu yuzden abstract method'larin body'si Concrete class olan child'larinda olur. 
				Concrete method'un body'si vardir cunku Concrete method somuttur.
			 b) Abstract method'u child class'lar kullanmak zorundadir. Concrete method'u istege bagli olarak kullanilabilirler.
			 c) Abstract method'larda abstract kelimesi kullanilir. Concrete method'larda kullanilmaz.
	Soru 6) Abstract class'lar abstract class'lardaki abstract method'lari override etmek zorunda midir?
	Cevap 6)  abstract child'larin abstract parent'taki abstract method'lari override etme zorunlulugu yoktur.
	 .
	 
	
	
	








*/