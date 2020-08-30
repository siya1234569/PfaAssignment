/*
 * 2. Search inputbox(write JAVA code)
 -- Enter your name.. and select from dropdown -- 1st result
 */

package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment2 {
	@Test
	public void Dropdown() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ksrtc.in/oprs-web/");
	driver.findElement(By.id("fromPlaceName")).sendKeys("BEN");
	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String script="return document.getElementById(\"fromPlaceName\").value;";//string script="hello"
    String text=  (String) js.executeScript(script);
    System.out.println(text);
}

}

