package Yahoo_Financial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class csharp_code {

	public static void main(String[] args) {
		
	
		 WebDriver driver = new FirefoxDriver();
	        WebDriverWait wait = new WebDriverWait(driver,10);
	    try {
		 WebDriverWait waitSignIn = new WebDriverWait(driver, 10);
         waitSignIn.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(By.Id("uh-signedin")));

         WebElement signIn = driver.FindElement(By.Id("uh-signedin"));
         signIn.click();

         WebDriverWait waitLogin = new WebDriverWait(driver,10);
         waitLogin.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(By.Id("login-username")));

         WebElement LoginField = driver.FindElement(By.Id("login-username"));
         LoginField.sendKeys("jfdoyle_iii");
         LoginField.sendKeys(Keys.ENTER);

         WebDriverWait waitPassword= new WebDriverWait(driver, 20);
         waitPassword.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(By.Id("login-passwd")));


         WebElement passwordField = driver.FindElement(By.Id("login-passwd"));
         passwordField.sendKeys("m93Fe8YHn");
         passwordField.sendKeys(Keys.ENTER);



         driver.Navigate().GoToUrl("https://finance.yahoo.com/portfolio/p_2/view/v1");
         WebDriverWait waitStockTable = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
         waitStockTable.Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementExists(By.XPath("//table")));

	        }finally {
	            driver.quit();
	        }
	}
}