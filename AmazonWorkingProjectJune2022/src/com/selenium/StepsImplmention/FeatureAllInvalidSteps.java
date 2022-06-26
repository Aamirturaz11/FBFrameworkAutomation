package com.selenium.StepsImplmention;

import java.io.IOException;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

import pom.steps.designing.SeleniumElements.AmazonScreenshotsTakes;
import pom.steps.designing.SeleniumElements.AmazonSignIn;
import pom.steps.designing.SeleniumElements.AmazonSignout;
import pom.steps.designing.SeleniumElements.AmazonURLDesign;
import pom.steps.designing.SeleniumElements.AmazonPassword;
import pom.steps.designing.SeleniumElements.FbUserName;

public class FeatureAllInvalidSteps {
	
	
	@cucumber.api.java.en.When("^Enter the InValid Email ID$")
	public static void urldentered() throws IOException, InterruptedException
	{
		FbUserName.invalidamazonusername();
		Thread.sleep(3000);
	}
	
	
	@cucumber.api.java.en.And("^Two Fector Verication$")
	public static void tofactorcodetered() throws IOException, InterruptedException
	{
		AmazonSignIn.enter_digits_code();
		Thread.sleep(9000);
	}
	
	@cucumber.api.java.en.And("^Enter the InValid Password$")
	public static void password_entered() throws IOException,InterruptedException
	{
		AmazonPassword.amazonInvalidpassword();
		Thread.sleep(3000);
	}
	
	@cucumber.api.java.en.When("^Enter the  Email ID as blank via Enter the Password as blank$")
	public static void Invalidpassword_via_Invalidusername_entered() throws IOException,InterruptedException
	{
	
		FbUserName.fbblankusername();
		Thread.sleep(3000);

		AmazonPassword.fbblankpassword();
		Thread.sleep(3000);
	}
	
	
	

}
