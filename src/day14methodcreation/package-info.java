package day14methodcreation;

/* 
	1- Method nedir ? Nicin Kullanilir?
	2- Method nasil olusturulur?
	3- Bir method main method icinden nasil cagirilir? Bunun faydalari nelerdir? (ayni methodu tekrar tekrar kullanmayi saglar bu cok önemlidir)
	4- Parametre nedir ?(method olustururken method parantezinin icine  variable yazarsak bu variable'lara "parametre" denir.)
	5- Argument nedir ? (Method cagrilirken parantezin icine yazilan degerlere "argument" denir)
	6- Method olusturulurken parametre sinirlamasi var midir? (yoktur istersek hic koymayiz istersek milyon tane koyariz).
	7- Ayni isimli farkli methodlar (Owerloading) uretilebilir mi? (evet. parametreleri farkli olmak sartiyla uretilebilir)
			 a)Parametre sayisini degistirerek ayni isimli methodlar uretebilirsiniz.
	 		 b)Parametre sayilari ayni oldugu halde data type'larini degistirerek de ayni isimli methodlar uretebilirsiniz 
	 		 c)Parametrelerin data type'lari farkli oldugunda parameterelerin yerlerini degistirerek ayni isimli methodlar uretebilirsiniz  
	8- Owerloading nedir? ( Parametreleri degistirerek 1'den fazla ayni isimli method uretmeye METHOD OVERLOADING denir) 
	9- Owerloading nasil yapilmaz?
			a) Return Type'lar degistirilerek method overloading yapilmaz. Yani; ismi ve parametreleri ayni olan iki method return type'lari 
			   farkli bile olsa Java onlari ayni method kabul eder.
	 		b) Access Modifier'lar degistirilerek method overloading yapilmaz. Yani; ismi ve parametreleri ayni olan iki method Access
	 		   Modifier'lari farkli bile olsa Java onlari ayni method kabul eder.
	 		c) Method Body'ler degistirilerek method overloading yapilmaz. Yani; ismi ve parametreleri ayni olan iki method body'leri farkli
	  		   bile olsa Java onlari ayni method kabul eder.
	   
	 Note: Method Overloading Compile Time Polymorphism'dir. 
	 
	 10- Instance(Gorunum/Object) Variable = Object Variable nedir? 
	 		 Main methodun disinda class'in icinde uretilen variable'lara instance variable denir. Instance variable'lar class'in icindeki
	 		 tum methodlar tarafindan kullanilabilir. 
	 11- Local Variable nedir? 
	 		  Method'un body'si icinde veya Methodun method parantezi icinde uretilen variable'lardir. Local variable'lar sadece method
	 		  body'si icinde kullanilabilirler.
	 12- Scope nedir? (kapsamdir java da olusturulan variablerrin kullailacagi alanlardir) 
	 		  a) Instance Variable'larin scope'u icinde bulundugu class'in heryeridir. Yani; Instance variable'lar class'in icinde heryerde
	 		      kullanilabilir.
		 	  b) Local variable'larin scope'u icinde bulunduklari method'un body'sidir.Yani; Local variable'lar method body'si kullanilabilirler. 
		 	  c) Bir variable'i kullanmak icin once onu create etmek lazim. Create etmeden method body'si icinde kullaniyorum falan olmasin...
		 	  
 Note: 	Instance variable'lara deger atamasi yapmazsaniz Java onlara default deger atamasi yapar. Amam local variable'lara deger atamasi 
 		yapmazsaniz Java onlara default deger atamasi yapmaz ve o variable'i kullanmak istediginizde Compile Time Error verir.
*/