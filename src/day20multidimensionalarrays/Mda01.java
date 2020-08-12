package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {

		int mda [] [] = new int [3][2];
		
		// Multi dimensional array nasil olusturulur?
		mda[1][0]=7;
		System.out.println(Arrays.deepToString(mda));
		
		// Multi dimensional array'e deger atamasi nasil yapilir ?
		mda[2][0]=11;
		mda[0][1]=23;
		mda[0][0]=10;
		mda[1][1]=12;
		mda[2][1]=55;
		// Multi dimensional array'ler console'a nasil yazdirilir?
		System.out.println(Arrays.deepToString(mda));
		
		// Multi dimensional array'lerde istenen bir eleman onsole'a nasil yazdirilir?
		System.out.println(Arrays.toString(mda[0]));
		System.out.println(Arrays.toString(mda[1]));
		System.out.println(Arrays.toString(mda[2]));
		
		// Multi dimensional array'lerde icdeki arraydan istenen bir eleman onsole'a nasil yazdirilir?
		System.out.println(mda[0][0]);
		System.out.println(mda[1][1]);
		System.out.println(mda[2][0]);
		
		//  Multi dimensional array olusturmanin kisa yolu nedir?
		
		char mdac [][]= { {'a','b','c'},{'d'},{'e','f'},{'g','h','i','k'}};
		System.out.println(Arrays.deepToString(mdac));
		
		//Soru : yukarida ki multidimensional arrayde ki ilk arrayin elemanlarinin ASCII deger toplamini yazdirin
		
		//1. yol
		System.out.println(mdac [0][0]+mdac [0][1]+mdac [0][2]);
		//2. yol
		int sum=0;
		for (int i = 0; i < mdac[0].length; i++) {
			sum=sum+mdac[0][i];
		
			
		}	System.out.print(sum);
		
		
		
	}

}
