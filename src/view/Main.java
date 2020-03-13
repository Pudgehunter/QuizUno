package view;

import controler.Controlar;
import processing.core.PApplet;

public class Main extends PApplet {

	Controlar controler;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}
 
	public void settings() {
		size(600,600);
	}
	public void setup() {
		controler = Controlar.getInstanceControl(this);
	}
	public void draw() {
		background(0);
	}
}
