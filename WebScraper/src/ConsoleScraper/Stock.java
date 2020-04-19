package ConsoleScraper;

public class Stock {

	String symbol;
	String lastprice;
	String pricechange;
	String changepercentage;
	String markettime;
	String volume;
	String avgvol;
	String marketcap;

	public Stock(String Symbol, String LastPrice, String PriceChange, String ChangePercentage, String MarketTime,
			String Volume, String AvgVol, String MarketCap) {

		this.symbol = Symbol;
		this.lastprice = LastPrice;
		this.pricechange = PriceChange;
		this.changepercentage = ChangePercentage;
		this.markettime = MarketTime;
		this.volume = Volume;
		this.avgvol = AvgVol;
		this.marketcap = MarketCap;
	}
}
