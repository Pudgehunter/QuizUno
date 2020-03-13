package controler;

import model.Logica;
import processing.core.PApplet;

public class Controlar {

	private static Controlar controler = null;
	PApplet app;
	Logica logica;
	
	
	private Controlar(PApplet app) {
		this.app = app;
		this.logica = Logica.getInstanceLogica(app);
	}
	
	public static Controlar getInstanceControl(PApplet app) {
		if(controler == null) {
			controler = new Controlar(app);
		}
		return controler;
	}
	
	
}
