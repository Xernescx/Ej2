package com.liceolapaz.des.CJTB;

public class Rectangulo {
	private double base;
	private double altura;
	public Rectangulo( double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
		
	}
	public double area () {
		return base*altura;

	}
	public double perimetro() {
		return base+base+altura+altura;
		
	}
}
