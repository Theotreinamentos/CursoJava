package entities;

public class IntrProgOrientadaObjetos_Rectangle {
	public double witdth;
	public double height;
	
	
	public double area() {
		return witdth * height;
	}
	public double perimeter() {
		return 2* (witdth + height);
	}
	public double diagnal() {
		return Math.sqrt(witdth * witdth + height * height);
	}
}
