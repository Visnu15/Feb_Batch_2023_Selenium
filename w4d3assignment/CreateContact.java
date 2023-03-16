package week4.day3.w4d3assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Visnu");
	driver.findElement(By.id("lastNameField")).sendKeys("S");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("visnu");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("s");
	driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Testing");
	driver.findElement(By.id("createContactForm_description")).sendKeys("Selenium is used for front end automation");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("psvisn123@gmail.com");
	WebElement dropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select option = new Select(dropdown);
	option.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testing is very important in IT industries");
	driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	System.out.println(driver.getTitle());
}
}
