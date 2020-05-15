package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stocktable")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "datestamp")
	private String datestamp;

	@Column(name = "symbol")
	private String symbol;
	
	@Column(name = "lastprice")
	private String lastprice;
	
	@Column(name = "pricechange")
	private String pricechange;
	
	@Column(name = "changepercentage")
	private String changepercentage;
	
	@Column(name = "markettime")
	private String markettime;
	
	@Column(name = "volume")
	private String volume;
	
	@Column(name = "avgvol")
	private String avgvol;
	
	@Column(name = "marketcap")
	private String marketcap;
	

	public Stock() {

	}

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

	public int getId() {
		return id;
	}
	

	public String getDatestamp() {
		return datestamp;
	}

	public void setDatestamp(String datestamp) {
		this.datestamp = datestamp;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getLastprice() {
		return lastprice;
	}

	public void setLastprice(String lastprice) {
		this.lastprice = lastprice;
	}

	public String getPricechange() {
		return pricechange;
	}

	public void setPricechange(String pricechange) {
		this.pricechange = pricechange;
	}

	public String getChangepercentage() {
		return changepercentage;
	}

	public void setChangepercentage(String changepercentage) {
		this.changepercentage = changepercentage;
	}

	public String getMarkettime() {
		return markettime;
	}

	public void setMarkettime(String markettime) {
		this.markettime = markettime;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getAvgvol() {
		return avgvol;
	}

	public void setAvgvol(String avgvol) {
		this.avgvol = avgvol;
	}

	public String getMarketcap() {
		return marketcap;
	}

	public void setMarketcap(String marketcap) {
		this.marketcap = marketcap;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", datestamp=" + datestamp + ", symbol=" + symbol + ", lastprice=" + lastprice
				+ ", pricechange=" + pricechange + ", changepercentage=" + changepercentage + ", markettime="
				+ markettime + ", volume=" + volume + ", avgvol=" + avgvol + ", marketcap=" + marketcap + "]";
	}


}
