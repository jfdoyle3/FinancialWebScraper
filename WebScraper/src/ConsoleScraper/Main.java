package ConsoleScraper;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

//		 Login.signIn();
		

	//	 Uncomment next line to have real time scrape to console.
//		 FileScraper fs = new FileScraper();
//		 fs.scrapeFile();
		String[] symbols= new String[]{"IBM","ABC","NBC","CBS"};
		String[] prices= new String[]{"$100.00","1000.00","24567.32","1.00"};
		ArrayList<Stock> stockList=new ArrayList<Stock>();
		
		
		for (int idx=0; idx<6; idx++) {
			double rndSym=Math.random()*4;
			double rndPrc=Math.random()*4;
			Stock shortShare = DummyStocks.ShortStock(symbols[(int)rndSym], prices[(int)rndPrc]);
			stockList.add(shortShare);
		}
		
//		System.out.println("stored list\nOutput:\n"+stockList.size()+" stocks in the list:\n");
//		for (Stock stocks : stockList) {
//			System.out.println(stocks.symbol+" | "+stocks.lastprice);
//		}
//		Stock shortShare = DummyStocks.ShortStock(symbol, lastprice);
//		Stock fullShare=DummyStocks.FullStock();
//		System.out.println(
//				fullShare.symbol + " | " + fullShare.lastprice + " | " + fullShare.change + " | " + fullShare.changepercentage + " | "
//						+ fullShare.markettime + " | " + fullShare.volume + " | " + fullShare.avgvol3m + " | " + fullShare.marketcap);

	//	System.out.println(shortShare.symbol + " | " + shortShare.lastprice);
		

		
		DataBaseWriter db = new DataBaseWriter();
		db.writeToDatabase(stockList);
	}

}
