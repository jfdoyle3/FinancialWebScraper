package ConsoleScraper;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

//		 Login.signIn();

//		 DataBaseWriter db=new DataBaseWriter ();
//		 db.writeToDatabase();

	//	 Uncomment next line to have real time scrape to console.
//		 FileScraper fs = new FileScraper();
//		 fs.scrapeFile();

		Stock shortShare = DummyStocks.ShortStock();
//		Stock fullShare=DummyStocks.FullStock();
//		System.out.println(
//				fullShare.symbol + " | " + fullShare.lastprice + " | " + fullShare.change + " | " + fullShare.changepercentage + " | "
//						+ fullShare.markettime + " | " + fullShare.volume + " | " + fullShare.avgvol3m + " | " + fullShare.marketcap);

		System.out.println(shortShare.symbol + " | " + shortShare.lastprice);
		
		DataBaseWriter db = new DataBaseWriter();
		db.writeToDatabase(shortShare);
	}

}
