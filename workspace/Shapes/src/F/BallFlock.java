package F;

import processing.core.*;
import java.awt.Color;


public class BallFlock {
	PApplet p;
	float x;
	float y;
	
	float size;
	Color color;
	/*float red = p.random(1,255);
	float green = p.random(1,255);
	float blue = p.random(1,255);*/

	
	public BallFlock(PApplet np,float nx, float ny, float nsize){
		x = nx;
		y = ny;
		size = nsize;
		//color = c;
		p = np;
		
	}
	
	
	public void paint(){
		//p.noStroke();
		//p.fill(color.getRed(), color.getGreen(), color.getBlue());
		//p.fill(p.random(1,255));
		
		p.ellipse(p.mouseX, p.mouseY, size, size);
	}
	public float getX(){
		return x;
	}
	public float getY(){
		return y;
	}
	public float getSize(){
		return size;
	}
	

}
