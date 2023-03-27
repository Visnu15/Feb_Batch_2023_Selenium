package week6.day1.w6d1assignment;

public class Automation extends MultipleLangauge{

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java method is implemented");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium method is implemented");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby method is implemented");
	}
	
//python method is already an implemented method in MultipleLangauge, so we can call it directly as shown below
	
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.java();
		auto.selenium();
		auto.ruby();
		auto.python();
	}
}
