package com.liceolapaz.des.CJTB;

import java.util.Scanner;

public class PRINCIPAL {

	public static void main(String[] args) {
		while(true) {
			
		escribirMenu();
		pedirOpcion();
		int opcion = leerOpcion();
		switch (opcion) {
		case 1:{
			//pedir valores
			pedirAltura();
			double altura = leerValor();
			pedirBase();
			double base = leerValor();
			pedirLado1();
			double lado1 = leerValor();
			pedirLado2();
			double lado2 = leerValor();
			// definir triangulo y llamar los los constructores de la clase trinagulo 
			Triangulo triangulo = new Triangulo(base, altura, lado1, lado2);
			//LLamar los metodos abastraptos con la clase triagulo 
			double area = triangulo.area();
			double perimetro = triangulo.perimetro();
			resultados(perimetro, area);
			break;
			}
		case 2:{
			pedirAltura();
			double altura = leerValor();
			pedirBase();
			double base = leerValor();
			Rectangulo rectangulo = new Rectangulo(base, altura);
			double area = rectangulo.area();
			double perimetro = rectangulo.perimetro();
			resultados(perimetro, area);
			break;
			}
		case 3:{
			pedirLado();
			double lado = leerValor();
			Cuadrado cuadrado = new Cuadrado(lado);
			double area = cuadrado.area();
			double perimetro = cuadrado.perimetro();
			resultados(perimetro, area);
			break;
			}
		case 4:{
			pedirApotema();
			double apotema = leerValor();
			pedirLado();
			double lado = leerValor();
			Pentagono pentagono = new Pentagono(apotema, lado);
			double perimetro = pentagono.perimetro();
			double area = pentagono.area();
			resultados(perimetro, area);
			break;
			}
		case 0:
			System.out.println("Adios");
			System.exit(0);
			break;
		default:
			System.out.println("Opcion no permitida, regresando al menu principal...");
		}
			
		}
		}
		
	private static void resultados(double perimetro, double area) {
		System.out.println("El �rea es " + area + " y el per�metro es " + perimetro);
		
	}
	private static void pedirApotema() {
		System.out.print("Escriba el valor de Apotema de la figura: ");
		
	}

	private static void pedirLado() {
		System.out.print("Escriba el valor del lado de la figura: ");
	
	}



	private static void pedirLado2() {
		System.out.print("Escriba el valor del lado Izquierdo: ");
		
	}

	private static void pedirLado1() {
		System.out.print("Escriba el valor del lado Derecho: ");
		
	}

	private static void pedirAltura() {
		System.out.print("Escriba el valor de la Altura de la figura: ");
		
	}

	private static double leerValor() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}

	private static void pedirBase() {
		System.out.print("Escriba el valor de la Base de la figura: ");
		
	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		return opcion;
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una figura: ");
		
	}

	private static void escribirMenu() {
		System.out.println("FIGURAS GEOM�TRICAS\r\n" + 
				"1. Tri�ngulo\r\n" + 
				"2. Rect�ngulo\r\n" + 
				"3. Cuadrado\r\n" + 
				"4. Pent�gono\r\n" + 
				"0. Salir\r\n");
		
	}

}
