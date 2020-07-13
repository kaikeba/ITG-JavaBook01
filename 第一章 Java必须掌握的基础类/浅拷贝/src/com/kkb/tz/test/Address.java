package com.kkb.tz.test;

public class Address {

	private String provices;
	private String city;

	public void setAddress(String provices,String city){
	 this.provices = provices;
	 this.city = city;
	 
	      }   
	@Override
	      public String toString() {
	          return "Address [provices=" + provices + ", city=" + city + "]";
	      }

}
