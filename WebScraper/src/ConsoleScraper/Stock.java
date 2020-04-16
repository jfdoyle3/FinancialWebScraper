package ConsoleScraper;

public class Stock {

	String symbol;
	String lastprice;
	String change;
	String changepercentage;
	String markettime;
	String volume;
	String avgvol3m;
	String marketcap;

// Copy and Paste where needed	
//	Stock share = new Stock(symbol, lastprice, change, changepercentage, markettime, volume, avgvol3m, marketcap);
//	Stock share = new Stock(symbol, lastprice);
//	System.out.println(share.symbol + " | " + share.lastprice + " | " + share.change + " | " + share.changepercentage+ " | "
//			+ share.markettime + " | " + share.volume + " | " + share.avgvol3m + " | " + share.marketcap);

	public Stock(String Symbol, String LastPrice, String Change, String ChangePercentage, String MarketTime,
			String Volume, String AvgVol3m, String MarketCap) {

		this.symbol = Symbol;
		this.lastprice = LastPrice;
		this.change = Change;
		this.changepercentage = ChangePercentage;
		this.markettime = MarketTime;
		this.volume = Volume;
		this.avgvol3m = AvgVol3m;
		this.marketcap = MarketCap;
	}

	public Stock(String Symbol, String LastPrice) {

		this.symbol = Symbol;
		this.lastprice = LastPrice;
	}

}
