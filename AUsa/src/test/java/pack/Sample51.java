package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample51 {
	static WebDriver driver ;
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		By loc=By.tagName("a");
		By im= By.tagName("img");
		System.out.println(meth1(loc).size());
		System.out.println(meth1(im).size());
		System.out.println(meth2(loc).size());
		System.out.println(meth2(loc).contains("Sell"));
	     System.out.println(meth2(loc));
		
	}	
		
	
	
	public static List<WebElement> meth1(By loc) {
		return driver.findElements(loc);
	}
	public static  List<String>  meth2(By loc) {
		List<WebElement> ll=meth1(loc);
		List<String> al = new ArrayList();
		for(WebElement e:ll) {
			String txt= e.getText();
			if(!txt.isEmpty()) {
				al.add(txt);
			}
		
		}
		return al;
		
	}
	
}
