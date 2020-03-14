package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.dresspage;
import page.orderpage;
import page.pagedetail;
import page.pageobjest;

public class testorderpage {

	pageobjest hp= new pageobjest();
	dresspage dp= new dresspage();
	pagedetail pd= new pagedetail();
	orderpage op= new orderpage();
	
	
	@Test
	public void comparetotalprice() throws InterruptedException{
		
		int n= 3;
		hp.dresses().click();
		dp.mouseover(dp.mouse());
		dp.add().click();
		pd.proceed().click();
		
		op.unitprice();
		op.shipprice();
		op.plusbtn();
		
		int actual= op.unitprice()*n+ op.shipprice();
		int expected= op.total();
		
		Thread.sleep(4000L);
		Assert.assertTrue(actual==expected);
		System.out.println(actual);
		System.out.println(expected);
		System.out.println(op.unitprice());
		System.out.println(op.shipprice());
		System.out.println(op.total());
		
	}
	
	
}
