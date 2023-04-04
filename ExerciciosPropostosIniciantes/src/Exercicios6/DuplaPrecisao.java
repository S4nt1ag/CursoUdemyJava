package Exercicios6;

import java.util.Locale;
import java.util.Scanner;

public class DuplaPrecisao {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		final double pi = 3.14159;
		double trianguloRetangulo = (a*c)/2;
		double areaCirculo = pi*(c*c);
		double trapezio = ((a+b)*c)/2;
		double areaQuadrado = b*b;
		double areaRetangulo = a*b;
		
		System.out.printf("Triangulo: %.3f%n", trianguloRetangulo);
		System.out.printf("Circulo: %.3f%n", areaCirculo);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retangulo: %.3f%n", areaRetangulo);
		
		
		sc.close();
	}

}
