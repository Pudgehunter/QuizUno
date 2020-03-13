package model;

import processing.core.PApplet;

public class Cuadrados extends Figuras{

	
	public Cuadrados(String txt, PApplet app,int posX,int posY,int r) {
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
	
	public void dibujarCuadrados() {
		this.app.fill(255,255,0);
		this.app.rect(posX, posY, r, r);
	}
	
	
}
