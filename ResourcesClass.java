package mavenPackage;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class ResourcesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp-pc\\Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.freshworks.com/";
		
		//Navigating to url
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Hovering over Resources
		WebElement txt = driver.findElement(By.xpath("//span[text()=\"Resources\"]"));
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txt).build();
		seriesOfActions.perform();
		
		//Fresh start in Resources
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[4]/ul/li[5]/a/span")).click();
		
		//Insights
		driver.findElement(By.xpath("//span[text()=\"Insights\"]")).click();
		
		//Blog
		driver.findElement(By.xpath("//span[text()=\"Blog\"]")).click();
		
		//Digital Transformation Page
		driver.findElement(By.xpath("//span[text()=\"What is Digital Transformation?\"]")).click();
		
		//Videos
		driver.findElement(By.xpath("//span[text()=\"Videos\"]")).click();
		
		//Guides
		driver.findElement(By.xpath("//span[text()=\"Guides\"]")).click();
		
		//Get Text from Guides
		System.out.println(driver.findElement(By.xpath("//h2[text()=\"Essential Guides\"]")).getText());
		
		//Fresh start page
		driver.findElement(By.xpath("//span[text()=\"Fresh Start\"]")).click();
		driver.navigate().back();
		
		//Hovering over resources
		Action seriesOfActions1 = builder.moveToElement(driver.findElement(By.xpath("//span[text()=\"Resources\"]"))).build();
		seriesOfActions1.perform();
		
		//Services
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[4]/ul/li[6]/a/span")).click();
		
		//Get Onboarded
		driver.findElement(By.xpath("//div[text()=\"GET ONBOARDED\"]")).click();
		
		//Enter details
		driver.findElement(By.xpath("//input[@type=\"text\"][@name=\"first-name\"]")).sendKeys("Bha");
		driver.findElement(By.xpath("//input[@type=\"text\"][@name=\"last-name\"]")).sendKeys("W");
		driver.findElement(By.xpath("//input[@type=\"email\"][@name=\"email\"]")).sendKeys("b@abc.com");
		driver.findElement(By.xpath("//input[@type=\"text\"][@name=\"company\"]")).sendKeys("abc");
		Assert.assertTrue(driver.findElement(By.xpath("//input[@type=\"submit\"]")).isEnabled());
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.close();
	}

}
