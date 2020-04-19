package ConsoleScraper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScrapeTable {

	public void scrape(String html) throws IOException {

		ArrayList<String> tableData = new ArrayList<String>();


		System.out.println("scrape Online class starting");
		Document doc = Jsoup.parse(html, "UTF-8");

		Element table = doc.select("table").first();

		for (Element row : table.select("tr")) {
			tableData.addAll(row.select("td").eachText());
		}

		for (int rmv = 0; rmv < tableData.size(); rmv++) {
			tableData.remove("-");
			tableData.remove("USD");
		}
		
		//int idx=0;
		//for (String item : tableData) {
			
		//	System.out.println("idx :"+idx+" | "+item);
		//	System.out.println("---------------------------------");
		//	idx++;
			//if (idx%8==0) {
				
		//		System.out.println("\n New Row:");
			//}
		//}
		
		ScrapeTable.createStockList(tableData);

	}

	public static void createStockList(ArrayList<String> data) {

		ArrayList<Stock> stockList = new ArrayList<Stock>();


		int symbol = 0;
		int lastPrice = 1;
		int change = 2;
		int changePercentage = 3;
		int marketTime = 4;
		int volume = 5;
		int avgvol3m = 6;
		int marketCap = 7;
		int idx=0;
		
	do {
			Stock share = new Stock(data.get(symbol + idx), data.get(lastPrice + idx), data.get(change + idx),
					data.get(changePercentage + idx), data.get(marketTime + idx), data.get(volume + idx),
					data.get(avgvol3m + idx),data.get(marketCap + idx));
			idx++;
			if (idx%8==0) {
				stockList.add(share);
				//System.out.println("\n New Row:");
			}
			
		}while (idx==95);

	}
}
