package Yahoo_Financial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class csharp_code {

	public static void main(String[] args) {
		
		
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://finance.yahoo.com");
	    try {
		 WebDriverWait waitSignIn = new WebDriverWait(driver, 20);
		 WebElement signIn=  waitSignIn.until(presenceOfElementLocated(By.cssSelector("#header-signin-link > span")));
         signIn.click();
   
         WebDriverWait waitLogin = new WebDriverWait(driver,20);
         waitLogin.until(ExpectedConditions.elementToBeClickable(By.id("login-username")));
 
         WebElement LoginField = driver.findElement(By.id("login-username"));
         LoginField.sendKeys("jfdoyle_iii");
         LoginField.sendKeys(Keys.ENTER);

         WebDriverWait waitPassword= new WebDriverWait(driver, 20);
         waitPassword.until(ExpectedConditions.elementToBeClickable(By.id("login-passwd")));

         WebElement passwordField = driver.findElement(By.id("login-passwd"));
         passwordField.sendKeys("gIZiqxyILpfB1D");
         passwordField.sendKeys(Keys.ENTER);
         
         
		 driver.get("https://finance.yahoo.com/portfolio/p_2/view/v1");
		 WebDriverWait  waitStockTable = new WebDriverWait(driver,10);
		 waitStockTable.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table")));
			 

	        }finally {
	            driver.quit();
	        }
	    
	    System.out.println("successful");
	}
}