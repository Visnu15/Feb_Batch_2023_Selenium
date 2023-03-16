package week4.day3.w4d3assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("psvisn98@gmail.com");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
    String text = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-firstName')]/a)[1]")).getText();
    System.out.println("Name of first lead: " + text);
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
    driver.findElement(By.linkText("Duplicate Lead")).click();
	String expected = "Duplicate Lead | opentaps CRM";
	String actual = driver.getTitle();
	System.out.println("Expected title: " + expected);
	System.out.println("Actual title: " + actual);
	if(expected.equals(actual)) {
		System.out.println("Title matches");
	}
	else {
		System.out.println("Title not matched");
	}
	driver.findElement(By.className("smallSubmit")).click();
	String text2 = driver.findElement(By.xpath("(//span[text()='Visnu'])[1]")).getText();
	System.out.println("Name of duplicated lead: " + text2);
	if(text.equals(text2)) {
		System.out.println("Duplicated lead name is same as captured name");
	}
	else {
		System.out.println("Not same");
	}
	driver.close();
}
}
