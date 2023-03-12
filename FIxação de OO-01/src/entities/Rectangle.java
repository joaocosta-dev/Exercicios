package entities;

public class Rectangle {
	
	public double widht;
	public double height;
	
	public double area() {
		double area;
		return area  = widht*height;
	}
	
	public double perimeter() {
		double perimeter;
		return perimeter= (widht*2)+(height*2);
	}
	public double diagonal() {
		double diagonal;
		return diagonal= Math.sqrt(Math.pow(widht,2)+Math.pow(height,2));
	}
}
