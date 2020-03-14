package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderpage extends basepage{

	
	public orderpage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='product_price_3_13_0']/span")

	WebElement unitprice;
	
	public int unitprice(){
//		
//		String a = unitprice.getText();
//		String b= a.substring(1) ;
//		String[] ab= b.split("[.]");
//		int c= Integer.parseInt(ab[0]);
//		
//		return c;
		
		int a = Integer.parseInt(unitprice.getText().substring(1).split("[.]")[0]);
		return a;
	}
	
	
	@FindBy(xpath = "//*[@id='total_shipping']")
	WebElement shipprice;
	
	public int shipprice(){
//		String a= shipprice.getText();
//		String b = a.substring(1);
//		String []ab= b.split("[.]");
//		int c = Integer.parseInt(ab[0]);
//		return c;
		int a= Integer.parseInt(shipprice.getText().substring(1).split("[.]")[0]);
				return a;
		
	}
	
	
	@FindBy(xpath=  "//*[@id='cart_quantity_up_3_13_0_0']/span")
	WebElement plusbtn;
	
	public WebElement plusbtn() throws InterruptedException{
	
	for(int i=1; i<=2; i++){
		plusbtn.click();
		Thread.sleep(4000L);
	}
	return plusbtn;
	}
	
	
	@FindBy(xpath="//*[@id='total_price']")
	WebElement total;
	
	public int total(){
//		String a= total.getText();
//		String b= a.substring(1);
//		String [] ab= b.split("[.]");
//		int c= Integer.parseInt(ab[0]);
//		return c;
		
		int a = Integer.parseInt(total.getText().substring(1).split("[.]")[0]);
		return a;
	}
	
	
}

