package it.demacs.Adapter.Pattern;

import javafx.scene.canvas.Canvas;

public class Quadrato extends Disegno implements FiguraGeometrica{
	
	private int dim;
	private int x = 20, y = 20;
	
	public Quadrato() {
		dim = 50;
	}
	
	public 	Quadrato(int dim) {
		this.dim = dim;
	}
	
	public void Disegna(Canvas can) {
		disegna(can, x, y, x+dim, y);
		disegna(can, x+dim, y+dim, x+dim, y);
		disegna(can, x, y+dim, x+dim, y+dim);
		disegna(can, x, y, x, y+dim);
		
	}

}
