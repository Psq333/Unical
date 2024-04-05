package it.demacs.unical.FormeGeometricheFX.Pattern;

import javafx.scene.canvas.Canvas;

public class Cerchio implements FiguraGeometrica{
	
	private int dim;
	
	public Cerchio() {
		dim = 50;
	}
	
	public Cerchio(int dim) {
		this.dim = dim;
	}
	
	public void Disegna(Canvas can) {
		can.getGraphicsContext2D().clearRect(0,0,can.getWidth(), can.getHeight());
		can.getGraphicsContext2D().fillOval(dim, dim, dim, dim);
		
	}
	
	public FiguraGeometrica clone() {
		return new Cerchio(this.dim);
	}
}
