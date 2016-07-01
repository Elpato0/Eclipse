package Cars;

import processing.core.PApplet;
import processing.core.PVector;

public class Car2 extends PApplet{
	
	public static void main(String[] args){
		PApplet.main("Cars.Car2"); // Start the parent program
	}
	
	//Create Object variables, instead of a bunch of value variables. 
	CarStart car1;
	CarStart car2;
	
	public void settings(){
		size(200,200);
	}
	
	public void setup(){
		// Initialize those Objects 
		car1 = new CarStart(this, 25, 100, 2);
		car2 = new CarStart(this, 90, 90, 3);

	}
	
	public void draw(){
		background(255);
		
		// Move EACH car object
		car1.move();
		car2.move();
		// Display EACH car object
		car1.display();
		car2.display();
		
		if(mousePressed || keyPressed){
			car1.setCarColor(new PVector(0,255,0));
			car2.setCarColor(new PVector(0,255,0));
		}
		else{
			car1.setCarColor(new PVector(255,0,0));
		}
		
	}	
	
	
} // End Cars