package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class pageobjest extends basepage {

	public pageobjest(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement women;
	
	public WebElement women(){
		return women;
	}
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dresses;
	
	public WebElement dresses(){
		return dresses;
	
	
	}

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tshirt;
	
	
	
	public WebElement tshirt(){
		return tshirt;
	}


	@FindBy(xpath = "//*[@id='newsletter-input']")
	private WebElement newsletter;
	
	
	
	public WebElement newsletter(){
		return newsletter;
	}

	
	
	@FindBy(xpath = "//*[@id='newsletter_block_left']/div/form/div/button")
	private WebElement btn;
	
	
	
	public WebElement btn(){
		return btn;
	}
	
	

}
