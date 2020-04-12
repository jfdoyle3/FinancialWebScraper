package ConsoleScraper;


import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class ScrapeTable {

	public void scrape(String html) throws IOException {

		ArrayList<String> data = new ArrayList<String>();

		System.out.println("scrape Online class starting");
		Document doc = Jsoup.parse(html, "UTF-8");
		Element bodyElements = doc.body();

		Elements rowsCount = bodyElements.getElementsByTag("tr"),
			     totalColsCount = bodyElements.getElementsByTag("td");

		int colsCount = totalColsCount.size() / rowsCount.size();

		for (int rows = 0; rows < rowsCount.size(); rows++) {
			for (int cols = 0; cols < colsCount; cols++) {

				System.out.println(totalColsCount.get(cols).text());
			}
			//System.out.println(rowsCount.get(rows).text());
		}
		System.out.println("Stored data");

		System.out.println("end of line");
	}
}