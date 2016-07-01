package F;

import processing.core.*;
import sun.audio.*;
import java.io.*;
import java.util.*;
import F.BallFlock;
import F.Boid;

public class Flock extends PApplet {
	public static void main(String[] args) {
		PApplet.main("F.Flock");

	}
	 ArrayList<Boid> boids;
	//Boid boid;
	Flock flock;
	BallFlock ball;
	int Lose = 0;
	int start;
	float timer;
	public void settings(){

		 size(640, 360);
	}

	public Flock() {
		boids = new ArrayList<Boid>(); // Initialize the ArrayList
	}
	
	public void setup() {
		background(50);
		start = millis();
		try{
			String DS3 = "/Users/Student/desktop/DS3.wav";
			InputStream in = new FileInputStream(DS3);
			AudioStream audioStream = new AudioStream(in);
			AudioPlayer.player.start(audioStream);
		}catch(Exception e){System.out.println(e.toString());};
		
	  // Add an initial set of boids into the system
	  for (int i = 0; i < 50; i++) {
	    boids.add(new Boid(this,width/2,height/2));
	    
	    
	  }
	  ball = (new BallFlock(this,mouseX,mouseY,10));
	}

	public void draw() {
		
	  background(50);
	  Collision();
	  if(Lose == 0){
		  ball.paint();
		  timer = millis()-start;
		  for(Boid b : boids){
			  b.run(boids);
	  }
	  }
	 
		 // text("HI",mouseX,mouseY);
		  
	  
	  
	 // ball.update();
	}

	// Add a new boid into the System
	



	// The Flock (a list of Boid objects)
	
	 


	 

	 public void run() {

	    for (Boid b : boids) {
	      b.run(boids);  // Passing the entire list of boids to each boid individually
	     
	    }
	   
	  }
	 public void Collision(){
		
			
		 for(int i = 0; i < boids.size(); i++){			
			 Boid b = boids.get(i);
			 
			/*  if(ball.getX() < b.getXB() 
				&& ball.getX() > b.getXB()+b.getWidth()){
					background(0);
					text("youlost2",width/2,height/2);
					textSize(50);
					
				}
				*/
			if(ball.getX() + (ball.getSize()/2) > b.getXB()
					&& ball.getX() > b.getXB()
					&&(ball.getX()+ (ball.getSize())) > b.getXB()
					//&& ball.getX() > b.getWidth()
					&& ball.getY() < b.getHeight()
					&& ball.getY() < (b.getYB())
					&& ball.getY() < (b.getYB() + b.getHeight()) 
					&&(ball.getX() + (ball.getSize()/2)) < b.getXB() + b.getWidth()) {
						
						Lose++;
						break;
					}
			if(Lose > 0){
				
				break;
			}
		 }
		 if(Lose > 0 ){
			 background(0);
			
			 text("You survived " + timer/1000 + " seconds.",180,height/2);
			 textSize(20);
			 
		 }
		}


	


}
