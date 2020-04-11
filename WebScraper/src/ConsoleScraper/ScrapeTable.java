package ConsoleScraper;

import java.awt.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class ScrapeTable {

	public void scrape(String html) throws IOException {
		
		System.out.println("scrape class starting");
		Document doc = Jsoup.parse(html, "UTF-8");
		System.out.println("got page ... ");
		ArrayList<String> data=new ArrayList<String>();
		
		Element table = doc.select("tbody").first();

		Elements tableData = table.getElementsByTag("td");
		
		for (Element shares : tableData) {
		  String tableRow = shares.attr("tr");
		  String share = shares.text();
		  data.add(share);
		}
		System.out.println("Stored data");
		
		for(String share : data) {
			System.out.println(share);
		}
	}
}