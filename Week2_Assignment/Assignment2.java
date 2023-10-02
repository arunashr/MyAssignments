package Week2_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializing the web driver
		ChromeDriver driver = new ChromeDriver();
				
				
		//loading the Url
				
		driver.get("https://en-gb.facebook.com/");
				
		// to maximize the window
		driver.manage().window().maximize();
		
		// click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//firstname
		driver.findElement(By.name("firstname")).sendKeys("Aruna");
		
		//lastname
		driver.findElement(By.name("lastname")).sendKeys("Suresh");
		
		//reg_email__
		driver.findElement(By.name("reg_email__")).sendKeys("9840070217");
		
		//password_field
		driver.findElement(By.id("password_step_input")).sendKeys("testing");
		
		// DOB values -- day
		WebElement dob_day = driver.findElement(By.id("day"));
		Select dday = new Select(dob_day);
		
		dday.selectByVisibleText("29");
	
		// month
		WebElement dob_month = driver.findElement(By.id("month"));
		Select dmonth = new Select(dob_month);
		
		dmonth.selectByIndex(10);
		
		//year
		WebElement dob_year = driver.findElement(By.id("year"));
		Select dyear = new Select(dob_year);
		
		dyear.selectByVisibleText("1980");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// selecting gender
		driver.findElement(By.xpath("//label[text() = 'Female']")).click();
		
}
}
