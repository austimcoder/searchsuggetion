package com.searchsuggestion.searchsuggetion.core;

public class StringFrequency {
	
	private String string;
	
	private long count;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public StringFrequency(String string, long count) {
		super();
		this.string = string;
		this.count = count;
	}
	
	

}
