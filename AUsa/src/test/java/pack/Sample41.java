package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample41 {
	static WebDriver driver ;
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/open-source/demo/");
		driver.manage().window().maximize(); 
		WebElement count=driver.findElement(By.xpath("//select[@id='Form_submitRequest_Industry']"));
		Select s = new Select(count);
		s.selectByIndex(2);
		s.selectByVisibleText("Aerospace");
		s.selectByValue("Travel");
}
}