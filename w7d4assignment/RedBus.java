package week7.day4.w7d4assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--start-maximized", "--disable-notifications");
	ChromeDriver driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.redbus.in/");
	driver.findElement(By.id("src")).sendKeys("Chennai");
	driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	driver.findElement(By.id("dest")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	driver.findElement(By.xpath("//td[text()='12']")).click();
	driver.findElement(By.id("search_btn")).click();
	String buses = driver.findElement(By.xpath("//span[contains(@class,'w-60 d-block')]")).getText();
	System.out.println(buses);
	driver.findElement(By.xpath("//label[contains(text(),'SLEEPER')]")).click();
	String second = driver.findElement(By.xpath("(//div[contains(@class,'travels lh-24')])[2]")).getText();
	System.out.println(second);
	System.out.println(driver.getTitle());
}
}
