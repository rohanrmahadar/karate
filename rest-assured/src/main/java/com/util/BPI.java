package com.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BPI {
	@JsonProperty
	private USD USD;
	@JsonProperty
	private GBP GBP;
	@JsonProperty
	private EUR EUR;
	
	public USD getUSD() {
		return USD;
	}
	public void setUSD(USD uSD) {
		USD = uSD;
	}
	public GBP getGBP() {
		return GBP;
	}
	public void setGBP(GBP gBP) {
		GBP = gBP;
	}
	public EUR getEUR() {
		return EUR;
	}
	public void setEUR(EUR eUR) {
		EUR = eUR;
	}
	
	
	
}
