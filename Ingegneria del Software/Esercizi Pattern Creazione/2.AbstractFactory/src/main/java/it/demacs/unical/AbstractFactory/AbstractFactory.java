package it.demacs.unical.AbstractFactory;

import javafx.scene.canvas.Canvas;

public interface AbstractFactory {
	
	@SuppressWarnings("exports")
	public void DisegnaPieno(Canvas c);
	
	@SuppressWarnings("exports")
	public void DisegnaVuoto(Canvas c);
	
}