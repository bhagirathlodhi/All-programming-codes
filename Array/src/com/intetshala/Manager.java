package com.intetshala;

public class Manager {
	
	public static void main(String[] args) {
		Espresso e=new Espresso();
		Cappuccino c =new Cappuccino();
		Latte l =new Latte();
		e.Milk();
		e.Cream();
		e.Latte();
		c.Milk();
		c.Cream();
		c.Latte();
		l.Milk();
		l.Cream();
		l.Latte();
		
	}

}
