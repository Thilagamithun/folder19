package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Drop {
	static WebDriver driver ;
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    By loc=By.tagName("a");
	
	
	
	
	}
	
	public static List<WebElement> getLinkName(By loc) {
	return	driver.findElements(loc);
	}
	
	public static void printLink(By loc) {
		        List<WebElement> a =getLinkName(loc);
		        
	}
	
	
	
	
	
	
	
	
	
}