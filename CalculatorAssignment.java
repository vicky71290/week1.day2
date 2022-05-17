package week1.day2;

public class CalculatorAssignment {
	
	public int add(int sum1, int sum2, int sum3) {
				
		int sum4 = sum1+sum2+sum3;
		return sum4;
		
	}
	
public void sub(int subt1, int subt2) {
		
		
		int subt3 = subt1-subt2;
		System.out.println(subt3);
	
}

public void mul() {
	
	int mult1 = 5;
	int mult2 = 7;
	
	double mult3 = mult1*mult2;
	System.out.println(mult3);
}

public float div(float divd1, float divd2) {
	float divd3 = divd1/divd2;
	return divd3;
}

	public static void main(String[] args) {

		CalculatorAssignment maths = new CalculatorAssignment();
		System.out.println(maths.add(10, 20, 30));
		maths.sub(50,40);
		maths.mul();
		System.out.println(maths.div(100f,5F));
		
	}

}
