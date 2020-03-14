package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.dresspage;
import page.pagedetail;
import page.pageobjest;

public class testpagedetails {

	pageobjest hp= new pageobjest();
	dresspage dp= new dresspage();
	pagedetail pd= new pagedetail();
	
	@Test
	public void text(){
		hp.dresses().click();
		dp.mouse().click();
		Assert.assertTrue(pd.text().isDisplayed());
		System.out.println(pd.text().getText());
		Assert.assertTrue(pd.tweet().isDisplayed());
		System.out.println(pd.tweet().getText());
		Assert.assertTrue(pd.fshare().isDisplayed());
		System.out.println(pd.fshare().getText());
		
	}
	
	
	
	
	
	
}
  