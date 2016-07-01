package BreakOut;

import processing.core.*;
import java.awt.Color;


public class Ball {
	PApplet p;
	float x;
	float y;
	float vX;
	float vY;
	float size;
	Color color;
	/*float red = p.random(1,255);
	float green = p.random(1,255);
	float blue = p.random(1,255);*/

	
	public Ball(PApplet np,float nx, float ny, float nsize, Color c){
		x = nx;
		y = ny;
		size = nsize;
		color = c;
		p = np;
		
		vX = p.random(1,2);
		vY = p.random(-5,-1);
	}
	public void update(){
		x = x + vX;
		y = y + vY;
		
		if(x > p.width - 20 || x < 20){
			vX = -vX;
		}
		
		if(y > p.height - 20 || y < 20){
			vY = -vY;
		}
	}
	
	public void paint(){
		p.noStroke();
		p.fill(color.getRed(), color.getGreen(), color.getBlue());
		//p.fill(p.random(1,255));
		
		p.ellipse(x, y, size, size);
	}
	public float getX(){
		return x;
	}
	public float getY(){
		return y;
	}
	public float getSize(){
		return x;
	}
	public float getVX(){
		return y;
	}

}
