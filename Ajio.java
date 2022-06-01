package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(3000);

		//To the left of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);

		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();

		//Print the count of the items Found.
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println(totalItems);

		// Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandList=driver.findElements(By.className("brand"));
		System.out.println("Total Brand List: " +brandList.size());
		for (int i=0;i<brandList.size();i++) {
			WebElement brand = brandList.get(i);
			String brandName = brand.getText();
			System.out.println(brandName);
		}

		//Get the list of names of the bags and print*/

		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println("Total Bags : " +bagNameList.size());
		for (int i=0;i<bagNameList.size();i++) {
			WebElement bag = bagNameList.get(i);
			String bagName = bag.getText();
			System.out.println(bagName);
		}

	}

}
