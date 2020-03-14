package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class dresspage extends basepage{

	public dresspage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement dresses;
	
	
	public WebElement dresses(){
		return dresses;
	}
	
		@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[1]/label/a")
		WebElement sizeS;
		
		
		public WebElement sizeS(){
			return sizeS;
		}
	
		@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[2]/label/a")
		WebElement sizeM;
		
		
		public WebElement sizeM(){
			return sizeM;
		}
		
		@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[3]/label/a")
		WebElement sizeL;
		
		
		public WebElement sizeL(){
			return sizeL;
		}
	
		
		@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
		WebElement mouse;
		
		   
		public WebElement mouse(){
			return mouse;
		}
		
		@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
		WebElement add;
		
		   
		public WebElement add(){
			return add;	
		}
	
		@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/span")
		WebElement close;
		
		   
		public WebElement close(){
			return close;	
		}
	
		@FindBy(xpath = "//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]")
		WebElement count;
		
		   
		public WebElement count(){
			return count;	
		}
		
		@FindBy(xpath = "//*[@id='center_column']/h1/span[2]")
		WebElement num;
		
		   
		public int num(){
			String a= num.getText();
			String b[]= a.split(" ");
			System.out.println(b[2]);
			int ab= Integer.parseInt(b[2]);
			return ab;
			
			
		}
		
		@FindBys(@FindBy(className= "product-container"))
		List<WebElement> s;
		
		public int numcount(){
			int a= s.size();
			return a;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
		
		
		
	
						

