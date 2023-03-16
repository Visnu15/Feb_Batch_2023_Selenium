package week4.day3.w4d3assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLead {
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
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Visnu");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-firstName')]/a)[1]")).click();
    String title = driver.getTitle();
    String expected = "View Lead | opentaps CRM";
    System.out.println("Expected title: " + expected);
    System.out.println("Actual title: " + title);
    if(title.equals(expected)) {
    	System.out.println("Verified. Same title.");
    }
    else{
    	System.out.println("Title not same");
    }
	String txt = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
	System.out.println("Name before editing: " + txt);
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Google");
	driver.findElement(By.className("smallSubmit")).click();
	String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
	System.out.println("Name after editing: " + text);
	driver.close();
}
}
