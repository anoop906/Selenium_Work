package alert;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		  //Use URL class to enter the url link 
//		URL url = new URL("https://www.hyrtutorials.com/p/alertsdemo.html");
//		  driver.navigate().to(url); Thread.sleep(2000);
		
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("promptBox")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		Alert alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		alert.sendKeys("Custom Page");
		alert.accept();
		WebElement output= driver.findElement(By.xpath("//div[@id='output']"));
		System.out.println(output.getText());
		driver.close();

	}

}
