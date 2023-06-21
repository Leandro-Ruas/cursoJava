package util;

public class AulaSetentaEDoisCurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}

}
