package week4.day5.w4d5assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://www.tamilmatrimony.in/");
	driver.manage().window().maximize();
	WebElement drop = driver.findElement(By.xpath("//select[@name='REGISTERED_BY']"));
	Select self = new Select(drop);
	self.selectByVisibleText("Myself");
	driver.findElement(By.id("NAME")).sendKeys("Visnu");
	driver.findElement(By.id("gendermale")).click();
	WebElement day = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
	Select dropdown = new Select(day);
	dropdown.selectByVisibleText("15");
	WebElement month = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
	Select options = new Select(month);
	options.selectByVisibleText("Dec");
	WebElement year = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
	Select options1 = new Select(year);
	options1.selectByVisibleText("2000");
	WebElement relegion = driver.findElement(By.xpath("//select[@id='RELIGION']"));
	Select options2 = new Select(relegion);
	options2.selectByVisibleText("Hindu");
	WebElement mother = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
	Select choice = new Select(mother);
	choice.selectByVisibleText("Marathi");
	WebElement country = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
	Select options3 = new Select(country);
	options3.selectByVisibleText("India");
	driver.findElement(By.id("MOBILENO")).sendKeys("3214569087");
	driver.findElement(By.id("EMAIL")).sendKeys("abcde@gmail.com");
	driver.findElement(By.xpath("(//input[@id='PASSWORD'])[3]")).sendKeys("Password");
	driver.close();
}
}
