package Shapes;

import Shapes.Rectangle;
import processing.core.PApplet;

public class RectangleMain extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Shapes.RectangleMain");

	}
	Rectangle rect1;
	Rectangle rect2;
	
	public void settings(){
		size(500,500);
	}
	public void setup(){
		rect1 = new Rectangle(this,100,100,10,5);
		rect2 = new Rectangle(this, 200,200,20,7);
		
	}
	public void draw(){
		rect1.paint();
		rect2.paint();
	}


}
