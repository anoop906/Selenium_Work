package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		//locate by using xpath's descendant, then click on that link 
		WebElement we=driver.findElement(By.xpath
				("//ul[@id='nav1']/child::li[3]/child::ul/descendant::ul/child::li[8]/child::a"));
		we.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl="https://www.hyrtutorials.com/p/xpath-xml-path-language.html";
		
		if(actualUrl.equals(expectedUrl)) {
			WebElement location =driver.findElement(By.xpath("//h1[contains(@class,'post-title entry-title')]"));
			String text= location.getText();
			System.out.println(text);
		}
		driver.close();
		
	}

}
