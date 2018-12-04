package program6;

public class Rectangle extends Shape {

	private double length,width,height;
	
	public Rectangle(double length, double width, double height, double area, double volume,String shapName) {
		
		this.length = length;
		this.width = width;
		this.height = height;
		
		setArea(area);
		setVolume(volume);
		setShapeName(shapeName);
		
	}

	
	public double getVolume(double length, double width, double height) {
		
		return length*width*height;
		
	}
	
	public double getArea(double length, double width, double height) {
		return length * width;
		
	}

}
//Rectangle area: length * width
//Rectangle volume: length * width * height