package pack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample4 {
	static WebDriver driver ;
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize(); 
		By country = By.xpath("//select[@name='Country']");
		
		
		/*WebElement coun=driver.findElement(country);
		Select s = new Select(coun);
		List<WebElement> countrylist=s.getOptions();
		System.out.println(countrylist.size());
		for(WebElement e: countrylist) {
			String text=e.getText();
			System.out.println(text);
		}*/
		System.out.println(doGetDropDownOptions(country));
		System.out.println(doGetDropDownOptions(country).contains("India"));
		
	}	
	public static WebElement getElement(By loc) {
			return driver.findElement(loc);
		}
	public static List<String> doGetDropDownOptions(By loc){
		Select s = new Select(getElement(loc));
		List<WebElement> optionsList=s.getOptions();
		List<String> optionsValList = new ArrayList<String>();
		System.out.println(optionsList.size());
		for(WebElement e: optionsList) {
			String text=e.getText();
			optionsValList.add(text);
		}
		return optionsValList;
		
	}
	public static void doSelectByDropDownValue(By loc ,String value){
		Select s = new Select(getElement(loc));
		List<WebElement> optionsList=s.getOptions();
		for(WebElement e: optionsList) {
			String text=e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
}
}

