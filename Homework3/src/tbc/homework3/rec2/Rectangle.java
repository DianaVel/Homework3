package tbc.homework3.rec2;

public class Rectangle {
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	protected double getPerimeter() {
		return 2*(length+width);
	}
	
	public int comparePerimeter(Rectangle rec1, Rectangle rec2) {
		if(rec1.getPerimeter()>rec2.getPerimeter()) {
			return 1;
		}else if (rec1.getPerimeter()<rec2.getPerimeter()){
			return -1;
		}else {
			return 0;
		}
	}
}
