 package day19arrays;

import java.util.Arrays;

public class A03 {

	public static void main(String[] args) {
		// İki array’in eşit olup olmadigini kontrol etmek
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
	}

}