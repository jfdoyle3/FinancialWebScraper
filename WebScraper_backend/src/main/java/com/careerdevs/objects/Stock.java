package com.careerdevs.objects;

public class Stock {

	private String symbol;
	private String lastPrice;
	private String priceChange;
	private String changePercentage;
	private String marketTime;
	private String volume;
	private String avgvol;
	private String marketCap;
	
	public Stock(String symbol, String lastPrice, String priceChange, String changePercentage, String marketTime,
			String volume, String avgvol, String marketCap) {
		this.symbol = symbol;
		this.lastPrice = lastPrice;
		this.priceChange = priceChange;
		this.changePercentage = changePercentage;
		this.marketTime = marketTime;
		this.volume = volume;
		this.avgvol = avgvol;
		this.marketCap = marketCap;
	}
	



}
