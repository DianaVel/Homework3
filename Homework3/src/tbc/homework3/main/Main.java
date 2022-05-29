package tbc.homework3.main;
import tbc.homework3.rec1.Rectangle;


public class Main {

	public static void main(String[] args) {
// Creating first type of rectangle objects and comparing their areas.		
		Rectangle rec1= new Rectangle ();
		rec1.setLength(5);
		rec1.setWidth(8);
		
		Rectangle rec2 = new Rectangle();
		rec2.setLength(4);
		rec2.setWidth(3);
		
		System.out.println(rec1.compareArea(rec2));

// Creating second type of rectangle objects and comparing their perimeters. 		
		tbc.homework3.rec2.Rectangle rect1 = new tbc.homework3.rec2.Rectangle();
		rect1.setLength(4);
		rect1.setWidth(6);
		
		tbc.homework3.rec2.Rectangle rect2 = new tbc.homework3.rec2.Rectangle();
		rect2.setLength(7);
		rect2.setWidth(6);
		
		System.out.println(rect1.comparePerimeter(rect1, rect2));
		
	}

}
