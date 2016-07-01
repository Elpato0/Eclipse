package BreakOut;

import java.awt.Color;
import java.util.ArrayList;
import Shapes.Ball;
import Shapes.Rectangle;
import processing.core.PApplet;

public class Breakout extends PApplet {
	Rectangle paddle;
	Ball ball;
	//Rectangle rect;
	ArrayList < Rectangle > bricks = new ArrayList < Rectangle >();
	public static void main(String[] args) {
		PApplet.main("BreakOut.Breakout");

	}
	public void settings(){

		size(400,600);
	}
	public void setup(){
		paddle = new Rectangle(this,200,550,20,60);
		ball = new Ball(this,width/2,height/2,20,Color.MAGENTA);	
		//rect = new Rectangle(this,mouseX,mouseY,10,5);
		background(255);
		addBricks();
	}
	public void draw(){
		fill(0,0,0,15);
		rect(0,0,width,height);
		
		ball.update();
		ball.paint();
		paddle.paint();
		UpdatePaddle();
		drawBricks();
		updateAll();
	}
	public void updateAll(){
		if(ball.getX() > paddle.getX()
			&& ball.getX() < paddle.getX() + 60
			&& ball.getY() + ball.getSize()/2 > paddle.getY()){
			ball.setVelocity(ball.getvX(), - ball.getvY());
			
		}
		for(int i = 0; i < bricks.size(); i++){
			
			Rectangle b = bricks.get(i);
			
			if(ball.getX() + (ball.getSize()/2) > b.getX() 
			&&(ball.getX() + (ball.getSize()/2)) < b.getX() + b.getWidth()
			&& ball.getY() < (b.getY() + b.getHeight())){
				ball.setVelocity(ball.getvX(), -ball.getvY());
				bricks.remove(b);
			}
			
		}
		if(ball.getY() > height - 40){
			background(0);
			text("you lost",width/2, height/2);
			ball.setVelocity(0, 0);
		}
		if(bricks.size() < 1){
			background(0);
			text("you WON",width/2, height/2);
			ball.setVelocity(0, 0);
		}
	}
	public void UpdatePaddle(){
		paddle.setX(mouseX - 30);
		paddle.paint();
	}
	public void addBricks(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10;j++){
				bricks.add(new Rectangle(this,40 * i, 100 + 15 * j, 10, 35));
			}
		}
	}
	public void drawBricks(){
		for(int i = 0; i < bricks.size();i++){
			bricks.get(i).paint();
		}
	}
	}