package program6;




public class Triangle extends Shape{

	private double length,base,height;
	
	
	public Triangle(double length, double height,double area, double volume,String shapName,double base) {
		
		this.length = length;
		this.base = base;
		this.height = height;
		setArea(area);
		setVolume(volume);
		setShapeName(shapeName);
		
		
	}
	
	
	public double getArea(double length, double base, double height) {
		
		return base*(height/2);
		
	}

	
	public double getVolume(double length, double base, double height) {
		
		return length * base * (height/3);
		
	}
	
	
		
		
	}
	

//Triangle volume: length * base * height/3
//Triangle area: base * height/2