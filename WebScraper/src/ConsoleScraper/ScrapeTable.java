package ConsoleScraper;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScrapeTable {

	public void scrape(String html) throws IOException {

		ArrayList<String> rowData = new ArrayList<String>();

		System.out.println("scrape Online class starting");
		Document doc = Jsoup.parse(html, "UTF-8");

		Element table = doc.select("table").first();

		Elements rowsCount = table.getElementsByTag("tr"), totalColsCount = table.getElementsByTag("td");

		int colsCount = totalColsCount.size() / rowsCount.size();

		for (Element row : table.select("tr")) {
			for (Element col : row.select("td")) {
				rowData.add(col.text());
			}
		}

		System.out.println(rowData.size());

		ArrayList<Stock> stockList = shortStockList(rowData, rowsCount.size(), colsCount);
//		
//		for(Stock shares : stockList) {
//			System.out.println(shares.symbol+" | "+shares.lastprice);
//		}
	}

	public ArrayList<Stock> shortStockList(ArrayList<String> tableData, int row, int col) {

		ArrayList<Stock> stockList = new ArrayList<Stock>();
		ArrayList<String> stockArray = new ArrayList<String>();

		int dataCount=tableData.size();
		int symbol = 0;
		int lastPrice = 1;

		for (int idx = 0; idx <; idx++) {
//			System.out.println("idx: "+idx+" | "+tableData.get(idx));
			Stock share = new Stock(tableData.get(symbol), tableData.get(lastPrice));
			symbol = symbol + 12;
			lastPrice = lastPrice + 12;
			stockList.add(share);
			
			if (lastPrice==166) {
				break;
			}
		}

		for (Stock item : stockList) {
			System.out.println(item.symbol+" | "+item.lastprice);
		}
		
//		do {
//			
//		}while(symbol!= 0);

		return stockList;
	}
}

//0	String symbol;
//1	String lastprice;
//2	String change;
//3	String changepercentage;
//4	String Currency;
//5	String markettime;
//6	String volume;
//7	String shares;  returns -
//8	String avgvol3m;
//12	String marketcap;