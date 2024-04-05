package it.demacs.Composite.Pattern;

import javafx.scene.canvas.Canvas;

public class Cerchio implements Grafica{
	
	private int dim;
	private Canvas can;
	public Cerchio(Canvas can) {
		dim = 50;
		this.can = can;
	}

	
	public void Draw() {
		can.getGraphicsContext2D().clearRect(0,0,can.getWidth(), can.getHeight());
		can.getGraphicsContext2D().fillOval(dim, dim, dim, dim);
		
	}


	@Override
	public void Add(Grafica c) {
		try {
			throw new Exception("Uno");
		} catch (Exception e) {}	
	}


	@Override
	public void Remove(Grafica c) {
	}


	@Override
	public Grafica GetChildren(int n) {
		return null;
	}
	
}
