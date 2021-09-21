package entities;

public class program {

	public static double IOF = 0.06;
	
	public static double dolarParaReal (double amount, double precoDolar) {
		return amount * precoDolar * (1.0+IOF);
	}
	
}
