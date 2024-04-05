package it.demacs.unical.FormeGeometricheFX.Pattern;

import javafx.scene.canvas.Canvas;

public class Cerchio implements FiguraGeometrica{
	
	private static Cerchio instance = null;
	
	private Cerchio() {
		
	}
	
	public static Cerchio getInstance() {
		if(instance == null)
			instance = new Cerchio();
		return instance;
	}

	public void Disegna(Canvas can) {
		can.getGraphicsContext2D().clearRect(0,0,can.getWidth(), can.getHeight());
		can.getGraphicsContext2D().fillOval(50, 50, 50, 50);
	}
}
