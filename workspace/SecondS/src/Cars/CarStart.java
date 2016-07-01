package Cars;

import processing.core.PApplet;
import processing.core.PVector;

public class CarStart{
	
	//public static void main(String[] args) {
	//	PApplet.main("CarStart");
	//}
	
	float x = 100;
	float y = 100;
	float speed = 1;
	int color = 200;
	PApplet processingContext;
	
	public CarStart(PApplet newProcessingContext, float nx, float ny, float nSpeed)
	{
		processingContext = newProcessingContext;
		x = nx;
		y = ny;
		speed = nSpeed;
	}
	
	
	public void settings(){
		processingContext.size(200,200);
	}
	
	
	
	public void setup(){
		processingContext.background(255);
	}
	
	public void draw(){
		processingContext.background(255);
		display();
		move();
	}
	
	public void display(){
		processingContext.fill(color);
		processingContext.rect(x,y,30,10);
	}
	public void setPublic(float x){
		
	}
	public void move(){
		x = x + speed;
		if(x > processingContext.width){
			x = -30;  //You CAN set locations to be negative!
		}		
	}


	public void setCarColor(PVector pVector) {
		
	}

}