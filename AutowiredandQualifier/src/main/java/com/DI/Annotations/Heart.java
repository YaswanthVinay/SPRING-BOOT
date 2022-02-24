package com.DI.Annotations;

public class Heart {

	private  String pen;

	public String getPen() {
		return pen;
	}

	public void setPen(String pen) {
		this.pen = pen;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

private int Price;

	public void pump() {
		System.out.println("your heart is pumping");
		System.out.println("you are alive");
	
	}
	public void newmethod() {
		System.out.println("i am going to buy a "+pen+" the price of the pen "+Price);
	}
	
}
