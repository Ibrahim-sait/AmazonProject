package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//hi
public class basepage {

	public  static WebDriver driver;
	public String browser= "chrome";
	
	public basepage()
	{
		if(driver==null){
			if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\ali\\chrome\\chromedriver.exe");
				driver=new ChromeDriver();
				
			}
			else if(browser.equals("firefox")){
				System.setProperty("webdriver.gecko.driver", "D:\\ali\\chrome\\chromedriver.exe");
				driver= new FirefoxDriver();
				
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		}
	}
	
	public String gettext(WebElement element){
		return element.getText();
		
	}

	
	public void setText(WebElement element, String name){
	if(name!=null){
		element.click();
		element.clear();
		element.sendKeys(name);
		
	}
	
	}
		public String gettitle(){
				return driver.getTitle();
					
	}
	

	public void closedriver(){
		driver.close();
	}

	public void navigateback(){
		driver.navigate().back();
	}
	
	
	public String getattribute(WebElement element){
		return element.getAttribute("value");
			
	}
	
	
	public void mouseover(WebElement element){
		Actions a= new Actions(driver);
		a.moveToElement(element).build().perform();
		
				
	}
	

	}
	
	
	
