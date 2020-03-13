package model;

import java.util.ArrayList;

import processing.core.PApplet;
import view.Circulos;
import view.rect;

public class Logica {

	PApplet app;
	Figuras figuras;
	String[] txtOne;
	private static Logica logica = null;
	
	private Logica(PApplet app) {
		this.app = app;
		
		txtOne = app.loadStrings("../txt/txtOne.txt");
		for (int i = 0; i < txtOne.length; i++) {
			String[] separador = txtOne[i].split(" ");
			System.out.println(separador[i]);
		}
		for(int i = 0; i < txtOne.length; i++) {
			figuras.add(new Circulos(txtOne[i],this,posX,posY,r));
			figuras.add(new Cuadrados(txtOne[i],this,posX,posY,r));
		}
		
//		this.figuras = new Figuras();
	}
	
	public static Logica getInstanceLogica(PApplet app) {
		if(logica == null) {
			logica = new Logica(app);
		}
		return logica;
	}
	
	public void ejecutarLogica() {
		
	}
	
	
}
