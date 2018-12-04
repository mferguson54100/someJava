package program6;

public class Square extends Shape {

	private double side;
	
	public Square(double side,double area,double volume,String shapeName){
		
		this.side = side;
		
		setArea(area);
		setVolume(volume);
		setShapeName(shapeName);
		
		
	}

	
	public double getArea(double side) {
		
		return side * side;
	}

	
	public double getVolume(double side) {
		
		return side * side * side;
	}
	

}

//Square area: side * side
//Square volume: side * side * side