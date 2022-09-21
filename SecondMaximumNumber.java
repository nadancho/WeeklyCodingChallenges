package Main;

import java.util.Arrays;

public class SecondMaximumNumber {
	
	public static int secondMaximumNumber(int N, int[] A) {
		
		
		Arrays.sort(A);
		return A[A.length-2];
		
	}
	
}
