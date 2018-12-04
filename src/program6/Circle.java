package program6;

public class Circle extends Shape  {

	private double radious;
	
	
	public Circle(double radious,String shapeName,double area, double volume) {
		
		this.radious = radious;
		
		setArea(area);
		setVolume(volume);
		setShapeName(shapeName);
		
		
		

	
}

	
	public double getArea(double radious) {
		
		return Math.PI * radious * radious;
	}

	
	public double getVolume(double radious) {
		
		return 4/3 * Math.PI *radious *radious *radious;
	}

	
	
}
