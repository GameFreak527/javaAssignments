package immutable;


public final class Tax {
	private static final int taxRate = 13;
	
	
	public static int taxCalculation(int amount) {
			return amount * taxRate/100;
	}

}
