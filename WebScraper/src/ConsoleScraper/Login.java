package ConsoleScraper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Login {

	public static void signIn() throws InterruptedException, IOException {

		FirefoxOptions headless = new FirefoxOptions();
		headless.setHeadless(true);

		WebDriver driver = new FirefoxDriver(headless);
		driver.get("https://finance.yahoo.com");
		try {
			WebDriverWait waitSignIn = new WebDriverWait(driver, 20);
			WebElement signIn = waitSignIn
					.until(presenceOfElementLocated(By.cssSelector("#header-signin-link > span")));
			signIn.click();

			WebDriverWait waitLogin = new WebDriverWait(driver, 20);
			waitLogin.until(ExpectedConditions.elementToBeClickable(By.id("login-username")));

			WebElement LoginField = driver.findElement(By.id("login-username"));
			LoginField.sendKeys("jfdoyle_iii");
			LoginField.sendKeys(Keys.ENTER);

			WebDriverWait waitPassword = new WebDriverWait(driver, 20);
			waitPassword.until(ExpectedConditions.elementToBeClickable(By.id("login-passwd")));

			WebElement passwordField = driver.findElement(By.id("login-passwd"));
			passwordField.sendKeys("nTmIcJyzyNSMqY");
			passwordField.sendKeys(Keys.ENTER);

			WebDriverWait waitPort = new WebDriverWait(driver, 20);
			waitPort.until(ExpectedConditions.elementToBeClickable(By.linkText("My Portfolio"))).click();
			WebDriverWait waitStocks = new WebDriverWait(driver, 30);
			waitStocks.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".IbBox > .Fz\\(14px\\)"))).click();

			TimeUnit.SECONDS.sleep(5);
			ScrapeTable data = new ScrapeTable();
			ArrayList<String> stockList = data.scrape(driver.getPageSource());
			StockList stockTable = new StockList();
			ArrayList<Stock> stocks = stockTable.createStockList(stockList);
			DataBaseWriter db = new DataBaseWriter();
			db.writeToDatabase(stocks);

		} finally {
			driver.quit();

		}

	}
}
