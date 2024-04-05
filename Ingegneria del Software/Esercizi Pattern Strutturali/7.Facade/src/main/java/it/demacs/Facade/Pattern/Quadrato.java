package it.demacs.Facade.Pattern;

import javafx.scene.canvas.Canvas;

public class Quadrato implements FiguraGeometrica{
	
	private int dim;
	
	public Quadrato() {
		dim = 50;
	}
	
	public 	Quadrato(int dim) {
		this.dim = dim;
	}
	
	public void Disegna(Canvas can) {
		can.getGraphicsContext2D().clearRect(0,0,can.getWidth(), can.getHeight());
		can.getGraphicsContext2D().fillRect(dim, dim, dim, dim);
		
	}
	
	public FiguraGeometrica clone() {
		return new Quadrato(this.dim);
	}

}
