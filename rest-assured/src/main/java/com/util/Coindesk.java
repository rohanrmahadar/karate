package com.util;

public class Coindesk {

	private String disclaimer;
	private String chartName;
	private Time time;
	private BPI bpi;

	public String getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public String getChartName() {
		return chartName;
	}

	public void setChartName(String chartName) {
		this.chartName = chartName;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public BPI getBpi() {
		return bpi;
	}

	public void setBpi(BPI bpi) {
		this.bpi = bpi;
	}

}
