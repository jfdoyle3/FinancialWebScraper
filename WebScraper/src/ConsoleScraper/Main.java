package ConsoleScraper;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Login.signIn();

		DataBaseWriter  db=new DataBaseWriter ();
		db.writeToDatabase();
		
		// Uncomment next line to have real time scrape to console.
		//FileScraper fs = new FileScraper();
		//fs.scrapeFile();

	}

}
