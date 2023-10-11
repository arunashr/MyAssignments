package week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class clAssignFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//loading the web page
		driver.get(" https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//getting inside frame
		driver.switchTo().frame("iframeResult");
		
		//clicking on try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//get text from alert
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		System.out.println(driver.findElement(By.id("demo")).getText());

	}

}
