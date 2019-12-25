import java.math.BigDecimal;

public class BigDecimalImmutability {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("42.23");
		BigDecimal b = new BigDecimal("10.001");

		a.add(b); // a will still be 42.23
		System.out.println(a);

		BigDecimal c = a.add(b); // c will be 52.231 
		System.out.println(c);
		System.out.println(a);
		


		//The BigDecimal is immutable so you need to do this:
		BigDecimal test = new BigDecimal(0);
		BigDecimal result = test.add(new BigDecimal(30));
		System.out.println("result "+result);
		
	}

}
