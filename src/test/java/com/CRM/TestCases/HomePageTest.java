package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass
{
  @Test(priority = 1)
  public void verifyUrl() 
  {
	  String curl = hp.getAppUrl();
	  Assert.assertTrue(curl.contains("crm"),"Url is wrong");
	  System.out.println("URL is Valid: " + hp.getAppUrl());
  }
  @Test(priority = 2)
  public void verifyTitle() 
  {
	    Assert.assertTrue(hp.getAppTitle().contains("Service"), "Title not Matched");
	    System.out.println("Title Matched: " + hp.getAppTitle());
  }
  @Test(priority = 3)
  public void verifySignIn() 
  {
	    hp.getSignIn();
	    Assert.assertTrue(hp.getAppUrl().contains("login"), "Test Fail: Login page not open");
	    System.out.println("Test Pass: Login Pgae gets open");
  }
}
