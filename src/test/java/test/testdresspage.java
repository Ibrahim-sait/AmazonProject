package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.dresspage;
import page.pageobjest;

public class testdresspage {

	pageobjest hp= new pageobjest();
	dresspage dp= new dresspage();
	
	@Test
	public void dresses(){
		hp.dresses().click();
		Assert.assertTrue(dp.sizeS().isDisplayed());
		System.out.println(dp.gettext(dp.sizeS()));
		Assert.assertTrue(dp.sizeM().isDisplayed());
		System.out.println(dp.gettext(dp.sizeM()));
		Assert.assertTrue(dp.sizeL().isDisplayed());
		System.out.println(dp.gettext(dp.sizeL()));
	
	
	
	}
	
	@Test
	public void addcart(){
		hp.dresses().click();
		dp.mouseover(dp.mouse());
		dp.add().click();
		dp.close().click();
		Assert.assertTrue(hp.gettext(dp.count()).equals("1"));
		System.out.println(hp.gettext(dp.count()));

	}
	
	@Test
	public void producttodisplay(){
		boolean test;
		if(dp.num()==dp.numcount()){
			test=true;
			
		}
		
		else{
			test=false;
			
		}
		Assert.assertTrue(test);
		
	}
	
}
