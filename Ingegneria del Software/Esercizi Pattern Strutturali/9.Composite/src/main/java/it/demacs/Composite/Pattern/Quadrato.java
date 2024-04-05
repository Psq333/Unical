package it.demacs.Composite.Pattern;

import javafx.scene.canvas.Canvas;

public class Quadrato implements Grafica{
	
	private int dim;
	
	private Canvas can;
	public Quadrato(Canvas can) {
		dim = 50;
		this.can = can;
	}


	@Override
	public void Draw() {
		can.getGraphicsContext2D().clearRect(0,0,can.getWidth(), can.getHeight());
		can.getGraphicsContext2D().fillRect(dim, dim, dim, dim);
		
	}

	@Override
	public void Add(Grafica c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Remove(Grafica c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Grafica GetChildren(int n) {
		return null;
		// TODO Auto-generated method stub
		
	}
	
}
