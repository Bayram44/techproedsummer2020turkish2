package day25encapsulation;
/*
	1-) Encapsulation nedir? nicin yapilir?
		Cevap	: Encapsulation olusturulan datayi saklamak(hiding) demektir. Olsuturlan datalar izinsizce okunmamasi ve degistirilmemesi
		icin gizlenir.
	2-) Encapsulation nasil yapilir?
		Cevap	: Encapsulation yapmak icin datanin önune private yazariz.
	3-) Encapsulation nicin acilir?
		Cevap	: Encapsulation bir datanin, baska class'lardan okunmasina ve degistirilmesine izin vermek icin acilir.
	4-) getter () method nedir?
		Cevap	: getter method Encapsulation yapilan bir datanin baska class'lardan okunmasini saglar, gizlenmis bir datanin
		baska class'lardan okunmasini istiyorsak getter method olusturmamiz gerekir. getter () method asagidaki gibi olusturulur.
		
		public int getSifre() {					
		  return sifre;					
	   }
	    Burada Encapsulation yapilan sifre variable'ina getter method olusturulmus böylece bu variable'daki deger baska class'larda görulecek
	5-) getter () method olsuturmak icin dikkat edilmesi gereken hususlar nelerdir?
		Cevap	: Getter Method olusturmak icin
	 				a) Access Modifier public olsun
	 				b) getter methodunun Return Type'i variable'in return type'i ile ayni olsun
	 				c) Isim get + variable ismi seklinde olsun
	 				d) Method'un icinde "return variable ismi" yazilsin
	6-) Encapsulation yapilan dir datanin diger class'lardan okunmasi nasil yapilir?
		Cevap	: Encapsulation yapilan bir datayi getter metodu ile okuyabilicegimizi söylemistik, ancak getter methodu sadece okumaya izin
		verir. Datayi okumak istedigimiz class'tan okuyabilmemiz icin bulundugumuz class'ta bir obje olusturmamiz gerekir. Datayi ancak 
		olusturdugumuz obje uzerinde görebiliriz. Burada dikkat edilmesi gereken husus obje olusturulurken kullanacagimiz class datanin ve
		getter methodunun oldugu class olmalidir yani; A class'inda olustutulan bir datayi B class'indan okumak istiyorsak objeyi olustururken
		A class'indan olusturmaliyiz.
	7-) setter () method nedir?
		Cevap	: setter method Encapsulation yapilan bir datanin baska class'lardan degistirilmesini saglar, gizlenmis bir datanin
		baska class'lardan degistirilmesini istiyorsak setter method olusturmamiz gerekir. setter () method asagidaki gibi olusturulur.
		
		 public void setCh(char ch) {
		  this.ch = ch;
	  }
	    Burda Encapsulation yapilan ch variable'ina setter method olusturulmus böylece bu variable'daki deger baska class'lardan degistirilebilir
	  
	8-)	setter () method olsuturmak icin dikkat edilmesi gereken hususlar nelerdir?
	   	a)Access modifier'i public yapiniz.
	   	b)Return type'i her zaman void yapiniz
	   	c)Method ismi "set + variable ismi" seklinde yaziniz
	   	d)Method parantezi icine variable'i return type'i ile beraber yaziniz
	   	e)Method body'si icine "this.ch = ch" gibi yaziniz. (Variable ismi ch ise...)
	9-) Eclipse'te getter ve setter icin olusturulan kisa yolu tarif ediniz.
		Cevap	: eclipse'te yer alan ustteki pencerelerden Source icinde yer alan Generate Getters and Setters sekmesi ile olmasini istedgimiz 
		methodu secerek kisaca olusturabiliriz. Methodlar genel kural olarak en sona konulmasi secilir.
	   
	Not	: Java boolean'lar icin getter olustururken method ismini "is" ile baslatir. Setter'larda set kullanmaya devam eder.
	Not	: Setter ile yapilan degisiklik obje ile sinirlidir class'daki orjinal data da degisiklik yapilmaz.
	   
	   
	   

*/