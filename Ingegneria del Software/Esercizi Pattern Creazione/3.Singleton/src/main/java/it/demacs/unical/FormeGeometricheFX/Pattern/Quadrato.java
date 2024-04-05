package it.demacs.unical.FormeGeometricheFX.Pattern;

import javafx.scene.canvas.Canvas;

public class Quadrato implements FiguraGeometrica{
	
private static Quadrato instance = null;
	
	private Quadrato() {

	}
	
	public static Quadrato getInstance() {
		if(instance == null)
			instance = new Quadrato();
		return instance;
	}

	public void Disegna(Canvas can) {
		can.getGraphicsContext2D().clearRect(0,0,can.getWidth(), can.getHeight());
		can.getGraphicsContext2D().fillRect(50, 50, 50, 50);
		
	}

}
