package com.liceolapaz.des.CJTB;

public class Triangulo {
	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	public Triangulo( double base, double altura, double lado1, double lado2) {
		super();
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public double area () {
		return (base*altura) /2;
	}
	public double perimetro() {
		return base+lado1+lado2;
	}
}
