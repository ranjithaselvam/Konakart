package com.atmecs.konakart.script;


import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.atmecs.konakart.constant.Constants;
import com.atmecs.konakart.helper.Helper;
import com.atmecs.konakart.testbase.TestBase;
import com.atmecs.konakart.utility.Utility;

public class Searches extends TestBase {
	
	@Test
	public void positiveSearches() throws IOException, InterruptedException
	{
		
		Helper.Click(driver,Utility.propertyRead(Constants.selectLoc_file,"loc_dropdown_xpath_slt"));
		Helper.selectIndex(driver, Utility.propertyRead(Constants.selectLoc_file,"loc_dropdown_xpath_slt"), 3);
		 driver.findElement(By.xpath("(//input[@name=\"searchText\"])[3]")).click();
		 
		
	}

}
