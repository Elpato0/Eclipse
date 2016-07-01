package seconds;
import seconds.Rotate;
import seconds.Light;
import seconds.Ball;
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.shape.Box;
import processing.core.PApplet;
import processing.core.PVector;
import seconds.Box;

public class sketch_3D_ball_collisions extends PApplet {

	ArrayList balls;
	Box = new Box(this);

	PVector location;
	PVector speed;
	int radius;
	boolean light = false;

	public void setting(){
		size (600, 600, P3D);

	}



	public void setup() {
		noSmooth();
		balls = new ArrayList();
		
		for (int i = 0; i < 10; i++) { 
    radius = (int)random( 15, 30);
    speed = new PVector(random( -5, 5), random(5), random(5));
    balls.add(new Box());
  }
}

public void draw() {
  background(0, mouseY, mouseX);
  if (light == true) {
    lights();
  }
 Rotate(this);

  for (int i = 0; i < balls.size() -1; i++) { 
    Ball thisBall = (Ball) balls.get(i);
    thisBall.move();
    thisBall.display();
    thisBall.collide();
  }
  Box.display();
}





public void keyPressed() {
  if (key == 'a') {
    light = true;
  } else if (key == 's') {
    light = false;
  }
}
public static void main(String _args[]) {
	PApplet.main(new String[] { seconds.sketch_3D_ball_collisions.class.getName() });
}

}
