package week1.day1;

public class Mobile {
	String mobileBrandName = "Redmi";
	char mobileLogo = 'M';
	short noOfMobilePiece = 6;
	int modelNumber = 142568;
	long mobileImeiNumber = 845627136l;
	float mobilePrice = 24998.59f;
	boolean isDamaged = false;
	
   	public static void main(String[] args) {
   		Mobile myMobile = new Mobile();
		System.out.println("Brand name = " + myMobile.mobileBrandName);
		System.out.println("Logo is " + myMobile.mobileLogo);
		System.out.println("Number of mobiles available = " + myMobile.noOfMobilePiece);
		System.out.println("Model numer is " + myMobile.modelNumber);
		System.out.println(myMobile.mobileImeiNumber + " is the IMEI number");
		System.out.println("Price of the mobile is Rs. " + myMobile.mobilePrice);
		System.out.println("Damage status = " + myMobile.isDamaged);
		
	}

}
