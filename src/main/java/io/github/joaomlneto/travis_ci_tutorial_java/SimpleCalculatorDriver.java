package io.github.joaomlneto.travis_ci_tutorial_java;

public class SimpleCalculatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator calc = new SimpleCalculator();
		int first = calc.mul(10, 3);
		int second = calc.mul(first, 7);
		int third = calc.mul(second, 13);
		int fourth = calc.mul(third, 37);
		
		System.out.println("Choosing number 10.");
		System.out.println("10 * 3 = " + first);
		System.out.println(first + " * 7 = " + second);
		System.out.println(second + " * 13 = " + third);
		System.out.println(third + " * 37 = " + fourth);
		

	}

}
