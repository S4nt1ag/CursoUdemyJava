package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and heigh:");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		rec.setWidth(width);
		rec.setHeight(height);
		
		System.out.printf("AREA = %.2f\n",rec.Area(width, height));
		System.out.printf("PERIMETER = %.2f\n",rec.Perimeter(width, height));
		System.out.printf("DIAGONAL = %.2f\n",rec.Diagonal(width, height));

		sc.close();

	}

}
