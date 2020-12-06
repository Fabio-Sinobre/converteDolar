package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	public double perimetro() {
		return 2*(width + height);
	}
	public double pitagoras() {
		return Math.sqrt(width*width + height*height);
	}

}