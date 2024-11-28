package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import lib.BasePage;

public class Utilities extends BasePage{
	
	public Utilities(WebDriver driver) {
super(driver);
}

	public void autoseggestiondropdown(List<WebElement> element,String expected)
	{
		for(WebElement er: element)
			{
				System.out.println(er.getText());
				if(er.getText().contains(expected))
				{
					er.click();
					System.out.println("clicked");
					break;
				}
			}
	}
	
}
