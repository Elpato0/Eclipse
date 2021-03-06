package myProject;

import processing.core.*;
import java.util.Scanner;

public class CheckTriangle {
	Scanner scanner = new Scanner(System.in);
	PApplet p;
	float FS = scanner.nextFloat();
	float SS = scanner.nextFloat();
	float TS = scanner.nextFloat();
	
	public  CheckTriangle(PApplet tempP,float tempFS, float tempSS, float tempTS){
		p = tempP;
		FS = tempFS;
		SS = tempSS;
		TS = tempTS;
	}

	public void polygon(float x, float y, float radius, int npoints) {
		float angle = (float) ((2 * Math.PI) / npoints);
		p.beginShape();
		for (float a = 0; a < (2 * Math.PI); a += angle) {
				float sx = (float) (x + Math.cos(a) * radius);
				float sy = (float) (y + Math.sin(a) * radius);
				p.vertex(sx, sy);
  }
		p.endShape(npoints);
}
	/*public void triangle(float x, float y, float radius, int npoints) {
		float angle = (float) ((2 * Math.PI) / npoints);
		p.beginShape();
		for (float a = 0; a < (2 * Math.PI); a += angle) {
				float sx = (float) (x + Math.cos(a) * radius);
				float sy = (float) (y + Math.sin(a) * radius);
				p.vertex(sx, sy);
  }
		p.endShape();
}*/
	public static float biggest(int FS, int SS, int TS) {


		if(FS > SS && FS > TS){

		return FS ;

		}

		else if(SS > FS && SS > TS){

		return SS ;

		}

		else{

		return TS ;

		}

		}

		private static float smallest(int FS, int SS, int TS ){

		if(FS < SS && FS < TS){

		return FS ;

		}

		else if(SS < FS && SS < TS){

		return SS ;

		}

		else{

		return TS ;

			}

	}

		private static float between(int FS, int SS, int TS ){

		if((FS > SS && FS < TS)||(FS < SS && FS > TS)){

		return FS;

		}

		else if((SS > FS && SS < TS)||(SS < FS && SS > TS)){

		return SS;

		}

		else{

		return TS;

			}	

	}

		  public boolean isTriangleChecker(float a, float b, float c) {

		  if((a+b)>c && (a+c)>b && (b+c)>a) {

		    return true;

		  }

		  else {

		    return false;

		    	}
	}
		  public float getFS(){
				return FS;
			}
			public float getSS(){
				return SS;
			}
}

