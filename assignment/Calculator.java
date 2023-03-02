package week2.day3.assignment;

public class Calculator {
	public void addTwoNumber(int a, int b) {
		int add = a+b;
		System.out.println(add);
	}
	public void subTwoNum(int e, int f) {
		int sub = e-f;
		System.out.println(sub);
	}
	public void mulTwoNumber(double i, double j) {
		double mul = i * j;
		System.out.println(mul);
	}
	public void divTwoNum(float x, float y) {
		float div = x/y;
		System.out.println(div);
	}
public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.addTwoNumber(56, 78);
	calc.subTwoNum(89, 95);
	calc.mulTwoNumber(845.2569, 584.95847);
	calc.divTwoNum(55.2f, 56.8f);
}

}
