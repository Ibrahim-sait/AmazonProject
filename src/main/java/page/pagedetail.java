package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagedetail extends basepage {

	public pagedetail(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//*[@id='short_description_block']")
	WebElement text;
	 
	public WebElement text(){
		return text;
	}
	
	
	@FindBy(xpath= "//*[@id='center_column']/div/div/div[3]/p[7]/button[1]")
	WebElement tweet;
	 
	public WebElement tweet(){
		return tweet;
	}
	
	@FindBy(xpath= "//*[@id='center_column']/div/div/div[3]/p[7]/button[2]")
	WebElement fshare;
		 
		public WebElement fshare(){
		return fshare;
	}
	
	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	WebElement proceed;
	
	public WebElement proceed(){
		return proceed;
	}
}
