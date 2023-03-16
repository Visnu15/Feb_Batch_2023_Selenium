package week4.day3.w4d3assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {
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
    driver.findElement(By.xpath("//span[text()='Phone']")).click();
    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    Thread.sleep(3000);
    String text = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).getText();
    System.out.println("Lead ID of first lead: " + text);
    driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
    driver.findElement(By.linkText("Delete")).click();
    driver.findElement(By.linkText("Find Leads")).click();
    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    Thread.sleep(3000);
    String expected = "No records to display";
    System.out.println("Expected message: " + expected);
    String actual = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
    System.out.println("Actual message: " + actual);
    if(expected.equals(actual)) {
    	System.out.println("Deletion confirmed");
    }
    else {
    	System.out.println("Deletion not confirmed");
    }
    driver.close();
}
}
