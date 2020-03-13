package model;

import processing.core.PApplet;

public class Circulos extends Figuras {
	
	
	
	public Circulos(String txt, PApplet app,int posX,int posY,int r) {
		super(txt,app,posX,posY,r);
	}
	
	public void mover() {
		this.posX = this.posX + this.dirX;
		this.posY = this.posY + this.dirY;
	}
	
	public void chocar() {
		this.dirX *= 1;
		this.dirY *= 1;
	}
	
	public void dibujarCirculos() {
		this.app.fill(255,255,0);
		this.app.ellipse(posX, posY, r, r);
	}
	
	
	
}



