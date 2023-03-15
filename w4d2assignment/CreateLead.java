package week4.day2.w4d2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Visnu");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Visnu");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Let's learn selenium");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("psvisn98@gmail.com");
	WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select options = new Select(state);
	options.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	System.out.println("Title is:" + title);
}
}
