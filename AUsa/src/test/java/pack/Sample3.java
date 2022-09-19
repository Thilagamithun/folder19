package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3 {

	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Thilak");
		
		
		
}
}