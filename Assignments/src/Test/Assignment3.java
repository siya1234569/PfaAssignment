/*
 * 3. Three buttons present on Webpage with same name.
-- Click on second button(Java Code)
 */
/*
 * this is the program to illustrate to click on second child on webpage having same name
 * this program will click on veg-fruit name coloumn and gives sorting of veg-fruit list
 */

package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment3 {
	
	@Test
    public void Button() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//selection of second child of tr tag
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		//if we want to move to the third child of tr tag
		//driver.findElement(By.cssSelector("tr th:nth-child(3)")).click();


		List<WebElement> firstcolList=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> originalList=new ArrayList<String>();
		for(int i=0;i<firstcolList.size();i++)
		{
			originalList.add(firstcolList.get(i).getText());
		}
		
		ArrayList<String> copiedList=new ArrayList<String>();
		
		for(int i=0;i<originalList.size();i++)
		{
			copiedList.add(originalList.get(i));
		}
		System.out.println("*****************");
		Collections.sort(copiedList);
		Collections.reverse(copiedList);
		for(String s:copiedList)
		{
			
			System.out.println(s);
		}
		System.out.println("********original list*********");
		for(String s:originalList)
		{
			System.out.println(s);
		}

		//Assert.assertTrue(originalList.equals(copiedList));
		
	}


}
