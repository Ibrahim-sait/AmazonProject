package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.pageobjest;

public class pagetest {

	pageobjest hp= new pageobjest();
	
 	
	@Test
	public void verifytabs(){
		Assert.assertTrue(hp.women().isDisplayed());
		System.out.println(hp.gettext(hp.women()));
		Assert.assertTrue(hp.dresses().isDisplayed());
		System.out.println(hp.gettext(hp.dresses()));
		Assert.assertTrue(hp.tshirt().isDisplayed());
		System.out.println(hp.gettext(hp.tshirt()));
	}
	

	@Test
	public void navigatetabs(){
		hp.women().click();
		Assert.assertTrue(hp.gettitle().contains("Women"));
		hp.navigateback();
		hp.dresses().click();
		Assert.assertTrue(hp.gettitle().contains("Dresses"));
		hp.navigateback();
		hp.tshirt().click();
		Assert.assertTrue(hp.gettitle().contains("T-shirts"));
		hp.navigateback();
	}
		
		
/*@Test
public void newsletter(WebElement element){
hp.newsletter().sendKeys("ibrahimali11ib@gmail.com");
hp.btn().click();
Assert.assertTrue(hp.getattribute(element).contains("You have successfully subscribed to this newsletter."));*/


@Test
public void newsletter(){
hp.setText(hp.newsletter(), "ibrahimali11ib@gmail.com");
hp.btn().click();
Assert.assertTrue(hp.getattribute(hp.newsletter()).contains("You have successfully subscribed to this newsletter."));

}
}