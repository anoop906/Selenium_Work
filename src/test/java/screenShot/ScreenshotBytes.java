package screenShot;

import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotBytes {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		driver.get("http://in.iq-india.com/Summery.aspx");
		byte[] bytearr= screenshot.getScreenshotAs(OutputType.BYTES);
		String path = ".\\src\\test\\java\\Screenshot images//image4.png";
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(bytearr);
		driver.close();
		

	}

}
