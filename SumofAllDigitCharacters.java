package Main;


public class SumofAllDigitCharacters {
	
	public static int sumOfAllDigitCharacters(String S) {
		
		String sNumbers = S.replaceAll("[^0-9]", "");
		int sum = 0;
		
		char[] chArr = sNumbers.toCharArray();
		for(char i : chArr) {
			sum+= Character.getNumericValue(i);
		}
		
		return sum;
		
	}
	
	
}
