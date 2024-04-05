package it.demacs.unical.AbstractFactory.Pattern;

import javafx.scene.canvas.Canvas;

public class QuadratoVuoto implements Quadrato{

	@Override
	public void Disegna(Canvas can) {
		can.getGraphicsContext2D().clearRect(0,0,can.getWidth(), can.getHeight());
		can.getGraphicsContext2D().strokeRect(50, 50, 50, 50);		
	}
}
