package util;

public class Assertion {
	
	public static void equals (String reason, String actual, String expected) {
		if (!actual.equalsIgnoreCase(expected))
		throw new RuntimeException (reason);
	}

}
