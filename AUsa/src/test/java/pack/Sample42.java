package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample42 {
	static WebDriver driver;   
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver(); 
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath(""))
      By fav=By.xpath("//input[@id='Form_getForm_subdomain']");
      func1(fav,"Thilak");
      

}

public static void func1(By loc, String value) {
   driver.findElement(loc).sendKeys(value);
	
}



}
