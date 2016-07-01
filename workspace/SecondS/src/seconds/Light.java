package seconds;
import seconds.sketch_3D_ball_collisions;
import seconds.Ball;
import processing.core.PApplet;

public class Light  {
	 PApplet p;

	public void light(PApplet np) {
		p = np;
		  //lights();
		  // Orange point light on the right
		  p.pointLight(150, 100, 0, // Color
		  200, -150, 0); // Position
		 
		  // Blue directional light from the left
		  p.directionalLight(0, 102, 255, // Color
		  1, 0, 0); // The x-, y-, z-axis direction
		 
		  // Yellow spotlight from the front
		  p.spotLight(255, 255, 109, // Color
		0, 40, 200, // Position
		  0, -0.5, -0.5, // Direction
		  p.PI / 2, 2); // Angle, concentration
		}

	
		
	

	

}
