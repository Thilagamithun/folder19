package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String tit=driver.getTitle();
		System.out.println(tit);
		if(tit.equalsIgnoreCase("Google")) {
			System.out.println("Title is correct");
		}
		String url=driver.getCurrentUrl();
		if(url.contains("goog")) {
			System.out.println("URL is correct");
		}
		else
			System.out.println("URL is wrong");
		System.out.println(url);
		
		
		
		driver.close();
		
	}
	}
