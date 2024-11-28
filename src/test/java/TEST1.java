import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("IND");
		Thread.sleep(5000);
        List<WebElement> searchResults = driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]"));
		
		for(WebElement er: searchResults)
		{
			System.out.println(er.getText());
			if(er.getText().contains("ind vs nz"))
			{
				er.click();
				System.out.println("clicked");
				break;
			}
		}
	}

}
