package week4.day5.w4d5assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Create new account")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("firstname")).sendKeys("Visnu");
	driver.findElement(By.name("lastname")).sendKeys("S");
	driver.findElement(By.name("reg_email__")).sendKeys("1234560987");
	driver.findElement(By.id("password_step_input")).sendKeys("abcdefgh");
    WebElement day = driver.findElement(By.id("day"));
    Select dropdown = new Select(day);
    dropdown.selectByValue("15");
    WebElement month = driver.findElement(By.id("month"));
    Select drop = new Select(month);
    drop.selectByVisibleText("Dec");
    WebElement options = driver.findElement(By.id("year"));
    Select choice = new Select(options);
    choice.selectByVisibleText("2000");
    driver.findElement(By.xpath("//input[@value='2']")).click();
    driver.close();
}
}
