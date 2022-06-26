package pom.steps.designing.SeleniumElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

public class FbUserName extends SetupConfigFileCode_BaseFile {
	
	
	
	public static void amazonusername() throws IOException
	{
		String amazonEmail= load_configfile1.getProperty("FbEmail_or_Mobilenumber");
		WebElement amazon_useremail_textbox = amazondriver.findElement(By.xpath("//*[contains (@placeholder, 'Email address')]"));
		amazon_useremail_textbox.click();
		amazon_useremail_textbox.sendKeys(amazonEmail);
		System.out.println(amazon_useremail_textbox.getText());
	
	}
	
	public static void invalidamazonusername() throws IOException
	{
		String amazonEmail= load_configfile1.getProperty("InvalidMobilenumber");
		WebElement amazon_useremail_textbox = amazondriver.findElement(By.xpath("//*[contains (@placeholder, 'Email address')]"));
		amazon_useremail_textbox.click();
		amazon_useremail_textbox.sendKeys(amazonEmail);
		System.out.println(amazon_useremail_textbox.getText());
	
	}
	
	public static void fbblankusername() throws IOException
	{
		String amazonEmail= load_configfile1.getProperty("InvalidMobilenumberblank");
		WebElement amazon_useremail_textbox = amazondriver.findElement(By.xpath("//*[contains (@placeholder, 'Email address')]"));
		amazon_useremail_textbox.click();
		amazon_useremail_textbox.sendKeys(amazonEmail);
		System.out.println("Blank Entered Below"+ "\n"+amazon_useremail_textbox.getText());
	
	}
	
}
