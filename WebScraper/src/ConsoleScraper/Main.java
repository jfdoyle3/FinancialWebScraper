package ConsoleScraper;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

		 Login.signIn();

		
	//	 Uncomment next line to have real time scrape to console.
//		FileScraper fs = new FileScraper();
	//	 fs.scrapeFile();
		//ArrayList<Stock> stockList=new ArrayList<Stock>();
		
		//DataBaseWriter db = new DataBaseWriter();
		//db.writeToDatabase(stockList); 
		
		System.out.println("end of line");
	}

}
