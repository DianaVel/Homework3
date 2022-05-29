package tbc.homework3.rec1;

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
	
	double getArea() {
		return length*width;
	}
	
	double getPerimeter() {
		return 2*(length+width);
	}
	
	public int compareArea(Rectangle rec) {
		if(this.getArea()>rec.getArea()) {
			return 1;
		}else if (this.getArea()<rec.getArea()){
			return -1;
		}else {
			return 0;
		}
	}
}
