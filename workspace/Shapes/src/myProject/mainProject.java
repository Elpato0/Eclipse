package myProject;

import java.util.Scanner;
import myProject.CheckTriangle;
import processing.core.*;
public class mainProject extends PApplet {
	
	Scanner scanner = new Scanner(System.in);
	CheckTriangle triangle;
	
	

	public static void main(String[] args) {
		PApplet.main("myProject.mainProject");

	}
	public void settings(){
		size(640,360);
	}
	public void setup(){
		background(102);
		//triangle = new CheckTriangle(this,)
		/*System.out.println("Please enter the length of the three sides of a triangle \nSide 1: ");
		text("uij", 70,70);
		double FS = scanner.nextDouble();
		System.out.println("Side 2:");
		double SS = scanner.nextDouble();
		System.out.println("Side 2:");
		double TS = scanner.nextDouble();*/
			}
	public void draw(){
		//pushMatrix();
		//triangle.triangle(x, y, radius, npoints);
		//translate(width*0.5, height*0.5);
		rotate((float) (frameCount / 200.0));
		//triangle.polygon(0,0,50,2);
		//popMatrix();
		noStroke();
		fill(255);
		ellipse(50,50,50,05);
		
	    //pushMatrix();
	    //translate(width*0.5, height*0.5);
		rotate((float) (frameCount / -100.0));
	    //triangle.polygon(0, 0, 10, 7);  // Heptagon
	    //popMatrix();
		
	}
	

}
