package com.atmecs.konakart.script;


import java.io.IOException;



import org.testng.annotations.Test;

import com.atmecs.konakart.constant.Constants;
import com.atmecs.konakart.helper.Helper;
import com.atmecs.konakart.testbase.TestBase;
import com.atmecs.konakart.utility.Utility;



/**
 * In the search list box select any of the value from the drop down and perform  searches.(positive and negative test)
 * @author ranjitha.selvam
 *
 */
public class Searches extends TestBase {
	

	
	@Test
	public void positiveSearches() throws IOException, InterruptedException
	{
		Helper.implicitWait(driver);
		Helper.click(driver,Utility.propertyRead(Constants.selectLoc_file,"loc_dropdown_xpath_slt"));
		Helper.selectIndex(driver, Utility.propertyRead(Constants.selectLoc_file,"loc_dropdown_xpath_slt"), 3);
	    //driver.findElement(By.xpath("(//input[@name='searchText'])[3]")).sendKeys("drama");
		Helper.sendValues(driver,Utility.propertyRead(Constants.selectLoc_file,"loc_searchtext_xpath_txt"),"drama");
	    Helper.click(driver, Utility.propertyRead(Constants.selectLoc_file, "loc_search_xpath_btn"));
	    Helper.getText(driver,Utility.propertyRead(Constants.selectLoc_file,"loc_product_xpath_txt"));
	    
		 
		
	}

}
