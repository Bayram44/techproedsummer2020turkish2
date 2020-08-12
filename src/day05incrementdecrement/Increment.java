package day05incrementdecrement;

public class Increment {

	public static void main(String[] args) {
		// increase =Arttirmak (fiil)   Increment=Artis (isim)
		
		//increment 1.yol
		int s=12;
		System.out.println(s);
		s=s+3;
		System.out.println(s);
		s=s+5;
		System.out.println(s);
		
		// increment 2.yol
		int t=22;
		System.out.println(t);
		t+=3;// bu ifade t=t+3; ile aynidir
		System.out.println(t);
		
		// sadece 1 arttirilacaksa asagidaki yöntem uygulanir
		int u=32;
		System.out.println(u);
		u++; // bu ifade u=u+1; u+=1; ile aynidir ama 1 arttirmalarda hep bu kullanilir.
		System.out.println(u);
	}

}
