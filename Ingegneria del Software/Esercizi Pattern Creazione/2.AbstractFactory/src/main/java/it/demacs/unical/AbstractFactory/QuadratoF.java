package it.demacs.unical.AbstractFactory;

import it.demacs.unical.AbstractFactory.Pattern.Quadrato;
import it.demacs.unical.AbstractFactory.Pattern.QuadratoPieno;
import it.demacs.unical.AbstractFactory.Pattern.QuadratoVuoto;
import javafx.scene.canvas.Canvas;

public class QuadratoF implements AbstractFactory{

	
	Quadrato quadrato = null;
	
	@Override
	public void DisegnaPieno(Canvas c) {
		quadrato = new QuadratoPieno();
		quadrato.Disegna(c);
	}

	@Override
	public void DisegnaVuoto(Canvas c) {
		quadrato = new QuadratoVuoto();
		quadrato.Disegna(c);
	}

}
