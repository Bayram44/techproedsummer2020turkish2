package day16constructors;

public class Test1 {

	static int i=1;
	int k=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for ( i = 1; i <10; i++) {// burda int yazmadigimiz icin static olan i' yi kullanir.
			i=i+2;
			System.out.print(i+" ");
		}
		System.out.println("===> "+i);// bu yuzden burasi 10 olur, eger yukarda for icinde int kullanilirsa burasi 1 olur. 
		System.out.println();
		for (int k = 1; k <10; k++) {
			k=k+2;
			System.out.print(k+" ");
		}
		//System.out.println("===> "+k); bu kod k static olmadigi icin hata verir cunku main'den static olmayan cagrilamaz.
	}

}
