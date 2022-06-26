package pom.steps.designing.SeleniumElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

public class AmazonPassword extends SetupConfigFileCode_BaseFile {
	
	
	
	public static void amazonpassword() throws IOException
	{
		String amazonpassword= load_configfile1.getProperty("FbPassword");
		WebElement amazon_password_textbox = amazondriver.findElement(By.xpath("//*[contains (@placeholder, 'Password')]"));
		amazon_password_textbox.click();
		amazon_password_textbox.sendKeys(amazonpassword);
		System.out.println(amazon_password_textbox.getText());
	
	}
	
	public static void amazonInvalidpassword() throws IOException
	{
		String amazonInvalidpass= load_configfile1.getProperty("FbInvaidPassword");
		WebElement amazon_password_textbox = amazondriver.findElement(By.xpath("//*[contains (@placeholder, 'Password')]"));
		amazon_password_textbox.click();
		amazon_password_textbox.sendKeys(amazonInvalidpass);
		System.out.println(amazon_password_textbox.getText());
	
	}
	
	public static void fbblankpassword() throws IOException
	{
		String amazonInvalidpass= load_configfile1.getProperty("FbInvaidPasswordblank");
		WebElement amazon_password_textbox = amazondriver.findElement(By.xpath("//*[contains (@placeholder, 'Password')]"));
		amazon_password_textbox.click();
		amazon_password_textbox.sendKeys(amazonInvalidpass);
		System.out.println("Blank Entered Below"+ "\n"+amazon_password_textbox.getText());
	
	}
	
}
