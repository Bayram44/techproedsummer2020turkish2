package day26passbyvalueinheritance;

/* 
 	1-) Pass by value nedir?
 	    Java bir methoda  variable'a ait  degeri yollarken, o degerin kopyasini olusturur ve kopyayi methoda yollar. Method kendisine
	 	yollanan degeri degistirirken kopya degeri degistirmis olur. Buna Pass by value denir, bundaki amac baska classlardaki yapilcak olan
	 	degisikliklerden gercek datayi korumaktir. Böylece yapilan degisiklikler kopya uzerinden yapilmis olur. Java bu sayede variable'a ait
	 	orjinal korumus olur.
	 	
	2-) Pass by reference nedir?
		Pass by refernece'da reference kopyalanip methoda yollanir ama orjinal reference da kopya reference da ayni obje'yi
		gosterdiginden orjinal obje degismis olur.  Java orjinal objenin degismesini istemediginden pass by reference kullanmaz. Java bunun
		yerine Primitivelerde de non-primitive'lerde de pass by value kullanir. Yani degerin kopyasini uretir.
		
	3-) Pass by value nasil yapilir?
		Farkli gruplara indirim yapan bir program yaptigimizi dusunecek olursak, her grup icin farkli methodlar uretmemiz gerekmektedir. Bu 
		methodlar olusturulurken java variablerin degerlerini kopyalayarak methoda gönderir. Bizler methodlarda bu kopya deger uzerinde
		calismalar yapariz ve degisklik burada olur, örnegin ögrenciye 20 lirakik bir indirim icin asagidaki gibi bir method olusturulur;
		
		public static int indOgr(int gomlek) {
		return gomlek - 20;
	}
	4-) Inheritance nedir?
		Parent-Child iliskisi demektir. Child'larin ortak ozellikler parent'a konulur. Child'lar parent'lardaki ozellikleri kendi mallari
		gibi kullanabilir.
		     Bu ==>  a)Code yazmada kolaylik saglar
		             b)Yazilan codelari update etme veya tamir etmede kolaylik saglar.
					 c)Yazilan codelarin okunabilirligini artirir. 
		Child class, Parent class'daki hersyi kullanabilir ama Parent class Child class daki herseyi kullanamz. 
		Child class'i parent class baglamak icin child class'a gidilir ve class adinin yanina extends ve baglanacagi parent calssin adi yazilir
		örn 	: Mammal extends Animal (burada Mammal classi Animal clasin childidir.
	


*/