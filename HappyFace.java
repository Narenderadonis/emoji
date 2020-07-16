package happyFace;
import processing.core.*;

public class HappyFace extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("happyFace.HappyFace");
	}
	
	public void settings() {
		size(500, 500);
		
		
	}
	public void draw() {
		background(200, 200,200);
		fill(255,255,0);
		ellipse(250, 250, 400, 400);
		fill(0,0,0);
		ellipse(140,170,70,55);
		fill(0,0,0);
		
		ellipse(350,170,70,55);
		arc(250, 330, 150, 90, 0,PI);
	}
	
	

}
