package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 5896473l;
	boolean isPunctured = true;
	String bikeName = "Honda Shine";
	double runningKM = 42356.52354;
	
	public static void main(String[] args) {
		TwoWheeler myBike=new TwoWheeler();
		System.out.println("Bike has "+ myBike.noOfWheels + " wheels");
		System.out.println("There are " + myBike.noOfMirrors + " mirrors in the bike");
		System.out.println("Chassis number is " + myBike.chassisNumber);
		System.out.println("Bike is punctured. True or False? " + "Answer = " + myBike.isPunctured);
		System.out.println("Name" + " = " + myBike.bikeName);
		System.out.println("Total kilometers driven = " + myBike.runningKM);
	}

}
