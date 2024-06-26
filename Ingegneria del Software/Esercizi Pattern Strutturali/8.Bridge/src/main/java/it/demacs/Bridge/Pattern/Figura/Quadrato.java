package it.demacs.Bridge.Pattern.Figura;

import it.demacs.Bridge.Pattern.Pieno.FiguraGeometricaImp;
import javafx.scene.canvas.Canvas;

public class Quadrato extends FiguraGeometrica{
	
	public Quadrato(FiguraGeometricaImp impl) {
		super(impl);
	}


	private int dim = 50;
	private int x = 20, y = 20;

	@Override
	public void disegna(Canvas can) {
		can.getGraphicsContext2D().clearRect(0, 0, can.getWidth(), can.getHeight());
		if(impl.getPieno())
			can.getGraphicsContext2D().fillRect(x, y, dim, dim);
		else can.getGraphicsContext2D().strokeRect(x, y, dim, dim);
		
	}

}
