package ConsoleScraper;

public class DummyStocks {

	public static Stock FullStock() {
		String symbol;
		String lastprice;
		String change;
		String changepercentage;
		String markettime;
		String volume;
		String avgvol3m;
		String marketcap;

		symbol = "FULL";
		lastprice = "$1,000.00";
		change = "4%";
		changepercentage = "$23.00";
		markettime = "4:00pm";
		volume = "5%";
		avgvol3m = "12%";
		marketcap = "45b";

		Stock share = new Stock(symbol, lastprice, change, changepercentage, markettime, volume, avgvol3m, marketcap);

//		System.out.println(
//				share.symbol + " | " + share.lastprice + " | " + share.change + " | " + share.changepercentage + " | "
//						+ share.markettime + " | " + share.volume + " | " + share.avgvol3m + " | " + share.marketcap);
		return share;
	}

	public static Stock ShortStock(String symbol, String lastprice) {
//		String symbol;
//		String lastprice;
//
//		symbol = "SHORT";
//		lastprice = "$1.00";

		Stock share = new Stock(symbol, lastprice);
//		System.out.println(share.symbol + " | " + share.lastprice);

		return share;
	}


}
