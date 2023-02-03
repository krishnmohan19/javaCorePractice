package com.incedo.inc;

public class Address extends Object{
	int flatNo;
	String area;
	String city;
	String state;
	String country;
	
	public Address(int flatNo,String area,String city,String state,String country) {
		this.flatNo=flatNo;
		this.area=area;
		this.city=city;
		this.state=state;
		this.country=country;
	}
   
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo  + ", area=" + area + ", city=" + city + ", state="
				+ state + ", country=" + country + "]";
	}
	
	

}
