package pom.steps.designing.SeleniumElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;
public class AmazonSignout extends SetupConfigFileCode_BaseFile{


		public static void amazonTextHover() throws InterruptedException, IOException
		
		{
			Actions hovertext_hover = new Actions(amazondriver);
			WebElement txthover = amazondriver.findElement(By.xpath("//*[@aria-label='Your profile']"));
			hovertext_hover.moveToElement(txthover).click().build().perform();
			System.out.println("icon click");
			AmazonScreenshotsTakes.amazonscreenshot();
			Thread.sleep(10000);
		}
			
		public static void amazonTextclk() throws InterruptedException

		{
			
			Actions hovertext_clk = new Actions(amazondriver);

			WebElement actiontxtclick = amazondriver.findElement(By.xpath("//*[text()='Log Out']"));
			Thread.sleep(10000);
			hovertext_clk.moveToElement(actiontxtclick).click().build().perform();
			
		}
	}



