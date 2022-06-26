package com.selenium.StepsImplmention;

import java.io.IOException;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

import pom.steps.designing.SeleniumElements.AmazonScreenshotsTakes;
import pom.steps.designing.SeleniumElements.AmazonSignIn;
import pom.steps.designing.SeleniumElements.AmazonSignout;
import pom.steps.designing.SeleniumElements.AmazonURLDesign;
import pom.steps.designing.SeleniumElements.AmazonPassword;
import pom.steps.designing.SeleniumElements.FbUserName;

public class FeatureAllSteps {
	
	
	
	@cucumber.api.java.en.Given("^Open Browser$")
	public static void opened_browser() throws IOException, InterruptedException
	{
		SetupConfigFileCode_BaseFile.amazonbroswersetup();

	}

	
	@cucumber.api.java.en.And("^Enter the Valid URL$")
	public static void url_entered() throws IOException, InterruptedException
	{
		

		AmazonURLDesign.amazonurlSetup();


	}

	@cucumber.api.java.en.And("^Users Takes the Screenshot$")
	public static void amazonSSTaken_Saved() throws IOException, InterruptedException
	{
		AmazonScreenshotsTakes.amazonscreenshot();


	}

	@cucumber.api.java.en.When("^Enter the Valid Email ID$")
	public static void urldentered() throws IOException, InterruptedException
	{
		FbUserName.amazonusername();


	}
	

	@cucumber.api.java.en.And("^Enter the Valid Password$")
	public static void password_entered() throws IOException,InterruptedException
	{
		AmazonPassword.amazonpassword();
		Thread.sleep(3000);


	}
	

	@cucumber.api.java.en.And("^Click on Login Button$")
	public static void amazon_login_clk() throws IOException, InterruptedException
	{
		AmazonSignIn.amazonSignInclk();
		Thread.sleep(8000);

	}
	@cucumber.api.java.en.And("^User Clicked on SignOut Button$")
	public static void signout_clk() throws IOException, InterruptedException
	{
		AmazonSignout.amazonTextHover();
		AmazonSignout.amazonTextclk();



	}
 

	@cucumber.api.java.en.Then("^Browser is Closed$")
	public static void opened_browser_closed() throws IOException, InterruptedException
	{
		SetupConfigFileCode_BaseFile.closeamazonDriver();
		

	}

	

}
