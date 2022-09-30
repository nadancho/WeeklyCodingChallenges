package Main;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestGap {
	
	public static int largestGap(int[] A) {
		
		int maxDiff = -1;
		
		Arrays.sort(A);
		maxDiff = IntStream.range(0, A.length-1)
				.map(x -> Math.abs(A[x+1] - A[x]))
				.max().orElse(-1);
		
		return maxDiff;
	}
	
	public static void main(String[] args) {
		
		int[] list = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
		
		System.out.println(largestGap(list));
	}
}
