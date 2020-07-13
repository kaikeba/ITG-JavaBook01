package com.kkb.tz.test;

public class Address implements Cloneable {
	private String provices;
	private String city;

	public void setAddress(String provices, String city) {
		this.provices = provices;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [provices=" + provices + ", city=" + city + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}