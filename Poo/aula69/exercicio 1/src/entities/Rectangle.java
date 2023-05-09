package entities;

public class Rectangle {

	public Double width, height;

	public Rectangle() {

	}

	public Rectangle(Double width, Double height) {

		this.width = width;
		this.height = height;
	}
	
	

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public double Area(double width, double height) {

		return width * height;
	}

	public double Perimeter(double width, double height) {

		return 2 * (width + height);
	}

	public double Diagonal(double width, double height) {

		return Math.sqrt((width * width) + (height * height));
	}

	
	
	
}
