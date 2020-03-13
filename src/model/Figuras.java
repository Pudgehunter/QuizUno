package model;

import processing.core.PApplet;

public class Figuras {

	protected int posX;
	protected int posY;
	protected int r;
	protected int dirX;
	protected int dirY;
	PApplet app;
	String txt;
	
	public Figuras(String txt, PApplet app,int posX,int posY,int r) {
		this.txt = txt;
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.dirX = 1;
		this.dirY = 1;
		this.r = r;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public int getDirY() {
		return dirY;
	}

	public void setDirY(int dirY) {
		this.dirY = dirY;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}
	
	
	
}
