package ConsoleScraper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FileScraper {

	public void scrapeFile() {

		System.out.println("scrape File class starting");
		String path = "R:\\\\website\\\\Stocks - Stock Portfolio & Tracker - Yahoo Finance.htm";
		// ArrayList<ArrayList<String>> dataTable = new ArrayList<ArrayList<String>>();

		try {

			String input = Files.readString(Paths.get(path));

			Document doc = Jsoup.parse(input, "UTF-8");
			Element bodyElements = doc.body();

			Elements rowsCount = bodyElements.getElementsByTag("tr"),
					totalColsCount = bodyElements.getElementsByTag("td");

			int colsCount = totalColsCount.size() / rowsCount.size();

			for (int rows = 1; rows < rowsCount.size(); rows++) {
//				for (int cols = 0; cols < colsCount; cols++) {
//	
//					 System.out.println(totalColsCount.get(cols).text());
//				}
				System.out.println(rowsCount.get(rows).text());
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("end of line");
	}

	public void workingDemo() {

		System.out.println("Scraping File");
		String path = "R:\\\\website\\\\Stocks - Stock Portfolio & Tracker - Yahoo Finance.html";
		ArrayList<String> data = new ArrayList<String>();

		try {

			String input = Files.readString(Paths.get(path));

			Document doc = Jsoup.parse(input, "UTF-8");

			Element table = doc.select("table").first();
			Elements tableData = table.getElementsByTag("td");

			for (Element shares : tableData) {
				String tableRow = shares.attr("tr");
				String share = shares.text();
				data.add(share);
				System.out.println(share);
			}
			System.out.println("Stored data");

			for (String share : data) {
				System.out.println(share);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void listToTable(ArrayList<String> tableData, int row, int col) {
		
		ArrayList<ArrayList<String>> dataTable=new ArrayList<ArrayList<String>>();
		ArrayList<String> getRow=new ArrayList<String>();
		
		for(int tblRow=1; tblRow<row; tblRow++) {
			for(int tblCol=0; tblCol<col; tblCol++) {
				getRow.add(tableData.get(tblCol));
			}
			dataTable.add(getRow);
		}
	}
}
