package exp1;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Specification in https://leetcode.com/problems/basic-calculator/
 * 
 * @author Yun Lin
 *
 */
public class SimpleCalculator {
	
	public class StackElement {
		char paranthesis;
		int index;

		public StackElement(char paranthesis, int index) {
			super();
			this.paranthesis = paranthesis;
			this.index = index;
		}

	}

	public int calculate(String expression) {
		
		expression = expression.replace(" ", "");
		
		Stack<StackElement> parenthesisStack = new Stack<>();

		while (expression.contains("(")) {

			/**
			 * iteratively remove the parenthesis from the expression.
			 */
			char[] charList = expression.toCharArray();
			for (int i = 0; i < charList.length; i++) {
				char ch = charList[i];
				if (ch == '(') {
					StackElement element = new StackElement(ch, i);
					parenthesisStack.push(element);
				} else if (ch == ')') {
					StackElement element = parenthesisStack.pop();

					String simpleExpression = expression.substring(element.index + 1, i);
					int value = evaluateSimpleFormula(simpleExpression);

					String beforeExpression = expression.substring(0, element.index);
					String afterExpression = (i >= expression.length()) ? "" : expression.substring(i + 1, expression.length());

					expression = beforeExpression + value + afterExpression;
					break;
				}
			}
			
		}

		int value = evaluateSimpleFormula(expression);
		return value;

	}

	/**
	 * parse the expression with no parenthesis.u
	 * @param simpleExpression
	 * @return
	 */
	private int evaluateSimpleFormula(String simpleExpression) {
		String[] operators = parseOperators(simpleExpression);
		String[] numberStrings = simpleExpression.split("\\+|-");

		String numString1 = retrieveNumString(numberStrings, 0); 
		Integer num1 = Integer.valueOf(numString1);

		for (int i = 0; i < operators.length; i++) {
			String operator = operators[i];

			String numString2 = retrieveNumString(numberStrings, i+1); 
			
			Integer num2 = Integer.valueOf(numString2);

			if (operator.equals("+")) {
				num1 = num1 + num2;
			} else if (operator.equals("-")) {
				num1 = num1 - num2;
			}
		}

		return num1;
	}
	
	private String retrieveNumString(String[] numberStrings, int index){
		String str = "";
		try{
			str = numberStrings[index];
			Integer.valueOf(str);
		}
		catch(Exception e){
			str = Number.DEFAULT;
		}
		
		return str;
	}

	private String[] parseOperators(String simpleExpression) {
		ArrayList<String> operatorList = new ArrayList<>();
		char[] charList = simpleExpression.toCharArray();
		for (char ch : charList) {
			if (ch == '+' || ch == '-') {
				operatorList.add(String.valueOf(ch));
			}
		}

		return operatorList.toArray(new String[0]);
	}

//	public static void main(String[] args) {
//		SimpleCalculator calculator = new SimpleCalculator();
//		String expression = "3+((2-1)+2)";
//		int value = calculator.calculate(expression);
//		System.out.println(value==6);
//	}

}
