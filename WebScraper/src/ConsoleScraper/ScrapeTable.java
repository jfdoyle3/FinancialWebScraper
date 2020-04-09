package ConsoleScraper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ScrapeTable {

	public static void scrape() throws IOException {
		/*
		 * driver.get("https://finance.yahoo.com/portfolio/p_2/view/v1"); WebDriverWait
		 * waitStockTable = new WebDriverWait(driver,10);
		 * waitStockTable.until(ExpectedConditions.presenceOfElementLocated(By.
		 * cssSelector("table.W\\(100\\%\\)")));
		 */
	 Document doc = Jsoup.connect("https://finance.yahoo.com/portfolio/p_2/view/v1").get();
	 System.out.println(doc.text());
	
		/*
		 * for(Element tableElement : tables){ if(tableElement.hasClass("W(100%)")){
		 * table = tableElement; } final String number = row.select("td").text();
		 * System.out.println(number);
		 * 
		 * final HttpResponse<String>
		 * response=Unirest.get("https://finance.yahoo.com/portfolio/p_2/view/v1").
		 * asString(); //System.out.println(response.getBody());
		 * 
		 * final Document htmlSnippet = Jsoup.parseBodyFragment(response.getBody());
		 * System.out.println("Got Snippet");
		 * 
		 * Elements tables = htmlSnippet.select("table"); Element table = null;
		 * 
		 * for(Element tableElement : tables){ if(tableElement.hasClass("W(100%)")){
		 * table = tableElement; } } System.out.println(table);
		 */
		//System.out.println(htmlSnippet.child(0).text());
		/*
		 * Elements stockTable = doc.select("table.W\\(100\\%\\)"); for (Element td :
		 * stockTable) { System.out.println(stockTable.text()); }
		 */
		/*
		 * List<String> myList=new List<String>();
		 */			/*
		 * List<List<String>> stockTable =
		 * financePage.DocumentNode.SelectSingleNode("//table") .Descendants("tr")
		 * .Skip(1) .Where(tr => tr.Elements("td").Count()>1) .Select(tr =>
		 * tr.Elements("td").Select(td => td.InnerText.Trim()).ToList()) .ToList();
		 */
	
	
         //   driver.quit(); 
	 System.out.println("end of line");
     }
}
 






/*
* final String search="bicycle"; final String where="ri";
* 
* 
* 
* final HttpResponse<String> response = Unirest
* .get("https://www.yellowpages.com/search?") .queryString("search_terms",
* search) .queryString("geo_location_terms",where) .asString();
* 
* System.out.println(response.getBody());
* 
* 
* final Document htmlSnippet = Jsoup.parseBodyFragment(response.getBody());
* System.out.println("Got Snippet"); //
* System.out.println(htmlSnippet.outerHtml()); {
* 
* for (Element bikeShops : htmlSnippet.select("div.info")) {
* //System.out.println("results:");
* System.out.println(peopleResult.outerHtml());
* //System.out.println(bikeShops.child(1).text());
* 
* final String businnessName=bikeShops.child(0).text();
* 
* System.out.println(businnessName); }
* 
* System.out.println("end of line"); }
*/

