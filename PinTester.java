package Main;

public class PinTester {
	public static boolean pinTest(String x) {
		
		if(x.matches("^[0-9]{4}([0-9]{2})?$")) {
			return true;
		}
		return false;
	}
}
