package week1.day2;

public class CalculatorSession {

	public int add() {
		int add1 = 5;
		int add2 = 10;
		int sum =  add1 +  add2;
		return sum;
	}

	public double sub(double sub1, double sub2) {
		//double sub1 = 456.56;
		//double sub2 = 255.42;
		double result = sub1 - sub2;
		return result;
	}

	public int mul() {
		int mul1 = 10;
		int mul2 = 20;
		int mulout = mul1*mul2;
		return mulout;
	}

	public int div() {
		int div1 = 4;
		int div2 = 4;
		int divout = div1*div2;
		return divout;
	}

	public static void main (String[] args) {
		CalculatorSession calc = new CalculatorSession();
		System.out.println(calc.add());
		System.out.println(calc.sub(455.45,200.20));
		int mulout = calc.mul();
		System.out.println(mulout);
		int divout = calc.div();
		System.out.println(divout);
	}

}
