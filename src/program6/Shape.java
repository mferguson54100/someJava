package program6;

public abstract class Shape {
	
		protected String shapeName;
		protected double area;
		protected double volume;
		
		
		public abstract double getArea();
		public abstract double getVolume();
		public String getShapeName() {
			return shapeName;
		}
		public void setShapeName(String shapeName) {
			this.shapeName = shapeName;
		}
		public void setArea(double area) {
			this.area = area;
		}
		public void setVolume(double volume) {
			this.volume = volume;
		}
		
		
}
