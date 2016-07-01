package seconds;
import seconds.sketch_3D_ball_collisions;
import seconds.Light;
import seconds.Ball;
import seconds.Ball;
import processing.core.PApplet;

public class Rotate {
	float xmag, ymag = 0;
	float newXmag, newYmag = 0;
	 PApplet p;
	public void Rotate(PApplet np){
		
		p=np;
		
		
	    p.translate(p.width/2,p.height/2,0);
	   
	  newXmag = p.mouseX/  (p.width) * p.TWO_PI;
	  newYmag = p.mouseY/(p.height) * p.TWO_PI;
	  float diff = xmag-newXmag;
	  if (p.abs(diff) >  0.01) {
	    xmag -= diff/4.0;
	  }
	  diff = ymag-newYmag;
	  if (p.abs(diff) >  0.01) {
	    ymag -= diff/4.0;
	  }
	  p.rotateX(-ymag);
	  p.rotateY(-xmag);
	}

	

}
