package ja.core;

import java.math.BigDecimal;

public class BigNumber {

	public static void main(String[] args) {
		BigDecimal price1= new BigDecimal("1.51");
		BigDecimal price2= new BigDecimal("2.2");
		BigDecimal br = price1.multiply(price2);
		
		System.out.println("BigDecimal result : "+ br);
		
		double amount1 = 1.51;
		double amount2 = 2.2;
		double dr = amount1 * amount2;
	
		System.out.println("Double result : " + (dr));
	}

}
