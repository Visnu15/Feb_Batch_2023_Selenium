package week2.day1;

public class Car {
	public void applyBrake() {
		System.out.println("To stop the car, brakes should be used.");
	}
	public void applyGear() {
		System.out.println("Use clutch when switching gears");
	}
	public void switchOnAc() {
		System.out.println("To change the temperature inside the car, turn on AC");
	}
	public void applyAccelerator() {
		System.out.println("Apply accelerator to drive the car");
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.applyBrake();
		myCar.applyGear();
		myCar.switchOnAc();
		myCar.applyAccelerator();
	}

}
