package week8.day2.w8d2assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
	Set<String> windows = driver.getWindowHandles();
	List<String> windowsList = new ArrayList<String>(windows);
	driver.switchTo().window(windowsList.get(1));
	driver.findElement(By.xpath("(//table[contains(@class,'x-grid3-row')])[1]//tr[1]//div/a")).click();
	driver.switchTo().window(windowsList.get(0));
	driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
	Set<String> window2 = driver.getWindowHandles();
	List<String> windowsList2 = new ArrayList<String>(window2);
	driver.switchTo().window(windowsList2.get(1));
	driver.findElement(By.xpath("(//table[contains(@class,'x-grid3-row')])[2]//tr[1]//div/a")).click();
	driver.switchTo().window(windowsList2.get(0));
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	driver.switchTo().alert().accept();
	String expTitle = "View Contact | opentaps CRM";
    String actTitle = driver.getTitle();
    System.out.println("Expected title: " + expTitle);
    System.out.println("Actual title: " + actTitle);
    if(expTitle.equals(actTitle)) {
    	System.out.println("Title verified same");
    }
    else {
    	System.out.println("Title not verified");
    }
    Thread.sleep(3000);
    driver.close();
}
}
