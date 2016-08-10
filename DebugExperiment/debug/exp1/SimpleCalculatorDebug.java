package exp1;

public class SimpleCalculatorDebug {

	/**
	 * expected result is 10
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		String expression = "(((1+((1+2)+(2-1))-(1-3))+1)+1)+1";
		int value = calculator.calculate(expression);
		System.out.println(value==10);
	}

}
