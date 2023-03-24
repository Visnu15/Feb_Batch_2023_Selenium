package week5.day5.w5d5assignment;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit method overrided.");
	}
public static void main(String[] args) {
	AxisBank axis = new AxisBank();
	axis.deposit();
	axis.fixed();
	axis.saving();
}
}
