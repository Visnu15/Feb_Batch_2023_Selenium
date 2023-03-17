package week4.day5.w4d5assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Bank {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://uibank.uipath.com/register-account");
	driver.manage().window().maximize();
	driver.findElement(By.id("firstName")).sendKeys("Visnu");
	WebElement findElement = driver.findElement(By.xpath("//select[@id='title']"));
	Select dropdown = new Select(findElement);
	dropdown.selectByVisibleText("Mr");
	driver.findElement(By.id("middleName")).sendKeys("S");
	driver.findElement(By.id("lastName")).sendKeys("Pise");
	WebElement findElement2 = driver.findElement(By.xpath("//select[@id='sex']"));
	Select dropdown2 = new Select(findElement2);
	dropdown2.selectByVisibleText("Male");
	WebElement findElement3 = driver.findElement(By.xpath("//select[@id='employmentStatus']"));
	Select dropdown3 = new Select(findElement3);
	dropdown3.selectByVisibleText("Full-time");
	driver.findElement(By.id("username")).sendKeys("Visnu S");
	driver.findElement(By.id("email")).sendKeys("psvisn98@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Password");
	driver.close();
}
}
