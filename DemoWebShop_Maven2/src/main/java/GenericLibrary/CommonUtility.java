package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility {
	
	Select s; 
	public int generteRandomNumber() {
		Random r = new Random();
		return r.nextInt(1000);
	}
	public void screenShot(WebDriver driver,String name) {
		String path = FrameWorkConstants.Screenshot_path+name+".png";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(path);
		try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void acceptAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void dismissAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void selectDropDownbyIndex(WebElement dropdown , int indexnum) {
		s = new Select(dropdown);
		s.selectByIndex(indexnum);
		
	}
	public void selectDropDownbyValue(WebElement dropdown , String value) {
		s = new Select(dropdown);
		s.selectByValue(value);
		
	}
	public void selectDropDownbyVisibleText(WebElement dropdown , String text) {
		s = new Select(dropdown);
		s.selectByVisibleText(text);
		
	}
}
