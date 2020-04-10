package ConsoleScraper;

public class Stock {

	private String symbol;
	private String price;
	
	
	
	  public void setSymbol(String newSymbol) {
		this.symbol = newSymbol;
	  }
		  
	  public void setPrice(String newPrice) {
		this.price = newPrice;
	  }

	
	  public String getSymbol() {
	    return symbol;
	  }
	  
	  public String getPrice() {
	    return price;
	  }
}
