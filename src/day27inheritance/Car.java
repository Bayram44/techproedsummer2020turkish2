package day27inheritance;

public class Car extends Vehicle {
	
	/*
	 super() ile parent'dan constructor cagirirken parametrelere dikkat edin.
	 Parent class'da olmayan bir constructor'i super() ile cagirisaniz CTE alirsiniz.
	 
	 this() bu class icindeki constructor'lari parametrelere gore cagirmak icin kullanilir.
	 super () parent'taki constructor'lar icin kullanilir
	 
	 ========***** Benim notum*****=========
	 
	 1-	super = parent'a git 
	 	() = constructor 
	 	super () = parent'taki parametresiz constructor'a git
	 	super (2)= parent'taki parametreli constructor'a git
	 2-	this = bu class'daki
	 	() = constructor
	 	this () = bu class'daki parametresiz constructor'a git
	 	this (2)= bu class'daki parametreli constructor'a git
	 	
	 															DEMEKTIR....
	*/
	
	public Car() {
		super(2);
		System.out.println("Car");
	}
	
	public Car(String name) {
		this();
		System.out.println("Car");
	}

	public static void main(String[] args) {		
		Car car = new Car("Honda");
	}

}