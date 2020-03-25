package com.liceolapaz.des.CJTB;

public class Pentagono {
	
	private double apotema;
	private double lado;
	public Pentagono(  double apotema, double lado) {
		super();
	
		this.apotema = apotema;
		this.lado = lado;
	}
	
	public double perimetro() {
		return lado*5;
		
	}
	public double area(){
		return (perimetro()*apotema) /2;
	}
}
