package Shapes;
import Shapes.Ball;
import processing.core.PApplet;
import java.awt.Color;
import java.util.ArrayList;

public class BallMain extends PApplet {
	public static void main(String[] args) {
		PApplet.main("Shapes.BallMain");

	}
	ArrayList<Ball> ball = new ArrayList<Ball>();
	//Ball[] ball = new Ball[255];
	Ball ball2;
	
	public void settings(){
		size(500,500);
		noSmooth();
	}
	public void setup(){
		for(int i = 0; i < 500; i++){
		//ball[i] = new Ball(this, 400,250,20,Color.RED);
			ball.add(new Ball(this, 400, 250, 20,Color.RED));
		//ball2 = new Ball(this, 400,250,50,Color.GREEN);
		}
		
	}
	public void draw(){
		background(255);
		for(int i = 0; i < ball.size(); i++){
		ball.get(i).paint();
		ball.get(i).update();
		}
		if(mousePressed){
			ball.add(new Ball(this, mouseY,mouseX,40,Color.MAGENTA));
		}
		//ball2.paint();
		//ball2.update();
		
	}

	

}
