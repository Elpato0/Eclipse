package seconds;

import processing.core.PApplet;

public class Box {
	PApplet p;
	int boxsize = 300;

	public Box(PApplet np) {
		p=np;
	}  
	

	public void display() {
	    p.stroke(0);
	    p.fill(0, 10);
	    p.box(boxsize);
	  }

}
