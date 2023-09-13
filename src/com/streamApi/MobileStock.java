package com.streamApi;

public class MobileStock {
	String mobileName;
	int idno;
	int price;
	public MobileStock(String mobileName, int idno, int price) {
		this.mobileName = mobileName;
		this.idno = idno;
		this.price = price;
	}
	@Override
	public String toString() {
		return  mobileName+" "+"idno. "+idno+" and the price is" +price;
	}
	
	
}
