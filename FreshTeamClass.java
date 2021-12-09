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
public class FreshTeamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp-pc\\Training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.freshworks.com/";
		
		//Navigating to url
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Hovering over products
		WebElement txt = driver.findElement(By.xpath("//span[text()='Products']"));
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txt).build();
		seriesOfActions.perform();
		
		//Freshteam Page
		driver.findElement(By.xpath("//h6[text()=\"Freshteam\"]")).click();
		System.out.println(driver.findElement(By.xpath("//h1[text()=\"The smart HR software for growing businesses\"]")).getText());
		
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       
		js.executeScript("window.scrollBy(0,200)");
		
		//Sign up
		driver.findElement(By.xpath("//a[text()=\" SIGN UP FOR A FREE TRIAL\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"first-name\"]")).sendKeys("Bhavya");
		driver.findElement(By.cssSelector("input[name=\"last-name\"]")).sendKeys("W");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("bh1@abc.com");
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.cssSelector("input[name=\"company\"]")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[value=\"Sign up for Free\"]")).click();
		driver.navigate().back();
		
		//Login page
		//Scroll up
		js.executeScript("window.scrollBy(0,-200)");
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		driver.findElement(By.name("domain-fteam-login")).sendKeys("abc-creators");
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"fteam_login_form\"]/fieldset[2]/input")).isEnabled());
		driver.findElement(By.xpath("//*[@id=\"fteam_login_form\"]/fieldset[2]/input")).click();
		driver.navigate().back();
		
		//Navigate to product updates page
		//Scroll down
		js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.xpath("//a[text()=\" LATEST IN FRESHTEAM\"]")).click();
		
		//Searching in Product Update
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/nav/div[1]/input")).sendKeys("bug fix",Keys.ENTER);
		driver.navigate().back();
		driver.navigate().back();
		
		//Applicant Tracking System
		driver.findElement(By.xpath("//span[text()='Applicant Tracking System']")).click();
		
		//Extract text from Applicant Tracking System
		System.out.println(driver.findElement(By.xpath("/html/body/section[1]/div/h1")).getText());
		driver.navigate().back();
		
		//Virtual Onboarding
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/a/div/div/div[2]/p[2]/span")).click();
		
		//Get Text from Virtual Onboarding Page
		System.out.println(driver.findElement(By.xpath("//h1[text()=\"An Outstanding Onboarding Process is just a click away\"]")).getText());
		driver.navigate().back();
		
		//Employee database
		driver.findElement(By.xpath("//span[text()=\"Employee Database\"]")).click();
		
		//Inside Employee database
		System.out.println(driver.findElement(By.cssSelector("h1.h2")).getText());
		driver.navigate().back();
		
		//Time off management
		driver.findElement(By.xpath("//span[text()=\"Time off management\"]")).click();
		
		//Inside Time off management
		System.out.println(driver.findElement(By.cssSelector("h1.h2")).getText());
		
		//Holiday Calendar
		driver.findElement(By.xpath("//span[text()=\"Holiday Calendar\"]")).click();
		
		//Approvals
		driver.findElement(By.xpath("//span[text()=\"Approvals\"]")).click();
		driver.navigate().back();
		driver.navigate().back();//Back to homepage
		
		//Hover over Resources
		Action seriesOfActions1 = builder.moveToElement(driver.findElement(By.xpath("//span[text()=\"Resources\"]"))).build();
		seriesOfActions1.perform();
		
		//Community
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[4]/ul/li[4]/a/span")).click();
		
		//Inside Community
		//Create a Topic
		driver.findElement(By.xpath("//span[text()=\"Create a Topic\"]")).click();
		//Close the pop-up box
		driver.findElement(By.cssSelector("button.mfp-close")).click();
		
		//Profile of manns
		driver.findElement(By.xpath("//a[text()=\"manns\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		//Groups
		driver.findElement(By.xpath("//a[text()=\" Groups \"]")).click();
		
		//Get Text from Groups
		System.out.println(driver.findElement(By.xpath("//h1[text()=\"Groups\"]")).getText());
		driver.navigate().back();
		
		//Events
		driver.findElement(By.xpath("//a[text()=\" Events \"]")).click();
		
		//Inside Events
		System.out.println(driver.findElement(By.xpath("//h1[text()=\"Events\"]")).getText());
		driver.navigate().back();
		driver.navigate().back();
		driver.close();
		
		
		
	}

}
